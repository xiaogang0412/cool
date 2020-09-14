package com.example.base.presenter;

import com.example.base.model.BaseModel;
import com.example.base.view.BaseView;

public abstract class BasePresenter<V extends BaseView,M extends BaseModel> {
    protected V baseView;
    protected M model;
    public BasePresenter(){
        model=createModel();
    }

    protected abstract M createModel();
    // 设置View实例
    public void attachView(V view) {
        this.baseView=view;
    }

    public void detachView(){
        this.baseView = null;
    }

}
