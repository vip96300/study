package com.hhf.study.client.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:32 2018/3/26
 */
@Entity
@Table(name="study_user_role")
public class RoleEntity extends BaseEntity{

    /**
     * 角色名称
     */
    @Column(nullable=false,unique = true)
    private String name;
    /**
     * 角色描述
     */
    @Column()
    private String depict;
    /**
     * 是否启用
     */
    @Column(nullable = false,length=1)
    private Integer isEnable;

    /**
     * 角色：权限
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "study_user_role_permission", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = {@JoinColumn(name = "permission_id") })
    private List<PermissionEntity> permissionList;

    /**
     * 角色：用户
     */
    @ManyToMany
    @JoinTable(name = "study_user_role", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = {@JoinColumn(name = "user_id") })
    private List<UserEntity> userList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public List<PermissionEntity> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<PermissionEntity> permissionList) {
        this.permissionList = permissionList;
    }

    public List<UserEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<UserEntity> userList) {
        this.userList = userList;
    }
}
