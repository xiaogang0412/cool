package com.example.basedemo;

import android.app.Application;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.base.model.BaseMMViewModel;
import com.example.library.net.NetObserver;
import com.example.library.net.RetrofitUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class StudentModel extends BaseMMViewModel {
public MutableLiveData<UserEntity> liveData=new MutableLiveData<>();
    public StudentModel(@NonNull Application application) {
        super(application);
    }
    public void load() {
        Map<String, Object> map = new HashMap<>();
        ApiService apiService = RetrofitUtils.create(ApiService.class, "");
        apiService.getUserList(map).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new NetObserver<UserEntity>(new NetObserver.ResponseListener<UserEntity>() {

                    @Override
                    public void Sucess(UserEntity userEntity) {
                      liveData.setValue(userEntity);

                    }

                    @Override
                    public void Fail(String message) {
                    }
                }));
    }
    public void changleData(View view){
        UserEntity value = liveData.getValue();
        List<UserEntity.RecGoodsListBean> recGoodsListBean = value.getRecGoodsList();
        UserEntity.RecGoodsListBean recGoodsListBean1 = recGoodsListBean.get(0);
        recGoodsListBean1.setGoodsImg(12212121+"");
        recGoodsListBean.set(0,recGoodsListBean1);
    value.setRecGoodsList(recGoodsListBean);
    liveData.setValue(value); }
    public boolean isEmpty(){
        Log.i("wewewewe","w22323");
        if(liveData.getValue()!=null) {
            if (liveData.getValue().getRecGoodsList().size() != 0) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

}
