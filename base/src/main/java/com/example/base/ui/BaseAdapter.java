package com.example.base.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<T,B extends BaseViewHolder>
        extends RecyclerView.Adapter<B> {
    public List<T> data;
    public Context context;


    public BaseAdapter(Context context) {
        this.context = context;

    }

    public void addData(List<T> data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        if (data != null) {
            this.data.addAll(data);
        }
        notifyDataSetChanged();
    }

    // 添加数据
    public void setData(List<T> data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        if (data != null) {
            this.data.addAll(this.data.size(), data);
            // 通知已添加
            notifyItemInserted(this.data.size());
        }
    }


    @NonNull
    @Override
    public B onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(getLayoutId(), viewGroup, false);
        return getViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull B holder, final int position) {
       setBindViewHolder(data.get(position),holder);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             onItemClickListener(position,data.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    // 移除数据
    public void removeData() {
        if (data == null) {
            return;
        }
        int size = data.size();
        data.clear();
        // 通知已移除
        notifyItemRangeRemoved(0, size);
    }

    public void cleanData() {
        if (data == null) {
            return;
        }
        data.clear();
        notifyDataSetChanged();
    }

    public void cleanDataNoNotify() {
        if (data == null) {
            return;
        }
        data.clear();
    }

    public abstract B getViewHolder(View view);
    public abstract void setBindViewHolder(T data,B holder);

    public abstract int getLayoutId();
    public abstract void  onItemClickListener(int postion,T data);

    /**
     * 带参数跳转
     *
     * @param targetClass
     * @param bundle
     */
    protected void startActivity(Class<?> targetClass, Bundle bundle) {
        Intent intent = new Intent(context, targetClass);
        intent.putExtras(bundle);
        context.startActivity(intent);

    }

    /**
     * 带参数带请求码跳转
     *
     * @param targetClass
     * @param bundle
     * @param requestCode
     */
    protected void startActivity(Class<?> targetClass, Bundle bundle, int requestCode) {
        Intent intent = new Intent(context, targetClass);
        intent.putExtras(bundle);
        ((Activity) context).startActivityForResult(intent, requestCode);

    }

    /**
     * 带请求码跳转
     *
     * @param targetClass
     * @param requstCode
     */
    protected void startActivity(Class<?> targetClass, int requstCode) {
        Intent intent = new Intent(context, targetClass);
        ((Activity) context).startActivityForResult(intent, requstCode);
    }

    protected void startActivity(Class<?> targetClass) {
        Intent intent = new Intent(context, targetClass);
        context.startActivity(intent);


    }

    public void setPostion(int postion, T t) {
        data.add(postion, t);
        notifyDataSetChanged();
    }
    public interface onItemClickListener<T>{
        void onClick(int postion,T data);
    }

}
