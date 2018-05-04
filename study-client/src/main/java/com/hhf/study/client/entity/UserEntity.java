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
     * 昵称
     */
    @Column()
    private String nickName;
    /**
     * 用户名
     */
    @Column(nullable = false,unique = true)
    private String userName;
    /**
     * 登录密码
     */
    @Column(nullable = false)
    private String password;
    /**
     * 是否启用
     */
    @Column(nullable = false,length = 1)
    private Integer isEnabled;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

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

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }
}
