package com.xiaobo.csleeve.core;

public class UnifyResponse {
    private int code;
    private String message;
    private String request;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getRequest() {
        return request;
    }

    public UnifyResponse(int code, String message, String request){
        this.code = code;
        this.message = message;
        this.request = request;
    }
}
