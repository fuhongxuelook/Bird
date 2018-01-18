package com.niaobujing.bird.birdserver.api.response;

/**
 * Created by zgd on 2018/1/18.
 */
public class BaseResponse {

    private String code;

    private String tips;

    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(String code, String tips, Object data) {
        this.code = code;
        this.tips = tips;
        this.data = data==null?"":data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\":" + code + "," +
                "\"tips\":" + tips + "," +
                "\"data\":" + data +
                "}";
    }
}
