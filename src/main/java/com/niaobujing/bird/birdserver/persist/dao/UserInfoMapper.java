package com.niaobujing.bird.birdserver.persist.dao;

import com.niaobujing.bird.birdserver.persist.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 持久层 数据访问对象
 */

@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo getUserInfo(Integer userId);
}