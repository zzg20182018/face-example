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
public class Service0110001 {
    /**
     * 1-获取设备编号
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();
        data.put("deviceId", 342);
        data.put("time", DateFormatUtils.format(new Date(), Constant.DATE_TIME_FORMAT));
        return RestResult.success(data);
    }
}
