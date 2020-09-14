package com.example.basedemo;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.base.ui.BaseAdapter;
import com.example.base.ui.BaseViewHolder;

import butterknife.BindView;

public class MyAdapter extends BaseAdapter<DataBean, MyAdapter.MyHolder> {


    public MyAdapter(Context context) {
        super(context);
    }

    @Override
    public MyHolder getViewHolder(View view) {
        return new MyHolder(view);
    }

    @Override
    public void setBindViewHolder(DataBean data, MyHolder holder) {
        holder.tvName.setText(data.getName());
    }


    @Override
    public int getLayoutId() {
        return R.layout.item;
    }

    @Override
    public void onItemClickListener(int postion, DataBean data) {
     Log.i("wewewe",data.getName());
    }




    class MyHolder extends BaseViewHolder {
        @BindView(R.id.tv_name)
        TextView tvName;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
