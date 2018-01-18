package com.niaobujing.bird.birdserver.common.constants;

/**
 * Created by zgd on 2018/1/18.
 * 返回数据状态码
 */
public enum ResponseEnum {

    SUCCESS("200", "SUCCESS_TIPS"),
    ERROR("500", "ERROR_TIPS"),
    USER_NOT_FOUND("1001", "USER_NOT_FOUND_TIPS");

    private String code;
    private String tips;
    ResponseEnum(String code, String tips){
        this.code = code;
        this.tips = tips;
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
}
