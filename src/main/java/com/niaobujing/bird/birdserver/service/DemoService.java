package com.niaobujing.bird.birdserver.service;

import com.niaobujing.bird.birdserver.persist.model.UserInfo;

/**
 * Created by zgd on 2018/1/18.
 * 服务层接口，上层是控制器，下层是持久层，为控制器提供数据，从持久层获取数据
 */
public interface DemoService {

    UserInfo getUserInfo(Integer userId);
}
