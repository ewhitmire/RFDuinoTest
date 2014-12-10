package com.lannbox.rfduinotest;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ServiceConnection;

public class BTLEBundle
{
    public ServiceConnection connection;
    public RFduinoService service;
    public BluetoothDevice device;
    public BluetoothAdapter adapter;
    public int state_;
    public boolean isBound;

    public BTLEBundle(){
        connection = null;
        service = null;
        device = null;
        adapter = null;
        state_ = 0;
        isBound = false;
    }

}
