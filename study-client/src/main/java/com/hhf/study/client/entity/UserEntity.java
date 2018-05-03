package com.hhf.study.client.entity;

import javax.persistence.*;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 10:51 2018/3/26
 */
@Entity
@Table(name="study_user")
public class UserEntity extends BaseEntity{
    /**
     * 用户名
     */
    @Column(nullable = false,unique = true)
    private String userName;
    /**
     * 登录密码
     */
    @Column(name="password",nullable = false)
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
