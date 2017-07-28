package com.example.weatherdemo;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by LvShao on 2017/7/28.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
