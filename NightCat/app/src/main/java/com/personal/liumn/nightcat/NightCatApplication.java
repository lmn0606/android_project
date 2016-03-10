package com.personal.liumn.nightcat;

import android.app.Application;

import org.xutils.x;

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

        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);

    }

    public static NightCatApplication getInstance() {
        return instance;
    }

}
