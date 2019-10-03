package com.example.face.web.service;

import com.alibaba.fastjson.JSONObject;
import com.example.face.constant.Constant;
import com.example.face.web.entity.RestResult;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Service0110003 {
    /**
     * 3-查询新命令
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();

        List list = new ArrayList();
        Map data1 = new HashMap();
        data1.put("id", 123);
        data1.put("type", 4);
        list.add(data1);

//        Map data2 = new HashMap();
//        data2.put("id", 456);
//        data2.put("type", 6);
//        list.add(data2);

        data.put("list", list);
        return RestResult.success(data);
    }
}
