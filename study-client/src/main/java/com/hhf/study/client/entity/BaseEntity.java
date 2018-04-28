package com.hhf.study.client.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 10:40 2018/3/26
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 删除标记
     */
    @Column(nullable=false,length=1)
    private Integer isDeleted;
    /**
     * 创建时间
     */
    @Column(nullable=false,length=19)
    private String createTime;
    /**
     * 更新时间
     */
    @Column(nullable=false,length=19)
    private String updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
