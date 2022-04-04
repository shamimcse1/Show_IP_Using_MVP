package com.codercamp.showipusingmvp.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.codercamp.showipusingmvp.helper.DataResource;
import com.codercamp.showipusingmvp.model.ServerResponse;
import com.codercamp.showipusingmvp.network.ApiInterface;
import com.codercamp.showipusingmvp.network.RetrofitApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IPRepository {
    ApiInterface apiInterface;
    private MutableLiveData<DataResource<ServerResponse>> mutableLiveData = new MutableLiveData<DataResource<ServerResponse>>();
    public LiveData<DataResource<ServerResponse>> liveData = mutableLiveData;

     public  void  getIP(){

         apiInterface = RetrofitApiClient.getRetrofit().create(ApiInterface.class);

         Call<ServerResponse> call = apiInterface.getApiData();

         call.enqueue(new Callback<ServerResponse>() {
             @Override
             public void onResponse(Call<ServerResponse> call, Response<ServerResponse> response) {
                 if(response.code() == 200 && response.body() != null){
                     mutableLiveData.postValue(DataResource.success(response.body()));
                 }
                 else {
                     mutableLiveData.postValue(DataResource.error(response.message()));
                 }
             }

             @Override
             public void onFailure(Call<ServerResponse> call, Throwable t) {
                 mutableLiveData.postValue(DataResource.error(t.getMessage()));
             }
         });
     }

}
