package com.example.basedemo;

import com.example.base.model.BaseModel;
import com.example.library.net.NetObserver;
import com.example.library.net.RetrofitUtils;

import java.util.HashMap;
import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class UserModel extends BaseModel {
    public void load(UserImpl i) {
        Map<String, Object> map = new HashMap<>();
        ApiService apiService = RetrofitUtils.create(ApiService.class, "");
        apiService.getUserList(map).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new NetObserver<UserEntity>(new NetObserver.ResponseListener<UserEntity>() {

                    @Override
                    public void Sucess(UserEntity userEntity) {
                        i.sucess(userEntity);
                    }

                    @Override
                    public void Fail(String message) {
                    }
                }));
    }

}
