package com.niaobujing.bird.birdserver.api.controller;

import com.alibaba.fastjson.JSON;
import com.niaobujing.bird.birdserver.api.response.GenerateResponse;
import com.niaobujing.bird.birdserver.common.constants.ResponseEnum;
import com.niaobujing.bird.birdserver.common.utils.CommonUtils;
import com.niaobujing.bird.birdserver.persist.model.UserInfo;
import com.niaobujing.bird.birdserver.service.DemoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zgd on 2018/1/18.
 * 控制器，api请求入口以及数据返回
 */
@RestController
public class DemoController extends GenerateResponse{

    private static final Logger logger = LogManager.getLogger("DevLog");

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    public String demoConsole(){
        String str = "mengmeng is a sb!";
        return JSON.toJSONString(str);
    }

    @RequestMapping("/demo/rds/{userId}")
    public String demoRDS(@PathVariable String userId, HttpServletRequest servletRequest, HttpServletResponse servletResponse){
        try{
            if(StringUtils.isEmpty(userId) || !StringUtils.isNumeric(userId)){
                userId = "123";
            }
            UserInfo userInfo = demoService.getUserInfo(Integer.parseInt(userId));
            if(userInfo == null){
                return generate(ResponseEnum.USER_NOT_FOUND, null);
            }
            //打印日志
            logger.info("[ip:" + CommonUtils.getIpAddr(servletRequest) + "] demoRDS：request:" + userId + ";response:" + JSON.toJSONString(userInfo)+ ".");
            //跨越处理
            servletResponse.addHeader("Access-Control-Allow-Origin", "*");
            servletResponse.addHeader("Access-Control-Allow-Methods", "GET");
            servletResponse.addHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
            return generate(ResponseEnum.SUCCESS, userInfo);
        }catch (Exception e){
            return generate(ResponseEnum.ERROR, null);
        }
    }
}
