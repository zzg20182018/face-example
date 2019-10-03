package com.example.face.web.controller;

import com.example.face.web.utils.AppUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping(value = "/security/upload")
public class UploadController {
    private static Logger log = LogManager.getLogger(UploadController.class);

    /**
     * 1-上传文件
     */
    @ResponseBody
    @RequestMapping(value = "attachment.htm", method = RequestMethod.POST)
    public Map attachment(@RequestParam("file") MultipartFile[] files, int type, String fileName, Integer arithmetic) throws IOException {
        Map result = new HashMap();
        List<Map<String, Object>> list = new ArrayList<>();

        for(MultipartFile file : files) {
            Map<String, Object> data = new HashMap<>();
            File sourceFile = new File("C:\\Users\\yusong\\Pictures\\33.jpg");
            AppUtils.makeParentDir(sourceFile);
            file.transferTo(sourceFile);

            //TODO

            Map faceFeature = new HashMap();
            faceFeature.put("code", 0);
            faceFeature.put("feature", "NVF_XmooTsVMQ9vj8rEi4KTZ62UQgeZLibKNQ0k_QZBqh6rSUufmahMyXBo7jQMVPUqgwOBIP1a5zAJLih1amQzTgOUwNSY9ndIySnncQAgelFm7qGBN30eI2QiVT5_ihbZopoyzM0n5IeRZqllqYjpgw5ZmwT74niB0CKmDGEswBFAUTc1G2dR19jn6sWglYRDyPxkAqovqRNaBTeB-t0cH4h5NRJWFxFOIA9V08XJruY0FfCVqDJ7u5JxRJSzlcfdqrtsVHjvMH_yxs2KWN5QsKThFCOoBIeE89yxzHUwUHwdoFKzzy44_k980vSRhP0AcD1Y0q9Y6DFq_nVo14ILzdzMPmF4KAN1wRRdrBMBTmbQ-RYLQa38vnOI2oB_k1_UN2KVeEu7BWs8k02qweYB6ioAIs3eSXfdCVwaIZqkdJBj61gd4D18NDBeW3q5NvfDAQalUY9MaeEBfSbD-CHqnltjISSKx5IzsQxGuw0vPmNsfmxJKKNd-JGlTLHi9Xp0ypuJoK6Eug6x9p2eIyLyAIGD73t7uRSkw9Wcy4o1maP3gucrAcwqkp3413iV_0W4Fm0KDEH8acvF-dxPnpVsOFXaaskIwwZALWNG8p6Eip9NZqguQp3y5LkpGpDhm7ZYDeMChW3B6cm9zU9sry5_heZGGXny22vXHupIb0eH2deiFvPtHFSNfggt-hBSgekpYJt471ZCMCNg-QGiwXcdRWUfL5MEZanpk68TEIs1aJeekDzYytthTI4Tg0YCg65INLBwnncileCz3qgLM5GCQMCgUiazvQ9x0AATgeJjgu65hCSfP2vLuZi-ZRl43QV2H1CYsNmkHO6PouMMmRROhZylfCA8YBnwOg9MvUetHtYMpsIAiHkjVL16pfBw3sp9gV9sh4ydFCRhCfeEgLM5m3NHLIdW0pXbw0wb6xwa3FbI9Oqiqftr10C8nVmzrFdxdRM_hSkijLtBqQ_gbznG5q32IPsMeV6SFdVi9z2xw3fHVEkQ_TwLqk7Mw6kvbZxLKQA9CdcIB44RoKTd2MReXpPaukFOckhDh0GvJqctgTBzJtHyTPnXs5OIpXrBhWDTooBVzSrdOb63ziuFqa4HHI_wZGCvgXQ2Z0SdFpTquNr2fthneF6DhyJ5VQp0eoQHZnowRHS8-2b5vyOZzm4hQQ98j92obpzawGu2HnxANiS0iBL2CPRm2QoJtZKTZh7vvcGuc_lzhn7pK1JJpyCLX5n0PLG8ABvt0-FyFGWZF5Ek2fXo3VG0jT1mPE94GrFQ5PTNxF4snPrFK7BwrxpBhQkjucgXL2FtHzFx_iOpEneJnBtO8P6-PtYP_7X3mtX7y3rS5uqIHq3dISKfGmKu8PGHPwJC9xbiXqtDPL1otdcTcYPAm67TXC4JE0mKhSDv1F-wwQck3MUKlFV61zhFVkBfNHuCZSQWD5ReqoZfYg20yx8UMnUKV9JRtByVpsYpXp85-HMRHXWMyZnMvJmngjs0LLVhIN_5SgQ98EQC_CzXlN5lxCbbZBFfJdG87c6yl237kSTnrf4wq0wZzoZzefGPW-r22XpigZkFdT2NnAovn1E5Qe64QK9eobqBOfZkQoyqRxzRgOsB2OZSfHQ5zi-G_HG1d6Lu9nRI7NAn5lspuOjw3_cHqyJcWxvRmWnTW8Xowq65cRrfOOMLw_ZJKP6w2tk129nyohKZEGlRDGN5ng33jNBzfQZJeUwTaOGjavwPOlqxPdLd1JpkvxbzByr4_E4WGWjMck5CjPtePhfYbeWeg2gHe3RcBGWqiAXyo2WMrVMhzAylzyWjoTFXgGZpOAg0fxIjoSYifx_U");
            data.put("faceFeature", faceFeature);
            data.put("filePath", "/static/person_face/2019-07-24/d850037ea7037a4e1aa89efa4f0f4f34e12d.jpg");
            data.put("fileName", "test.jpg");
            data.put("targetName", "d850037ea7037a4e1aa89efa4f0f4f34e12d.jpg");
            data.put("url", "https://hdyz.yusong.com.cn/staticserver_face/static/person_face/2019-07-24/d850037ea7037a4e1aa89efa4f0f4f34e12d.jpg");//包含http头
            list.add(data);
        }

        result.put("code", 0);
        result.put("data", list);
        return result;
    }

