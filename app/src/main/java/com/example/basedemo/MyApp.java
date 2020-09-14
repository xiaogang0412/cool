package com.example.basedemo;

import android.app.Application;


public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppConfig.config(this);
    }
}
