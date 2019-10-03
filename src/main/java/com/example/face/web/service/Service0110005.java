package com.example.face.web.service;

import com.alibaba.fastjson.JSONObject;
import com.example.face.constant.Constant;
import com.example.face.web.entity.RestResult;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Service0110005 {
    /**
     * 5-查询人员列表
     * 人员列表根据14号协议返回的人员id列表查询
     */
    public RestResult doBiz(JSONObject jsonObject){
        //TODO

        Map data = new HashMap();
        List list = new ArrayList();

        Map person1 = new HashMap();
        person1.put("id", 123);
        person1.put("personName", "周智刚");
        person1.put("icCard", "123456789111111111");
        person1.put("updateTime", DateFormatUtils.format(new Date(), Constant.DATE_TIME_FORMAT));
        List faceList1 = new ArrayList();
        Map data11 = new HashMap();
        data11.put("filePath", "/static/person_face/2019-07-25/93cff04aa3012a487ba9bb3a4e76a149084e.jpg");
        data11.put("featureCode", "NVF_XmooTsVMQ9vj8rEi4KTZ62UQgeZLibKNQ0k_QZBqh6rSUufmahMyXBo7jQMVPUqgwOBIP1a5zAJLih1amQzTgOUwNSY9ndIySnncQAgelFm7qGBN30eI2QiVT5_ihbZopoyzM0n5IeRZqllqYjpgw5ZmwT74niB0CKmDGEswBFAUTc1G2dR19jn6sWglYRDyPxkAqovqRNaBTeB-t0cH4h5NRJWFxFOIA9V08XJruY0FfCVqDJ7u5JxRJSzlcfdqrtsVHjvMH_yxs2KWN5QsKThFCOoBIeE89yxzHUwUHwdoFKzzy44_k980vSRhP0AcD1Y0q9Y6DFq_nVo14ILzdzMPmF4KAN1wRRdrBMBTmbQ-RYLQa38vnOI2oB_k1_UN2KVeEu7BWs8k02qweYB6ioAIs3eSXfdCVwaIZqkdJBj61gd4D18NDBeW3q5NvfDAQalUY9MaeEBfSbD-CHqnltjISSKx5IzsQxGuw0vPmNsfmxJKKNd-JGlTLHi9Xp0ypuJoK6Eug6x9p2eIyLyAIGD73t7uRSkw9Wcy4o1maP3gucrAcwqkp3413iV_0W4Fm0KDEH8acvF-dxPnpVsOFXaaskIwwZALWNG8p6Eip9NZqguQp3y5LkpGpDhm7ZYDeMChW3B6cm9zU9sry5_heZGGXny22vXHupIb0eH2deiFvPtHFSNfggt-hBSgekpYJt471ZCMCNg-QGiwXcdRWUfL5MEZanpk68TEIs1aJeekDzYytthTI4Tg0YCg65INLBwnncileCz3qgLM5GCQMCgUiazvQ9x0AATgeJjgu65hCSfP2vLuZi-ZRl43QV2H1CYsNmkHO6PouMMmRROhZylfCA8YBnwOg9MvUetHtYMpsIAiHkjVL16pfBw3sp9gV9sh4ydFCRhCfeEgLM5m3NHLIdW0pXbw0wb6xwa3FbI9Oqiqftr10C8nVmzrFdxdRM_hSkijLtBqQ_gbznG5q32IPsMeV6SFdVi9z2xw3fHVEkQ_TwLqk7Mw6kvbZxLKQA9CdcIB44RoKTd2MReXpPaukFOckhDh0GvJqctgTBzJtHyTPnXs5OIpXrBhWDTooBVzSrdOb63ziuFqa4HHI_wZGCvgXQ2Z0SdFpTquNr2fthneF6DhyJ5VQp0eoQHZnowRHS8-2b5vyOZzm4hQQ98j92obpzawGu2HnxANiS0iBL2CPRm2QoJtZKTZh7vvcGuc_lzhn7pK1JJpyCLX5n0PLG8ABvt0-FyFGWZF5Ek2fXo3VG0jT1mPE94GrFQ5PTNxF4snPrFK7BwrxpBhQkjucgXL2FtHzFx_iOpEneJnBtO8P6-PtYP_7X3mtX7y3rS5uqIHq3dISKfGmKu8PGHPwJC9xbiXqtDPL1otdcTcYPAm67TXC4JE0mKhSDv1F-wwQck3MUKlFV61zhFVkBfNHuCZSQWD5ReqoZfYg20yx8UMnUKV9JRtByVpsYpXp85-HMRHXWMyZnMvJmngjs0LLVhIN_5SgQ98EQC_CzXlN5lxCbbZBFfJdG87c6yl237kSTnrf4wq0wZzoZzefGPW-r22XpigZkFdT2NnAovn1E5Qe64QK9eobqBOfZkQoyqRxzRgOsB2OZSfHQ5zi-G_HG1d6Lu9nRI7NAn5lspuOjw3_cHqyJcWxvRmWnTW8Xowq65cRrfOOMLw_ZJKP6w2tk129nyohKZEGlRDGN5ng33jNBzfQZJeUwTaOGjavwPOlqxPdLd1JpkvxbzByr4_E4WGWjMck5CjPtePhfYbeWeg2gHe3RcBGWqiAXyo2WMrVMhzAylzyWjoTFXgGZpOAg0fxIjoSYifx_U");
        faceList1.add(data11);
        person1.put("faceList", faceList1);


        list.add(person1);


        Map person2 = new HashMap();
        person2.put("id", 124);
        person2.put("personName", "严锋");
        person2.put("icCard", "123456789111111112");
        person2.put("updateTime", DateFormatUtils.format(new Date(), Constant.DATE_TIME_FORMAT));
        List faceList2 = new ArrayList();
        Map data21 = new HashMap();
        data21.put("filePath", "/static/person_face/2019-07-25/668f4c6da3409a43a5aa438a9633f933646f.jpg");
        data21.put("featureCode", "bskVT3eAbr-cdSJdvernZoHyVCiNsZiRcSGVkvEd9s7kvgF9EGYmPsT068oW1rKbHAouWK4NTpJLQMPEP_7kUX8tHStCcfoG3h7dufdZwnLJUEnXqRswNMrwyqPpGafiSciV-KWZzXVb2hepm_VoSidw6PCSstcuYSX5kAmM8ZSom8NFxIUewZiAtVZfSrLV_VH5SQ2_v1LYn353L-uAtAKdD7Pc5A8ZuKp8fLNyC7Wlu27-TMnssDqCwulcHBKSaW7ZjTZGNXo8EviKjpWkSqkkSMPm_mKVK-RABuvkHH97_1_00paQwqqd7v9VFI-WaUfVZuDFr9MTK2b9xHHw453q4F6iMH5qd5gXl2MhbUn40pGeAniYaA2vaTx9tuXp06z9Smy6PAZYrZaO_djFEDbDrjZtiMPFQQ0-USHixt_DGgDtq6y0tlfhFgwJlYxWfZGfzvZaBPEUKwMT2WW_auk29f67_bDSnmoMFK9Fln2oHbOLF7MLJXI9R0yMQZabMmCEH0NVr_h97xpRg3O1MeamrTMaoyspUVWgD-KT5zlikppRIyCO1OBBD6lKLSAmFjj2x0bYtGvCfripS4-J6EI7GeO5Rwkgy7VMYOV3tb19eP--SHq1yh4xiFd2ayfOAuSOacQXE6uQS-42FQmLi-GaR8vVSDLabCUdvwxE09vj6p4XGwLdFQD1XiD5LKZNA5a0eUmcxLD4UAea4SCjXrvJsq1n_hnb3lVieYJlYygGVlY69CLPfKIIdgQcjIp8hQJiFEYDpKw1FPG0FZfzPbbPDeAyZ-Rr-zBeSNvwU7dFL1C7Q2NHFYfJgoZIO-epp0WxcvC3e4_boaaWjzffGrfCyHFp0dekTGBP_Qp5JdgI1qtpILCmWAs1mGkxP93Gw0XBF-S-F7FuLul_gPtIlWvDEhsXX9VPueuXDm9Zn_53Gaa9wqtWY9Cqg4GwLUJqQYZykCfWIN-dizYhrbNfS7TWJFDuXm4j2ApvB7u_g__HhLdOK-xEiwl6GZIn0roBqGftpMQ03Ju568KR2W6SM29EL0j_CmI7xAXJXQBtxNJtD1GxD-0NCF_K6Oel7kQXlw4-1jlJK2okjymFSlCL4ESz7R-bdpJvDXgaZNe9nooKqNeh8t6y73Q3U3U2NFksjixgxmc4F6EUZ_91EUT7GqU65_RKtT4VZ6NH-Z7pdWQhA0GnkhE6m9qKTK3WDcdMAKYTY9h32OqcU7oVHnuE-G8asJSBqqedlndV1L-Lyy0JSE7wVuYsIX9kvx2eJ6k0uzxWNPhX5XrjD4lrQFP8hk1uRlYcKZ1nIgt8wnkk4i9Qm0u3YT5e1nUArgkX7szYeOnGPX2zUhhIXiRbM8ZdEPetVGI665RhqBS4vobD94cV28xsOeylYXQOy5KiblNGR6BlKhZGjs0Ciy1oGVbpsv7OOW28GYJShvKgG4IFQs03v9i1tMA_kFUaZzOzjDljirXJ4dawno5ld81pUwnm64zbI0I96IyIfkSuIQXkzlq6iqBwZharAmpaaQmMX2zrP8M1gn6QT6A2dl3smrotM3RM2kXLD700LHyqdlBy3qHGXwqyVVyuTMY8OmVOS7Ig2Jg-b0Tl_lCAZdYodu8WRIjCSxZ_bDQbtt9nObB_TRbShRZBLPj007I1Dxjl59ugRm6_rvvqis4cStdo0vsmTPVQjBK3uCLUedH0uAlHCVMF9EG4ACqtqYVsvJgYKsicdzo6AqeQPwqmJSuhv-Ld49f-I9wNrAum78LA320h4xn8ECGZcQiqViRGS0OJKBmc_qfyhoX09JODecKMl2TOQWl3xEg77OiJv8p-_wLfzUA");
        faceList2.add(data21);
        person2.put("faceList", faceList2);


        list.add(person2);

        data.put("list", list);
        return RestResult.success(data);
    }
}
