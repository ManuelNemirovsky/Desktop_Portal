package com.example.user.blothoothsender;

import android.app.Service;
import android.content.Intent;
import android.gesture.Gesture;
import android.os.IBinder;

/**
 * Created by Manuel on 6/21/2018.
 */
public class myService extends Service {

    @Override
    public void onCreate()
    {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        return START_STICKY;
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }
}
