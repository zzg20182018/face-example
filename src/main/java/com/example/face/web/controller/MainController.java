package com.example.face.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.face.constant.RespCode;
import com.example.face.web.ApiController;
import com.example.face.web.entity.RestResult;
import com.example.face.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class MainController extends ApiController {
    @Autowired
    Service0110001 service0110001;
    @Autowired
    Service0110002 service0110002;
    @Autowired
    Service0110003 service0110003;
    @Autowired
    Service0110004 service0110004;
    @Autowired
    Service0110005 service0110005;
    @Autowired
    Service0110006 service0110006;
    @Autowired
    Service0110007 service0110007;
    @Autowired
    Service0110008 service0110008;
    @Autowired
    Service0110009 service0110009;
    @Autowired
    Service0110010 service0110010;
    @Autowired
    Service0110011 service0110011;
    @Autowired
    Service0110012 service0110012;
    @Autowired
    Service0110013 service0110013;
    @Autowired
    Service0110014 service0110014;
    @Autowired
    Service0110015 service0110015;
    @Autowired
    Service0110016 service0110016;
    @Autowired
    Service0110019 service0110019;

    @ResponseBody
    @RequestMapping("comm")
    public RestResult comm(@RequestBody String json, String msgCode, HttpServletRequest request){
        RestResult result = checkSign(request);
        if (result.getCode() != RespCode.CODE_0.getValue()){
            return result;
        }

        if("0110001".equals(msgCode)){//1-获取设备编号
            return service0110001.doBiz(JSON.parseObject(json));
        }
        if("0110002".equals(msgCode)){//2-设备心跳
            return service0110002.doBiz(JSON.parseObject(json));
        }
        if("0110003".equals(msgCode)){//3-查询新命令
            return service0110003.doBiz(JSON.parseObject(json));
        }
        if("0110004".equals(msgCode)){//4-查询设备设置
            return service0110004.doBiz(JSON.parseObject(json));
        }
        if("0110005".equals(msgCode)){//5-查询人员列表
            return service0110005.doBiz(JSON.parseObject(json));
        }
        if("0110006".equals(msgCode)){//6-查询门禁权限列表
            return service0110006.doBiz(JSON.parseObject(json));
        }
        if("0110007".equals(msgCode)){//7-查询升级信息
            return service0110007.doBiz(JSON.parseObject(json));
        }
        if("0110008".equals(msgCode)){//8-上传识别记录
            return service0110008.doBiz(JSON.parseObject(json));
        }
        if("0110009".equals(msgCode)){//9-上传设备设置
            return service0110009.doBiz(JSON.parseObject(json));
        }
        if("0110010".equals(msgCode)){//10-添加人员
            return service0110010.doBiz(JSON.parseObject(json));
        }
        if("0110011".equals(msgCode)){//11-修改人员
            return service0110011.doBiz(JSON.parseObject(json));
        }
        if("0110012".equals(msgCode)){//12-删除人员
            return service0110012.doBiz(JSON.parseObject(json));
        }
        if("0110013".equals(msgCode)){//13-命令执行结果上报
            return service0110013.doBiz(JSON.parseObject(json));
        }
        if("0110014".equals(msgCode)){//14-查询人员时间戳列表
            return service0110014.doBiz(JSON.parseObject(json));
        }
        if("0110015".equals(msgCode)){//15-上传人证对比结果
            return service0110015.doBiz(JSON.parseObject(json));
        }
        if("0110016".equals(msgCode)){//16-查询基础设置
            return service0110016.doBiz(JSON.parseObject(json));
        }
        if("0110019".equals(msgCode)){//19-查询访客列表
            return service0110019.doBiz(JSON.parseObject(json));
        }
        return RestResult.SUCCESS;
    }

}
