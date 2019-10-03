package com.example.face.web.service;

import com.alibaba.fastjson.JSONObject;
import com.example.face.constant.Constant;
import com.example.face.web.entity.RestResult;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class Service0110004 {
    /**
     * 4-查询设备设置
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();
        data.put("deviceCompanyName", "设备上显示的公司名称");/*显示文字*/
        data.put("devicePassword", "123456");/*识别阈值*/
        data.put("deviceName", "00002C");/*识别阈值*/
        data.put("threshold", 0.7);/*识别阈值*/
        data.put("detectDistance", 1);/*识别距离*/
        data.put("openDelay", 1);/*开门延迟*/
        data.put("detectInterval", 1);/*识别间隔*/
        data.put("voiceMode", 1);/*语音模式*/
        data.put("voiceCustom", 1);/*自定义语音*/
        data.put("displayMode", 1);/*显示模式*/
        data.put("displayCustom", 1);/*显示自定义内容*/
        data.put("strangerMode", 1);/*陌生人识别开关*/
        data.put("strangerVoiceMode", 1);/*陌生人语音模式*/
        data.put("strangerVoiceCustom", "陌生人语音自定义内容");/*陌生人语音自定义内容*/
        data.put("strangerCustom", "陌生人显示内容");/*陌生人显示内容*/
        data.put("maxFaceSize", 1);/*最大人脸检测数*/
        data.put("livenessType", 1);/*活体开关*/
        data.put("mainLogoPath", "https://hdyz.yusong.com.cn/staticserver_face/static/device_logo/2019-06-05/b835b3f3a500ea4311aaf2ea0fbb3c149f3e.png");/*主logo，必须包含：/static/*/
        data.put("viceLogoPath", "https://hdyz.yusong.com.cn/staticserver_face/static/device_logo/2019-06-05/b835b3f3a500ea4311aaf2ea0fbb3c149f3e.png");/*副logo，必须包含：/static/*/
        data.put("sdkKey", "sdf");/*算法key*/
        data.put("type", 1);/*1 门禁 2 考勤*/
        data.put("rebootTime", "23:10");/*每日重启时间*/
        return RestResult.success(data);
    }
}
