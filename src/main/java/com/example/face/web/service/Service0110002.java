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
public class Service0110002 {
    /**
     * 2-设备心跳
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();
        data.put("interval", 60);
        data.put("newCommand", 0);
        data.put("newVersion", 0);
        return RestResult.success(data);
    }
}
