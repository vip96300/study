package com.hhf.study.client.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @Column(name="username",nullable = false,unique = true)
    private String username;
    /**
     * 登录密码
     */
    @Column(name="password",nullable = false)
    private String password;
    /**
     * 用户：权限
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "study_user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {@JoinColumn(name = "role_id") })
    private List<RoleEntity> roleList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleEntity> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleEntity> roleList) {
        this.roleList = roleList;
    }
}
