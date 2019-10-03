package com.example.face.web.service;

import com.alibaba.fastjson.JSONObject;
import com.example.face.constant.Constant;
import com.example.face.web.entity.RestResult;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Service0110006 {
    /**
     * 6-查询门禁权限列表
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();
        List list = new ArrayList();

        Map person1 = new HashMap();
        person1.put("id", 123);
        List timeList = new ArrayList();
        Map data11 = new HashMap();
        data11.put("beginTime", "00:00:00");
        data11.put("endTime", "00:00:00");
        timeList.add(data11);
        person1.put("timeList", timeList);


        list.add(person1);

        data.put("list", list);
        return RestResult.success(data);
    }
}
