package com.example.httpTest.face.terminal;

import com.example.face.web.utils.AppUtils;
import okhttp3.*;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class TerminalServerMain {
    public static void main(String[] args) throws Exception {
//        //5-查询人员列表
        send("0110005", "{\"serial\":1,\"hardwareId\":\"05D7FF343438525051136341\",\"list\":[1,2,3,4,5],\"offset\":0,\"limit\":20}");
    }

    private static void send(String msgCode, String json1) throws IOException {
        Map<String, String> param = new HashMap();
        param.put("appId", AppUtils.APP_ID);//该参数需要向第三方申请
        param.put("signType", "MD5");
        param.put("msgCode", msgCode);
        param.put("timestamp", String.valueOf(System.currentTimeMillis()));
        param.put("appSecret", AppUtils.APP_SECRET);//该参数需要向第三方申请
        String json = json1;
        param.put("JSON", json);

        String sign = AppUtils.sign(param);
//        System.out.println("sign：" + sign);
        param.put("sign", sign);
        param.remove("JSON");

//        Response response = postJson("http://menjin.yusong.com.cn:8090/comm", param, json);
//        Response response = postJson("http://192.9.198.214:8090/comm", param, json);
//        Response response = postJson("http://localhost:8080/comm", param, json);
        Response response = postJson("http://47.106.173.103:8090/comm", param, json);
        System.out.println(msgCode + "返回：" + response.body().string());
    }

    public static Response postJson(String url, Map<String, String> params, String json) throws IOException {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (builder.length() != 0) {
                builder.append("&");
            }

            builder.append(entry.getKey());
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }

        if (url.indexOf("?") >= 0) {
            url += "&" + builder.toString();
        } else {
            url += "?" + builder.toString();
        }

        OkHttpClient okHttpClient = new OkHttpClient();
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = FormBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        Response response = okHttpClient.newCall(request).execute();

        return response;
    }

}