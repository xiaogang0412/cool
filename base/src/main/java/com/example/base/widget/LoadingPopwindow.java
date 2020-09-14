package com.example.base.widget;

import android.content.Context;
import android.widget.LinearLayout;

import com.example.base.R;

public class LoadingPopwindow  extends BasePopowindow {
    private LoadingView loadingView;
    public LoadingPopwindow(Context context) {
        super(context, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        init();
    }

    private void init() {
        loadingView=view.findViewById(R.id.loadview);
    }

    @Override
    public int getLayoutId() {
        return R.layout.base_loading;
    }
    public void show(){
                showLoading();
                loadingView.start();

    }
  public   void hide(){
        loadingView.stop();
    }
}
