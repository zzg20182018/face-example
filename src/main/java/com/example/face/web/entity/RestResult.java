package com.example.face.web.entity;

public class RestResult {
    public static final RestResult SUCCESS = new RestResult();

    int code;
    String message;
    Object data;

    public RestResult() {
        message = "成功";
    }

    public RestResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static RestResult success(Object data) {
        RestResult restResult = new RestResult();
        restResult.setData(data);
        return restResult;
    }

    public static RestResult result(int code, String message) {
        RestResult result = new RestResult(code, message);
        return result;
    }

    public static RestResult result(int code, String message, Object data) {
        RestResult result = new RestResult(code, message);
        result.data = data;
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}