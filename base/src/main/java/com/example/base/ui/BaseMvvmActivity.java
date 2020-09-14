package com.example.base.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.base.BR;
import com.example.base.model.BaseMMViewModel;

import java.lang.reflect.ParameterizedType;

public abstract class BaseMvvmActivity<V extends ViewDataBinding,
        VM extends BaseMMViewModel> extends BaseActivity{
    protected V binding;
    protected  VM viewmodel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       binding= DataBindingUtil.setContentView(this,getLayoutId());
        Class<VM> vmClass = (Class<VM>) ((ParameterizedType) this.getClass().
                getGenericSuperclass()).getActualTypeArguments()[1];
       viewmodel= ViewModelProviders.of(this).get(vmClass);
        binding.setLifecycleOwner(this);
        binding.setVariable(getBrId(),viewmodel);
        initView();
        loadData();
        setListener();
    }
    public abstract int getBrId();
}
