package com.example.base.view;

public interface BaseView{

    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 显示空白页面
     */
    void showEmpty();

    /**
     * 网络错误页面
     */
    void showError(String message);
}
