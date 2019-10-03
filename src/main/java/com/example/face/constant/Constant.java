package com.example.face.constant;

import java.nio.charset.Charset;

public class Constant {

    public final static long AGENT_ADMIN_USER_ID = 1;
    public final static long ADMIN_USER_ID = 1;
    public final static int PLATFORM_ID = 1;

    public final static String COOKIE_NAME_APP_ID = "app_id";

    public static final byte[] EMPTY_BATTERY_BYTES = new byte[]{
            0, 0, 0, 0
    };

    public final static String SESSION_KEY_USER = "SESSION_KEY_USER";
    public final static String SESSION_AUTH_CODE = "SESSION_KEY_AUTH_CODE";
    public final static String DEFAULT_PASSWORD = "123456";

    public final static String ENCODING_UTF_8 = "utf-8";
    public final static Charset CHARSET_UTF_8 = Charset.forName(ENCODING_UTF_8);

    public final static String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public final static String DATE_FORMAT = "yyyy-MM-dd";
    public final static String HOUR_MINUTE = "HH:mm";

    public final static String HTTP_HEADER_COMMUNITY_TIMESTAMP = "Community-Timestamp";
    public final static String HTTP_HEADER_COMMUNITY_SIGNATURE = "Community-Signature";

    public final static String VALIDATOR_PATTERN_MOBILE = "^1[3|4|5|6|7|8|9][0-9]\\d{8}$";

    public final static int SYSTEM_APP_ID = 0;

    //开放平台地址
    public static String SERVER_URL = "https://openapi.alipay.com/gateway.do";

    public final static String[] IMAGE_SUFFIX = {"png", "jpeg", "bmp", "jpg", "gif", "ico"};

    //支付宝生活号类型
    public static final int TYPE_FW = 1;
    //微信公众号类型
    public static final int TYPE_MP = 2;
    //支付宝小程序
    public static final int TYPE_FWAPP = 3;

}
