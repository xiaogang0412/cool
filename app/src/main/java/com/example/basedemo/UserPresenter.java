package com.example.basedemo;

import com.example.base.presenter.BasePresenter;

public class UserPresenter extends BasePresenter<UserView,UserModel> implements UserImpl {

    public void load(){
        model.load("",this);

    }


    @Override
    protected UserModel createModel() {
        return new UserModel();
    }

    @Override
    public void sucess() {
        baseView.showSucess();
    }
}
