package com.example.base.presenter;

import com.example.base.model.BaseModel;
import com.example.base.view.BaseView;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class BasePresenter<V extends BaseView,M extends BaseModel> {
    protected V baseView;
    protected M model;
    protected Reference<V> mVieRef;
    public BasePresenter(){
        model=createModel();
    }

    protected abstract M createModel();
    // 设置View实例
    public void attachView(V view) {
        mVieRef = new WeakReference<V>(view);
    }

    public void detachView(){
        if (mVieRef != null) {
            mVieRef.clear();
            mVieRef = null;
        }
    }
    public boolean isViewAttached() {
        return mVieRef != null && mVieRef.get() != null;
    }

}
