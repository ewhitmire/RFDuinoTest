package com.lannbox.rfduinotest;

import android.app.Fragment;
import android.content.ServiceConnection;
import android.os.Bundle;

public class RetainedFragment extends Fragment {

    // data object we want to retain
    private ServiceConnection retainedConnection;

    // this method is only called once for this fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);
    }

    public void setData(ServiceConnection connection) {
        this.retainedConnection = connection;
    }

    public ServiceConnection getData() {
        return retainedConnection;
    }
}