    /**
     * 2-获取支付宝人脸特征码
     */
    @ResponseBody
    @RequestMapping(value = "get_feature_code.htm", method = RequestMethod.POST)
    public Map attachment(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        Map result = new HashMap();
        File sourceFile = new File("C:\\Users\\yusong\\Pictures\\34.jpg");
        AppUtils.makeParentDir(sourceFile);
        file.transferTo(sourceFile);

        boolean check = check(request, sourceFile);
        if (!check) {
            result.put("code", 1);
            result.put("message", "签名验证错误！");
            return result;
        }

        //TODO

        sourceFile.delete();

        result.put("code", 0);
        result.put("message", "xxx");
        Map featureCode = new HashMap();
        featureCode.put("featureCode", "NVF_XmooTsVMQ9vj8rEi4KTZ62UQgeZLibKNQ0k_QZBqh6rSUufmahMyXBo7jQMVPUqgwOBIP1a5zAJLih1amQzTgOUwNSY9ndIySnncQAgelFm7qGBN30eI2QiVT5_ihbZopoyzM0n5IeRZqllqYjpgw5ZmwT74niB0CKmDGEswBFAUTc1G2dR19jn6sWglYRDyPxkAqovqRNaBTeB-t0cH4h5NRJWFxFOIA9V08XJruY0FfCVqDJ7u5JxRJSzlcfdqrtsVHjvMH_yxs2KWN5QsKThFCOoBIeE89yxzHUwUHwdoFKzzy44_k980vSRhP0AcD1Y0q9Y6DFq_nVo14ILzdzMPmF4KAN1wRRdrBMBTmbQ-RYLQa38vnOI2oB_k1_UN2KVeEu7BWs8k02qweYB6ioAIs3eSXfdCVwaIZqkdJBj61gd4D18NDBeW3q5NvfDAQalUY9MaeEBfSbD-CHqnltjISSKx5IzsQxGuw0vPmNsfmxJKKNd-JGlTLHi9Xp0ypuJoK6Eug6x9p2eIyLyAIGD73t7uRSkw9Wcy4o1maP3gucrAcwqkp3413iV_0W4Fm0KDEH8acvF-dxPnpVsOFXaaskIwwZALWNG8p6Eip9NZqguQp3y5LkpGpDhm7ZYDeMChW3B6cm9zU9sry5_heZGGXny22vXHupIb0eH2deiFvPtHFSNfggt-hBSgekpYJt471ZCMCNg-QGiwXcdRWUfL5MEZanpk68TEIs1aJeekDzYytthTI4Tg0YCg65INLBwnncileCz3qgLM5GCQMCgUiazvQ9x0AATgeJjgu65hCSfP2vLuZi-ZRl43QV2H1CYsNmkHO6PouMMmRROhZylfCA8YBnwOg9MvUetHtYMpsIAiHkjVL16pfBw3sp9gV9sh4ydFCRhCfeEgLM5m3NHLIdW0pXbw0wb6xwa3FbI9Oqiqftr10C8nVmzrFdxdRM_hSkijLtBqQ_gbznG5q32IPsMeV6SFdVi9z2xw3fHVEkQ_TwLqk7Mw6kvbZxLKQA9CdcIB44RoKTd2MReXpPaukFOckhDh0GvJqctgTBzJtHyTPnXs5OIpXrBhWDTooBVzSrdOb63ziuFqa4HHI_wZGCvgXQ2Z0SdFpTquNr2fthneF6DhyJ5VQp0eoQHZnowRHS8-2b5vyOZzm4hQQ98j92obpzawGu2HnxANiS0iBL2CPRm2QoJtZKTZh7vvcGuc_lzhn7pK1JJpyCLX5n0PLG8ABvt0-FyFGWZF5Ek2fXo3VG0jT1mPE94GrFQ5PTNxF4snPrFK7BwrxpBhQkjucgXL2FtHzFx_iOpEneJnBtO8P6-PtYP_7X3mtX7y3rS5uqIHq3dISKfGmKu8PGHPwJC9xbiXqtDPL1otdcTcYPAm67TXC4JE0mKhSDv1F-wwQck3MUKlFV61zhFVkBfNHuCZSQWD5ReqoZfYg20yx8UMnUKV9JRtByVpsYpXp85-HMRHXWMyZnMvJmngjs0LLVhIN_5SgQ98EQC_CzXlN5lxCbbZBFfJdG87c6yl237kSTnrf4wq0wZzoZzefGPW-r22XpigZkFdT2NnAovn1E5Qe64QK9eobqBOfZkQoyqRxzRgOsB2OZSfHQ5zi-G_HG1d6Lu9nRI7NAn5lspuOjw3_cHqyJcWxvRmWnTW8Xowq65cRrfOOMLw_ZJKP6w2tk129nyohKZEGlRDGN5ng33jNBzfQZJeUwTaOGjavwPOlqxPdLd1JpkvxbzByr4_E4WGWjMck5CjPtePhfYbeWeg2gHe3RcBGWqiAXyo2WMrVMhzAylzyWjoTFXgGZpOAg0fxIjoSYifx_U");
        result.put("data", featureCode);

        return result;
    }

    //签名验证
    private boolean check(HttpServletRequest httpRequest, File file) {
        Map<String, String> param = new HashMap<>();

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

//        AppInfo appInfo = appInfoService.findByAppId(httpRequest.getParameter("appId"));
//        if (appInfo == null || appInfo.getIsActive() != 1) {
//            return false;
//        }
//        param.put("appSecret", appInfo.getAppSecret());
        param.put("appSecret", AppUtils.APP_SECRET);

        String sign1 = httpRequest.getParameter("sign");
        String sign2 = AppUtils.sign(param);
        if (!sign2.equalsIgnoreCase(sign1)) {
            log.error("sign error, sign1: {}, sign2: {}", sign1, sign2);
            return false;
        }

        String fileSign1 = httpRequest.getParameter("fileSign");
        String fileSign2 = AppUtils.md5Hex(file);
        if (fileSign1 != null && !fileSign1.equalsIgnoreCase(fileSign2)) {
            log.error("fileSign error, fileMd51: {}, fileMd52: {}", fileSign1, fileSign2);
            return false;
        }

        return true;
    }

}
