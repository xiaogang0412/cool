package com.example.library.interceptor;

import com.example.library.utils.NetWorkUtils;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class CacheInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (NetWorkUtils.isConnected()) {
            Response response = chain.proceed(request);
            return response.newBuilder().removeHeader("Pragma").
                    removeHeader("Cache-Control").
                    header("Cache-Control",
                            "public,max-age=" + 10).build();
        } else {
            request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE)
                    .build();
            int maxStale = 60 * 60 * 24 * 3;
            Response response = chain.proceed(request);
            return response.newBuilder().removeHeader("pragMa").
                    removeHeader("Cache-Control").addHeader(
                    "Cache-Control", "public,only-if-cached,max-state=" + maxStale).build();

        }

    }
}
