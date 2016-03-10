package com.personal.liumn.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class NightCatService extends Service
{
    public NightCatService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
