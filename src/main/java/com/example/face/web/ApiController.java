package com.example.face.web;

import com.example.face.constant.RespCode;
import com.example.face.web.entity.RestResult;
import com.example.face.web.utils.AppUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.servlet.ServletRequest;
import org.apache.commons.lang.StringUtils;
import java.util.*;


public abstract class ApiController {

    private static final Logger log = LogManager.getLogger(ApiController.class);

    public static RestResult checkSign(ServletRequest httpRequest) {
        Map<String, String> param = new HashMap();

        Enumeration enumeration = httpRequest.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String name = (String) enumeration.nextElement();
            String value = StringUtils.trimToEmpty(httpRequest.getParameter(name));
            if (!"sign".equals(name) && StringUtils.isNotEmpty(value)) {
                param.put(name, value);
            }
        }

        String json = (String) httpRequest.getAttribute("JSON");
        if (StringUtils.isNotEmpty(json)) {
            param.put("JSON", json);
        }

//        AppInfoService appInfoService = SpringContextHolder.getBean(AppInfoService.class);
//        String appId = httpRequest.getParameter("appId");
//        AppInfo appInfo = appInfoService.findByAppId(appId);
//        if (appInfo == null || appInfo.getIsActive() != 1) {
//            RestResult result = RestResult.result(RespCode.CODE_7.getValue(), String.format("appId不存在，appId:%s", appId));
//            return result;
//        }
//        param.put("appSecret", appInfo.getAppSecret());
        param.put("appSecret", AppUtils.APP_SECRET);

        String sign1 = httpRequest.getParameter("sign");
        String sign2 = AppUtils.sign(param);
        if (sign2.equalsIgnoreCase(sign1)) {
            return RestResult.SUCCESS;
        } else {
            log.error("sign error, sign1: {}, sign2: {}", sign1, sign2);
            return RestResult.result(RespCode.CODE_4.getValue(), RespCode.CODE_4.getName());
        }

    }

}
