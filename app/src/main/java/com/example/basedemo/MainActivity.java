package com.example.basedemo;

import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.base.ui.BaseMvpActivity;
import com.example.base.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author lxg
 */
public class MainActivity extends BaseMvpActivity {
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void loadData() {
    }

    @Override
    public void initView() {

    }

    @Override
    public void setListener() {

    }

    @Override
    protected UserPresenter bindPrensenter() {
        return null;
    }




}