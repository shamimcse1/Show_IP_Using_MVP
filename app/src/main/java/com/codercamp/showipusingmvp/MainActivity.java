package com.codercamp.showipusingmvp;

import android.app.ProgressDialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.codercamp.showipusingmvp.databinding.ActivityMainBinding;
import com.codercamp.showipusingmvp.helper.DataResource;
import com.codercamp.showipusingmvp.model.ServerResponse;
import com.codercamp.showipusingmvp.network.ApiInterface;
import com.codercamp.showipusingmvp.viewModel.IPViewModel;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    ActivityMainBinding binding;
    IPViewModel ipViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Logger.addLogAdapter(new AndroidLogAdapter());

        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading....");

        ipViewModel = new ViewModelProvider(this).get(IPViewModel.class);
        ipViewModel.loadIp();

        ipViewModel.IpLiveData.observe(this, new Observer<DataResource<ServerResponse>>() {
            @Override
            public void onChanged(DataResource<ServerResponse> serverResponse) {

                switch (serverResponse.getStatus()) {
                    case SUCCESS:
                        progressDialog.dismiss();
                        binding.ipAddress.setText(String.valueOf("IP Address : " + serverResponse.getActualData().getIp()));
                        binding.ipAddressDecimal.setText(String.valueOf("IP Address Decimal " + serverResponse.getActualData().getIpDecimal()));
                        binding.country.setText("Country : " + serverResponse.getActualData().getCountry());
                        binding.isoCode.setText("Country Iso : " + serverResponse.getActualData().getCountryIso());
                        binding.latitude.setText(String.valueOf("Latitude : " + serverResponse.getActualData().getLatitude()));
                        binding.longitude.setText(String.valueOf("Longitude : " + serverResponse.getActualData().getLongitude()));
                        binding.timeZone.setText("Time Zone : " + serverResponse.getActualData().getTimeZone());

                        break;
                    case ERROR:
                        Toast.makeText(MainActivity.this, "No Internet!! Please try again", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        break;
                    case LOADING:
                        progressDialog.show();
                        break;
                }
            }
        });
    }


}