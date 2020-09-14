package com.example.base.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.base.presenter.BasePresenter;
import com.example.base.view.BaseView;

public abstract class BaseMvpFragment<T extends BasePresenter,V 
        extends BaseView> extends BaseFragment implements BaseView{
    protected T presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        presenter= bindPrensenter();
        presenter.attachView(this);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected abstract T bindPrensenter();
}
