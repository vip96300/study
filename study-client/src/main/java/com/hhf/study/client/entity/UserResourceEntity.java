package com.hhf.study.client.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @Author huanghongfei
 * @Description description
 * @Date Create in 10:50 2018/5/2
 */
@Entity
@Table(name="study_user_resource",uniqueConstraints = {@UniqueConstraint(columnNames={"user_id","resource_id"})})
public class UserResourceEntity extends BaseEntity{

    /**
     * 用户编号
     */
    @Column(name="user_id",nullable=false)
    private Long userId;
    /**
     * 资源编号
     */
    @Column(name="resource_id",nullable = false)
    private Long resourceId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}
