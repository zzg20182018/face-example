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
public class Service0110016 {
    /**
     * 16-查询基础设置
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();
        data.put("staticUrl", "https://hdyz.yusong.com.cn/staticserver_face");
        data.put("uploadUrl", "https://hdyz.yusong.com.cn/staticserver_face/security/upload/attachment.htm");
        data.put("socket", "menjin.yusogs.com:123333");//无效地址
        return RestResult.success(data);
    }
}
