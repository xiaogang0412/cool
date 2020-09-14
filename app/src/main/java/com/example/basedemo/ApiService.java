package com.example.basedemo;

import com.example.library.base.BaseResponse;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * @author lxg
 */
public interface ApiService {
    /**
     * @return
     */
    @GET("app/tk/app/getHomePage")
    Observable<BaseResponse<UserEntity>> getUserList(@QueryMap  Map<String,Object> map);
}
