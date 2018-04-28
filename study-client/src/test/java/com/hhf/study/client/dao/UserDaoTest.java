package com.hhf.study.client.dao;

import com.hhf.study.client.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 14:46 2018/4/28
 */
public class UserDaoTest extends BaseTest{

    @Autowired
    private UserDao userDao;

    @Test
    public void findByUserName(){
        System.err.println(userDao.findByUserName("huanghongfei").getPassword());
    }
}
