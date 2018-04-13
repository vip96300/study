package com.hhf.study.client.service;

import com.hhf.study.client.dao.UserDao;
import com.hhf.study.client.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:24 2018/3/26
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity get(long userId){
        return userDao.findOne(userId);
    }


}
