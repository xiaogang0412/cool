package com.example.library.utils;

import android.content.Context;

public class AppUtils {
    private static Context context;

    private AppUtils() {

    }

    public static Context getContxt() {
        return context;
    }

    public static void init(Context context1) {
        context = context1;
    }
}
