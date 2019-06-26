package com.common;

public class Result {

    /**
     * 返回码
     */
    private String code;

    /**
     * 错误信息
     */
    private String errorMessage;

    /**
     * 数据
     */
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}