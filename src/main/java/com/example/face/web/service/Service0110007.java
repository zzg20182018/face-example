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
public class Service0110007 {
    /**
     * 7-查询升级信息
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();
        data.put("url", "https://hdyz.yusong.com.cn/staticserver_face/static/upgrade/7ed513f2aadd6a43ddabb06a0b47bdd991d0.apk");
        data.put("version", "0.0.1");
        data.put("md5", "zzzzzzzz");//AppUtils.md5Hex(new File("C:\\Users\\yusong\\Pictures\\3.jpg"))
        return RestResult.success(data);
    }
}
