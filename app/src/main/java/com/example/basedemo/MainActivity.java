package com.example.basedemo;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.base.ui.BaseMvpActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author lxg
 */
public class MainActivity extends BaseMvpActivity<UserPresenter,
        UserView>
        implements UserView {
    @BindView(R.id.recycleView)
    RecyclerView recycleView;
private MyAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void loadData() {
        hideLoading();
    }

    @Override
    public void initView() {
        adapter=new MyAdapter(this);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        recycleView.setAdapter(adapter);
        List<String> datas=new ArrayList<>();
        datas.add("1");
        datas.add("2");
        datas.add("3");
        datas.add("4");
        adapter.addData(datas);

    }

    @Override
    public void setListener() {

    }

    @Override
    protected UserPresenter bindPrensenter() {
        return new UserPresenter();
    }

    @Override
    public void showSucess() {
    }


}