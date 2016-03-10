package com.personal.liumn.nightcat;

import android.app.Application;

/**
 * Created by liumn on 2016/3/10.
 */
public class NightCatApplication extends Application
{
    private static NightCatApplication instance;

    public NightCatApplication()
    {
        instance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static NightCatApplication getInstance() {
        return instance;
    }

}
