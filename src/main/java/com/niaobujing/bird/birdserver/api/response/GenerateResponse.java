package com.niaobujing.bird.birdserver.api.response;


import com.alibaba.fastjson.JSON;
import com.niaobujing.bird.birdserver.common.constants.ResponseEnum;

/**
 * Created by zgd on 2018/1/18.
 * 拼装数据
 */
public abstract class GenerateResponse {

    protected String generate(ResponseEnum responseEnum, Object data){
        BaseResponse response = new BaseResponse(responseEnum.getCode(), responseEnum.getTips(), data);
        return JSON.toJSONString(response);
    }
}
