package com.example.httpTest.ypes;

import com.example.face.web.utils.AppUtils;
import okhttp3.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StaticServerMain {
    public static void main(String[] args) {
        //1-上传文件
        upload();

        //2-获取支付宝人脸特征码
//        getFeatureCode();
    }

    /**
     * 1-上传文件
     */
    public static void upload() {
        File file = new File("C:\\Users\\yusong\\Pictures\\2.jpg");
//        String url = "http://localhost:8080/static/security/upload/attachment.htm";
        String url = "http://192.9.198.143:8081/staticserver/security/upload/attachment.htm";

        RequestBody fileBody = RequestBody.create(MediaType.parse("image/png"), file);
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("file", file.getName(), fileBody)
                .addFormDataPart("type", "2")//1 用户头像 2 人员人脸 3  设备logo 4 打卡图片 7 日志文件
                .addFormDataPart("fileName", "test.jpg")
                .addFormDataPart("arithmetic", "2")//2, 阿里算法
                .build();

        Request request = new Request.Builder().url(url).post(body).build();
        OkHttpClient okHttpClient = new OkHttpClient();

        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 2-获取支付宝人脸特征码
     */
    public static void getFeatureCode() {
        File file = new File("C:\\Users\\yusong\\Pictures\\3.jpg");
        String fileMd5 = AppUtils.md5Hex(file);
        long timeMillis = System.currentTimeMillis();

        Map<String, String> param = new HashMap();
        param.put("appId", AppUtils.APP_ID);//该参数需要向第三方申请
        param.put("signType", "MD5");
        param.put("timestamp", String.valueOf(timeMillis));
        param.put("appSecret", AppUtils.APP_SECRET);//该参数需要向第三方申请
        // 对文件进行MD5得到的字符串 如getMD5(file)
        param.put("fileSign", fileMd5);
        String sign = AppUtils.sign(param);
        String url = String.format("http://localhost:8080/static/security/upload/get_feature_code.htm?appId=%s&signType=MD5&timestamp=%d&fileSign=%s&sign=%s", AppUtils.APP_ID, timeMillis, fileMd5, sign);

        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse("image/png"), file))
                .build();

        Request request = new Request.Builder().url(url).post(body).build();
        OkHttpClient okHttpClient = new OkHttpClient();

        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
