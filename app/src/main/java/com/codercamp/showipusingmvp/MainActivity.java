package com.codercamp.showipusingmvp;

import android.app.ProgressDialog;

import androidx.lifecycle.ViewModelProvider;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import com.codercamp.showipusingmvp.helper.DataResource;
import com.codercamp.showipusingmvp.model.ServerResponse;
import com.codercamp.showipusingmvp.network.ApiInterface;
import com.codercamp.showipusingmvp.viewModel.IPViewModel;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private TextView textView;
    ApiInterface apiInterface;
    IPViewModel ipViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.addLogAdapter(new AndroidLogAdapter());
        textView = findViewById(R.id.txtView);

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading....");

        ipViewModel = new ViewModelProvider(this).get(IPViewModel.class);
        ipViewModel.loadIp();


        ipViewModel.IpLiveData.observe(this, new Observer<DataResource<ServerResponse>>() {
            @Override
            public void onChanged(@Nullable @androidx.annotation.Nullable DataResource<ServerResponse> serverResponseDataResource) {
                
            }
        });



    }


}