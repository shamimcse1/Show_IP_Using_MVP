package com.codercamp.showipusingmvp.network;

import com.codercamp.showipusingmvp.ServerResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/json")
    Call<ServerResponse> getApiData();
}
