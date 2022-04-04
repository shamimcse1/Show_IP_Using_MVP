package com.codercamp.showipusingmvp.viewModel;

import android.arch.lifecycle.LiveData;

import androidx.lifecycle.ViewModel;

import com.codercamp.showipusingmvp.helper.DataResource;
import com.codercamp.showipusingmvp.model.ServerResponse;
import com.codercamp.showipusingmvp.repository.IPRepository;

public class IPViewModel extends ViewModel {

    IPRepository ipRepository = new IPRepository();

    public LiveData<DataResource<ServerResponse>> IpLiveData = ipRepository.liveData;

    public void  loadIp(){
        ipRepository.getIP();
    }
}
