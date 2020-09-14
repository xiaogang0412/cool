package com.example.library.net;

import android.content.Context;

import com.example.library.config.NetConfig;
import com.example.library.interceptor.CacheInterceptor;
import com.example.library.interceptor.LoggerInterceptor;
import com.example.library.utils.AppUtils;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtils {
    private static Retrofit retrofit;
    private static RetrofitUtils RetrofitUtils;
    private static Context context;
    private static NetConfig config;

    public RetrofitUtils() {
    }


    public static RetrofitUtils getInstance() {
        if (RetrofitUtils == null) {
            synchronized (RetrofitUtils.class) {
                if (RetrofitUtils == null) {
                    RetrofitUtils = new RetrofitUtils();
                }
            }
        }
        return RetrofitUtils;
    }

    public  void init(NetConfig netConfig){
        context = AppUtils.getContxt();
       config = netConfig;

    }

    public static OkHttpClient getOkhttpClient(final String token) {
        Cache cache = new Cache(context.getCacheDir(), 10 * 1024 * 1024);
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .readTimeout(config.readTimeOut, TimeUnit.SECONDS).cache(cache)
                .connectTimeout(config.connectTimeOut, TimeUnit.SECONDS).writeTimeout
                        (config.writeTimeOut, TimeUnit.SECONDS).addInterceptor(LoggerInterceptor
                        .getLoggerInterceptor()).addInterceptor(new Interceptor() {
                    @NotNull
                    @Override
                    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
                        Request builder = chain.request().newBuilder().addHeader("Authorization",
                                "Bearer " + token).build();
                        return chain.proceed(builder);
                    }
                });
        if (config.cache) {
            builder.cache(cache);
            builder.addInterceptor(new CacheInterceptor());
        }
        OkHttpClient okHttpClient = builder.build();
        return okHttpClient;
    }

    public static <T> T create(Class<T> t,String token) {
        retrofit = new Retrofit.Builder().baseUrl(config.hostName)
                .addConverterFactory(GsonConverterFactory.create()).
                        client(getOkhttpClient(token)).addCallAdapterFactory
                        (RxJavaCallAdapterFactory.create()).build();
        return retrofit.create(t);
    }



}
