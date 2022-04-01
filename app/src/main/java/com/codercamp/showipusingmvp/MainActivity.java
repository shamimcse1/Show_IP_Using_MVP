package com.codercamp.showipusingmvp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.codercamp.showipusingmvp.network.ApiInterface;
import com.codercamp.showipusingmvp.network.RetrofitApiClient;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.addLogAdapter(new AndroidLogAdapter());
        textView = findViewById(R.id.txtView);

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading....");

        ShowAllData();
    }

    public void ShowAllData() {
        Logger.d("Show Method");
        //progressDialog.show();

        ApiInterface apiInterface = RetrofitApiClient.getRetrofit().create(ApiInterface.class);

        Call<ServerResponse> call = apiInterface.getApiData();
        call.enqueue(new Callback<ServerResponse>() {
            @Override
            public void onResponse(Call<ServerResponse> call, Response<ServerResponse> response) {
                // progressDialog.dismiss();

                ServerResponse serverResponse = response.body();
                if (response.code() == 200 && serverResponse != null) { //response code 200 means server call successful
                    //data found. So place the data into TextView

                } else {

                }
            }

            @Override
            public void onFailure(Call<ServerResponse> call, Throwable t) {
                Logger.d(t.getMessage());
            }
        });
    }
}