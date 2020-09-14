package com.example.pay.alipay;

import android.app.Activity;
import android.text.TextUtils;

import com.alipay.sdk.app.PayTask;

import java.util.Map;

public class AliPay {
    public payResultListener listener;

    public void setListener(payResultListener listener) {
        this.listener = listener;
    }

    public void pay(final String payInfo, final Activity context) {
        Runnable payRunnable = new Runnable() {
            @Override
            public void run() {
                PayTask alipay = new PayTask(context);
                final Map<String, String> result = alipay.payV2(payInfo, true);
                AlPayResult payResult = new AlPayResult(result);
                final String resultStatus = payResult.getResultStatus();
                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (TextUtils.equals(resultStatus, String.valueOf(9000))) {
                            listener.paySucess();
                        } else {
                            listener.payFail();
                        }
                    }
                });


            }
        };
        // 必须异步调用
        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }

    public interface payResultListener {
        void paySucess();

        void payFail();
    }
}
