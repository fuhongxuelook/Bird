package com.niaobujing.bird.birdserver.service.impl;

import com.niaobujing.bird.birdserver.persist.dao.UserInfoMapper;
import com.niaobujing.bird.birdserver.persist.model.UserInfo;
import com.niaobujing.bird.birdserver.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zgd on 2018/1/18.
 * 服务层接口实现
 */
@Service
public class DemoServieImpl implements DemoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(Integer userId) {
        return userInfoMapper.getUserInfo(userId);
    }
}
