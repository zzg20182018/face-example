package com.example.face.web.service;

import com.alibaba.fastjson.JSONObject;
import com.example.face.constant.Constant;
import com.example.face.web.entity.RestResult;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Service0110014 {
    /**
     * 14-查询人员时间戳列表
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();

        List list = new ArrayList();
        Map data1 = new HashMap();
        data1.put("id", 123);
        data1.put("updateTime", DateFormatUtils.format(new Date(), Constant.DATE_TIME_FORMAT));
        list.add(data1);

        Map data2 = new HashMap();
        data2.put("id", 124);
        data2.put("updateTime", DateFormatUtils.format(new Date(), Constant.DATE_TIME_FORMAT));
        list.add(data2);

        data.put("list", list);
        return RestResult.success(data);
    }
}
