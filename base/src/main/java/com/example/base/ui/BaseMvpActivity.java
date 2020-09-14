package com.example.base.ui;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.base.presenter.BasePresenter;
import com.example.base.view.BaseView;
import com.example.base.widget.LoadStausLayout;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseMvpActivity<T extends BasePresenter,
        V extends BaseView>
        extends BaseActivity implements BaseView {
    protected T presenter;
    protected LoadStausLayout loadStausLayout;
    private Unbinder bind;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        presenter = bindPrensenter();
        presenter.attachView(this);
        super.onCreate(savedInstanceState);
        View view = View.inflate(this, getLayoutId(), null);
        setContentView(view);
        loadStausLayout = view.findViewWithTag("loadview");
        bind = ButterKnife.bind(this,view);
        initView();
        loadData();
        setListener();

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
    public void showError() {
        if (loadStausLayout != null) {
            loadStausLayout.showError();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
        if (bind != null) {
            bind.unbind();
        }
    }
}
