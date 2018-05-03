package com.hhf.study.client.entity;

import com.hhf.study.common.constant.BasicConstants;
import com.hhf.study.common.utils.DateUtils;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 10:40 2018/3/26
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

    public BaseEntity(){
        this.isDeleted= BasicConstants.YN.NO.getValue();
        this.createTime= DateUtils.getTimeStr(new Date());
    }
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * 备注
     */
    @Column()
    private String remark;
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
    @Column(length=19)
    private String updateTime;
    /**
     * 删除时间
     */
    @Column(length=19)
    private String deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }
}
