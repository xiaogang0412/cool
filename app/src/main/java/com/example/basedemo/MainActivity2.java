package com.example.basedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;

import com.example.base.ui.BaseMvvmActivity;
import com.example.basedemo.databinding.ActivityMain2Binding;

public class MainActivity2 extends BaseMvvmActivity<ActivityMain2Binding,StudentModel> {
    @Override
    public int getLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    public void loadData() {

        viewmodel.load();

    }

    @Override
    public void initView() {

    }

    @Override
    public void setListener() {
        viewmodel.liveData.observe(this, new Observer<UserEntity>() {
            @Override
            public void onChanged(UserEntity userEntity) {

            }
        });

    }

    @Override
    public int getBrId() {
        return BR.student;
    }
}