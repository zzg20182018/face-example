package com.example.httpTest.localTest;

import com.example.face.web.utils.AppUtils;
import okhttp3.*;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class TerminalServerMain {
    public static void main(String[] args) throws Exception {
        //1-获取设备编号
//        send("0110001", "{\"hardwareId\": \"05D7FF343438525051136341\",\"arithmetic\": 1}");
//
//        //2-设备心跳
//        send("0110002", "{\"hardwareId\": \"05D7FF343438525051136341\",\"disk\": 40,\"version\": \"0.0.1\"}");
//
//        //3-查询新命令
//        send("0110003", "{\"hardwareId\": \"05D7FF343438525051136341\"}");
//
//        //4-查询设备设置
//        send("0110004", "{\"hardwareId\": \"05D7FF343438525051136341\"}");
//
//        //5-查询人员列表
//        send("0110005", "{\"hardwareId\": \"05D7FF343438525051136341\",\"list\": [1, 2, 3, 4, 5],\"offset\": 0,\"limit\": 10}");
//
//        //6-查询门禁权限列表
        send("0110006", "{\"hardwareId\": \"05D7FF343438525051136341\"}");
//
//        //7-查询升级信息
//        send("0110007", "{\"hardwareId\": \"05D7FF343438525051136341\"}");
//
//        //8-上传识别记录
//        send("0110008", "{\"hardwareId\": \"05D7FF343438525051136341\",\"list\": [{\"personId\": 1,\"signTime\": \"2017-01-01 00:00:00\",\"filePath\": \"zzzz\"}]}");
//
//        //9-上传设备设置
//        send("0110009", "{\"hardwareId\": \"05D7FF343438525051136341\",\"deviceCompanyName\": \"显示文字\",\"devicePassword\": \"密码\",\"deviceName\": \"设备名称\",\"threshold\": 0.8,\"detectDistance\": 1,\"openDelay\": 1,\"detectInterval\": 1,\"voiceMode\": 1,\"voiceCustom\": \"\",\"displayMode\": 1,\"displayCustom\": \"\",\"strangerMode\": 1,\"strangerVoiceMode\": 1,\"strangerVoiceCustom\": \"\",\"strangerCustom\": \"\",\"maxFaceSize\": 1,\"livenessType\": 1,\"mainLogoPath\": \"\",\"viceLogoPath\": \"\",\"rebootTime\": \"23:10\",\"updateTime\": \"2018-12-12 12:03:26\"}");
//
//        //10-添加人员
//        send("0110010", "{\"hardwareId\":\"05D7FF343438525051136341\",\"personList\":[{\"personName\":\"zzz1\",\"faceList\":[{\"filePath\":\"/static/person_face/2019-07-24/d3837464a9d27a4f58aaa77a3a51d055e99f.jpg\",\"featureCode\":\"zzz1\"}]},{\"personName\":\"zzz3\",\"faceList\":[{\"filePath\":\"/static/person_face/2019-07-24/d3837464a9d27a4f58aaa77a3a51d055e99f.jpg\",\"featureCode\":\"zzz3\"}]}]}");
//
//        //11-修改人员
//        send("0110011", "{\"hardwareId\":\"05D7FF343438525051136341\",\"personList\":[{\"personId\":1,\"personName\":\"zdddzz\",\"faceList\":[{\"filePath\":\"/static/person_face/2019-07-24/d3837464a9d27a4f58aaa77a3a51d055e99f.jpg\",\"featureCode\":\"zzz\"}]},{\"personId\":2,\"personName\":\"zzdddz\",\"faceList\":[{\"filePath\":\"/static/person_face/2019-07-24/d3837464a9d27a4f58aaa77a3a51d055e99f.jpg\",\"featureCode\":\"zddzz\"}]}]}");
//
//        //12-删除人员
//        send("0110012", "{\"hardwareId\": \"05D7FF343438525051136341\",\"personList\": [1029,2927]}");
//
//        //13-命令执行结果上报
//        send("0110013", "{\"hardwareId\": \"05D7FF343438525051136341\",\"commandId\": 1308,\"result\": 3,\"msg\": \"ssss\"}");
//
//        //14-查询人员时间戳列表
//        send("0110014", "{\"hardwareId\": \"05D7FF343438525051136341\",\"offset\": 0,\"limit\": 10}");
//
//        //15-上传人证对比结果
//        send("0110015", "{\"hardwareId\": \"05D7FF343438525051136341\",\"list\": [{\"personName\": \"\",\"gender\": 1,\"birthday\": \"2018-01-01\",\"nation\": \"汉\",\"address\": \"浙江省杭州市\",\"idCard\": \"身份证号\",\"signOrg\": \"杭州市公安局\",\"beginDate\": \"2018-01-01\",\"endDate\": \"2018-01-01\",\"cardFacePath\": \"/static/xxx.jpg\",\"realFacePath\": \"/static/xxx.jpg\",\"result\": 1,\"eventTime\": \"2018-10-01 00:00:00\"}]}");
//
//        //16-查询基础设置
//        send("0110016", "{\"hardwareId\": \"05D7FF343438525051136341\"}");

//        //19-查询访客列表
//        send("0110019", "{\"hardwareId\": \"fe89f6049173a3f\"}");

        //20-访客查询
//        send("0110020", "{\"hardwareId\": \"86479303000242\",\"offset\": 0,\"limit\": 10}");

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

        Response response = postJson("http://menjin.yusong.com.cn:8090/comm", param, json);
//        Response response = postJson("http://192.9.198.214:8090/comm", param, json);
//        Response response = postJson("http://localhost:8080/comm", param, json);
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