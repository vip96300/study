package com.hhf.study.client.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 15:08 2018/4/28
 */
@Entity
@Table(name="study_resource")
public class ResourceEntity extends BaseEntity{

    /**
     * 资源
     */
    @Column(unique = true)
    private String uri;
    /**
     * 说明
     */
    @Column()
    private String depict;
    /**
     * 角色集合
     */
    @Column()
    private String [] roles;
    /**
     * 权限集合
     */
    @Column()
    private String [] permissions;
    /**
     * 是否启用
     */
    @Column(length=1)
    private Integer isEnable;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}
