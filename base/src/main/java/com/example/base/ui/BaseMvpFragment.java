package com.example.base.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.base.presenter.BasePresenter;
import com.example.base.view.BaseView;
import com.example.base.widget.LoadStausLayout;

public abstract class BaseMvpFragment<T extends BasePresenter,V 
        extends BaseView> extends BaseFragment implements BaseView{
    protected T presenter;
    protected LoadStausLayout loadStausLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        presenter= bindPrensenter();
        if(presenter!=null) {
            presenter.attachView(this);
        }
        loadStausLayout = root.findViewWithTag("loadview");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter!=null&&presenter.isViewAttached()) {
            presenter.detachView();
        }
        if (unbinder != null) {
           unbinder.unbind();
        }

    }

    protected abstract T bindPrensenter();
    @Override
    public void showLoading() {
        if (loadStausLayout != null) {
            loadStausLayout.showLoad();
        }

    }

    @Override
    public void hideLoading() {
        if (loadStausLayout != null) {
            loadStausLayout.showContent();
        }
    }

    @Override
    public void showEmpty() {
        if (loadStausLayout != null) {
            loadStausLayout.showEmpty();
        }
    }

    @Override
    public void showError(String message) {
        if (loadStausLayout != null) {
            loadStausLayout.showError();
        }
    }

}
