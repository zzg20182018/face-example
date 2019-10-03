package com.example.face.constant;

public enum RespCode {

    CODE_0(0, "成功"),
    CODE_1(1, "服务器内部错误"),
    CODE_2(2, "没有设置公司"),
    CODE_3(3, "编号不存在"),
    CODE_4(4, "签名错误"),
    CODE_5(5, "没有升级版本"),
    CODE_6(6, "不支持的算法类型"),
    CODE_7(7, "参数错误"),
    ;

    private final int value;
    private final String name;

    private RespCode(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public short getValue() {
        return (short)value;
    }

    public String getName() {
        return name;
    }
}
