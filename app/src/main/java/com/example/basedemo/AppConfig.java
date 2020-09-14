package com.example.basedemo;

import android.content.Context;

import com.example.library.config.NetConfig;
import com.example.library.net.RetrofitUtils;
import com.example.library.utils.AppUtils;

public class AppConfig {
    public static void config(Context context){
        AppUtils.init(context);
        netConfig();
    }

    private static void netConfig() {
        NetConfig config= new NetConfig.Builder().cache(false).
                connectTimeOut(10000).hostName(BuildConfig.HOST)
                .writeTimeOut(10000).readTimeOut(10000).build();
        RetrofitUtils.getInstance().init(config);
    }
}
