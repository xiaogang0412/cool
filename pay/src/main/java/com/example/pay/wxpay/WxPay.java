package com.example.pay.wxpay;

import android.content.Context;

import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.util.Map;

public class WxPay {
    private static IWXAPI wxapi;

    public static void init(Context context, String appkey) {
        wxapi = WXAPIFactory.createWXAPI(context,
                appkey, true);
        wxapi.registerApp(appkey);

    }

    public static IWXAPI getInstance() {
        return wxapi;
    }

    public static void pay(Map<String, String> map) {
        PayReq request = new PayReq();
        request.appId = map.get("appId");
        request.partnerId = map.get("parterId");
        request.prepayId = map.get("prepayId");
        request.packageValue = map.get("packageValue");
        request.nonceStr = map.get("nonceStr");
        request.timeStamp = map.get("timeStamp");
        request.sign = map.get("sign");
        wxapi.sendReq(request);
    }

    public static void WeChatLogin(int type) {
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = String.valueOf(type);
        wxapi.sendReq(req);
    }
}
