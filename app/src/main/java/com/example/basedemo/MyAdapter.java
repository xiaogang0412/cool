package com.example.basedemo;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.base.ui.BaseAdapter;
import com.example.base.ui.BaseViewHolder;

import butterknife.BindView;

public class MyAdapter extends BaseAdapter<String, MyAdapter.MyHolder> {


    public MyAdapter(Context context) {
        super(context);
    }

    @Override
    public MyHolder getViewHolder(View view) {
        return new MyHolder(view);
    }

    @Override
    public void setBindViewHolder(String data, MyHolder holder) {
        holder.tvName.setText(data);
        Log.i("wewewe",data);
    }


    @Override
    public int getLayoutId() {
        return R.layout.item;
    }

    @Override
    public void onItemClickListener(int postion, String data) {
        Log.i("wewewewewewe",data);
    }


    class MyHolder extends BaseViewHolder {
        @BindView(R.id.tv_name)
        TextView tvName;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
