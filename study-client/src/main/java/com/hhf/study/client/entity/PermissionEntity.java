package com.hhf.study.client.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 15:36 2018/3/26
 */
@Entity
@Table(name="study_user_role_permission")
public class PermissionEntity extends BaseEntity{

    /**
     * 权限名称
     */
    @Column(nullable=false,unique = true)
    private String name;
    /**
     * 地址
     */
    @Column(nullable=false,unique = true)
    private String url;

    /**
     * 权限：角色
     */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "study_user_role_permission", joinColumns = { @JoinColumn(name = "permission_id") }, inverseJoinColumns = {@JoinColumn(name = "role_id") })
    private List<RoleEntity> roleList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
