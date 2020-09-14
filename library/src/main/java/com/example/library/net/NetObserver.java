package com.example.library.net;

import com.example.library.base.BaseResponse;

import rx.Observer;

public class NetObserver<T> implements Observer<BaseResponse<T>> {
    private ResponseListener listener;

    public NetObserver(ResponseListener listener) {
        this.listener = listener;
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        listener.Fail(e.getMessage());


    }

    @Override
    public void onNext(BaseResponse<T> tBaseResponse) {
        listener.Sucess(tBaseResponse.getEntity());
    }
    public interface ResponseListener<T>{
        void Sucess(T t);
        void Fail(String message);
    }
}
