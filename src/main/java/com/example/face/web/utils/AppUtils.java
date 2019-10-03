package com.example.face.web.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AppUtils {
    public static final String APP_ID = "test";//该值为测试使用，实际项目须向第三方申请
    public static final String APP_SECRET = "31f7a35baf851a42a2a9dcba5bbf8623832d";//该测试使用，实际项目须向第三方申请

    /**
     * 签名
     */
    public static String sign(Map<String, String> param) {
        List<String> keys = new ArrayList<String>(param.keySet());
        Collections.sort(keys);

        StringBuffer toSign = new StringBuffer();
        for (String key : keys) {
            String value = param.get(key);
            if (null != value && !"".equals(value) && !"sign".equals(key)
                    && !"key".equals(key)) {
                toSign.append(key + "=" + value + "&");
            }
        }

        toSign.setLength(toSign.length() - 1);

        try {
            return DigestUtils.md5Hex(toSign.toString().getBytes("UTF-8"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String md5Hex(File file) {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
            return DigestUtils.md5Hex(stream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            IOUtils.closeQuietly(stream);
        }
    }

    public static boolean makeParentDir(File file) {
        if (!file.getParentFile().exists()) {
            return file.getParentFile().mkdirs();
        }
        return false;
    }

}
