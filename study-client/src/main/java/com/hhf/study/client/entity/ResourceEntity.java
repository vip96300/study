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
     * 资源名称
     */
    @Column(nullable = false)
    private String name;
    /**
     * 资源路径
     */
    @Column(nullable = false,unique = true)
    private String uri;
    /**
     * 说明
     */
    @Column()
    private String depict;
    /**
     * 是否启用
     */
    @Column(nullable = false,length=1)
    private Integer isEnable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}
