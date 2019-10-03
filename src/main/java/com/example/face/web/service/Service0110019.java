package com.example.face.web.service;

import com.alibaba.fastjson.JSONObject;
import com.example.face.constant.Constant;
import com.example.face.web.entity.RestResult;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Service0110019 {
    /**
     * 16-查询基础设置
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();

        List list = new ArrayList();
        Map visitor = new HashMap();
        Map time = new HashMap();
        Map person = new HashMap();
        Map face = new HashMap();
        face.put("filePath","/static/person_face/2019-07-25/93cff04aa3012a487ba9bb3a4e76a149084e.jpg");
        face.put("featureCode","NVF_XmooTsVMQ9vj8rEi4KTZ62UQgeZLibKNQ0k_QZBqh6rSUufmahMyXBo7jQMVPUqgwOBIP1a5zAJLih1amQzTgOUwNSY9ndIySnncQAgelFm7qGBN30eI2QiVT5_ihbZopoyzM0n5IeRZqllqYjpgw5ZmwT74niB0CKmDGEswBFAUTc1G2dR19jn6sWglYRDyPxkAqovqRNaBTeB-t0cH4h5NRJWFxFOIA9V08XJruY0FfCVqDJ7u5JxRJSzlcfdqrtsVHjvMH_yxs2KWN5QsKThFCOoBIeE89yxzHUwUHwdoFKzzy44_k980vSRhP0AcD1Y0q9Y6DFq_nVo14ILzdzMPmF4KAN1wRRdrBMBTmbQ-RYLQa38vnOI2oB_k1_UN2KVeEu7BWs8k02qweYB6ioAIs3eSXfdCVwaIZqkdJBj61gd4D18NDBeW3q5NvfDAQalUY9MaeEBfSbD-CHqnltjISSKx5IzsQxGuw0vPmNsfmxJKKNd-JGlTLHi9Xp0ypuJoK6Eug6x9p2eIyLyAIGD73t7uRSkw9Wcy4o1maP3gucrAcwqkp3413iV_0W4Fm0KDEH8acvF-dxPnpVsOFXaaskIwwZALWNG8p6Eip9NZqguQp3y5LkpGpDhm7ZYDeMChW3B6cm9zU9sry5_heZGGXny22vXHupIb0eH2deiFvPtHFSNfggt-hBSgekpYJt471ZCMCNg-QGiwXcdRWUfL5MEZanpk68TEIs1aJeekDzYytthTI4Tg0YCg65INLBwnncileCz3qgLM5GCQMCgUiazvQ9x0AATgeJjgu65hCSfP2vLuZi-ZRl43QV2H1CYsNmkHO6PouMMmRROhZylfCA8YBnwOg9MvUetHtYMpsIAiHkjVL16pfBw3sp9gV9sh4ydFCRhCfeEgLM5m3NHLIdW0pXbw0wb6xwa3FbI9Oqiqftr10C8nVmzrFdxdRM_hSkijLtBqQ_gbznG5q32IPsMeV6SFdVi9z2xw3fHVEkQ_TwLqk7Mw6kvbZxLKQA9CdcIB44RoKTd2MReXpPaukFOckhDh0GvJqctgTBzJtHyTPnXs5OIpXrBhWDTooBVzSrdOb63ziuFqa4HHI_wZGCvgXQ2Z0SdFpTquNr2fthneF6DhyJ5VQp0eoQHZnowRHS8-2b5vyOZzm4hQQ98j92obpzawGu2HnxANiS0iBL2CPRm2QoJtZKTZh7vvcGuc_lzhn7pK1JJpyCLX5n0PLG8ABvt0-FyFGWZF5Ek2fXo3VG0jT1mPE94GrFQ5PTNxF4snPrFK7BwrxpBhQkjucgXL2FtHzFx_iOpEneJnBtO8P6-PtYP_7X3mtX7y3rS5uqIHq3dISKfGmKu8PGHPwJC9xbiXqtDPL1otdcTcYPAm67TXC4JE0mKhSDv1F-wwQck3MUKlFV61zhFVkBfNHuCZSQWD5ReqoZfYg20yx8UMnUKV9JRtByVpsYpXp85-HMRHXWMyZnMvJmngjs0LLVhIN_5SgQ98EQC_CzXlN5lxCbbZBFfJdG87c6yl237kSTnrf4wq0wZzoZzefGPW-r22XpigZkFdT2NnAovn1E5Qe64QK9eobqBOfZkQoyqRxzRgOsB2OZSfHQ5zi-G_HG1d6Lu9nRI7NAn5lspuOjw3_cHqyJcWxvRmWnTW8Xowq65cRrfOOMLw_ZJKP6w2tk129nyohKZEGlRDGN5ng33jNBzfQZJeUwTaOGjavwPOlqxPdLd1JpkvxbzByr4_E4WGWjMck5CjPtePhfYbeWeg2gHe3RcBGWqiAXyo2WMrVMhzAylzyWjoTFXgGZpOAg0fxIjoSYifx_U");

        data.put("list", list);
        return RestResult.success(data);
    }
}
