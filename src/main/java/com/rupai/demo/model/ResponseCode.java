package com.rupai.demo.model;

/**
 * @author zhoupeng
 */
public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),

    /**
     * 失败
     */
    ERRPR(1, "失败");

    private int code;

    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
