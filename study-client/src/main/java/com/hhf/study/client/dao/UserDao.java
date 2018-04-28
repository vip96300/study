package com.hhf.study.client.dao;

import com.hhf.study.client.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:23 2018/3/26
 */
public interface UserDao extends JpaRepository<UserEntity,Long>{

    UserEntity findByUserName(String userName);

}
