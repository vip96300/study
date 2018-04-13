package com.hhf.study.client.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author huanghongfei
 * @Description
 * @Date Create in 16:19 2018/4/4
 */
@Entity
@Table(name="mallsys_products")
public class ProductEntity {

    public ProductEntity(){}

    @Id
    @GeneratedValue
    private Long id;
    private Long shopid;
    private Long categoryid;
    private String categorypath;
    private Long typeid;
    private Long brandid;
    private String productname;
    private String productcode;
    private String shortdescription;
    private Integer salestatus;
    private Integer auditstatus;
    private Date addeddate;
    private Long displaysequence;
    private String imagepath;
    private Double marketprice;
    private Double minsaleprice;
    private Boolean hassku;
    private Long visticounts;
    private Long salecounts;
    private Long freighttemplateid;
    private Double weight;
    private Double volume;
    private Integer quantity;
    private String measureunit;
    private Integer editstatus;
    private Boolean isdeleted;
    private Integer maxbuycount;
    private Boolean isspecialbuy;
    private Boolean isrecommend;
    private String videocover;
    private String videoscript;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategorypath() {
        return categorypath;
    }

    public void setCategorypath(String categorypath) {
        this.categorypath = categorypath;
    }

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public Integer getSalestatus() {
        return salestatus;
    }

    public void setSalestatus(Integer salestatus) {
        this.salestatus = salestatus;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Date getAddeddate() {
        return addeddate;
    }

    public void setAddeddate(Date addeddate) {
        this.addeddate = addeddate;
    }

    public Long getDisplaysequence() {
        return displaysequence;
    }

    public void setDisplaysequence(Long displaysequence) {
        this.displaysequence = displaysequence;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public Double getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(Double marketprice) {
        this.marketprice = marketprice;
    }

    public Double getMinsaleprice() {
        return minsaleprice;
    }

    public void setMinsaleprice(Double minsaleprice) {
        this.minsaleprice = minsaleprice;
    }

    public Boolean getHassku() {
        return hassku;
    }

    public void setHassku(Boolean hassku) {
        this.hassku = hassku;
    }

    public Long getVisticounts() {
        return visticounts;
    }

    public void setVisticounts(Long visticounts) {
        this.visticounts = visticounts;
    }

    public Long getSalecounts() {
        return salecounts;
    }

    public void setSalecounts(Long salecounts) {
        this.salecounts = salecounts;
    }

    public Long getFreighttemplateid() {
        return freighttemplateid;
    }

    public void setFreighttemplateid(Long freighttemplateid) {
        this.freighttemplateid = freighttemplateid;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    public Integer getEditstatus() {
        return editstatus;
    }

    public void setEditstatus(Integer editstatus) {
        this.editstatus = editstatus;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getMaxbuycount() {
        return maxbuycount;
    }

    public void setMaxbuycount(Integer maxbuycount) {
        this.maxbuycount = maxbuycount;
    }

    public Boolean getIsspecialbuy() {
        return isspecialbuy;
    }

    public void setIsspecialbuy(Boolean isspecialbuy) {
        this.isspecialbuy = isspecialbuy;
    }

    public Boolean getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Boolean isrecommend) {
        this.isrecommend = isrecommend;
    }

    public String getVideocover() {
        return videocover;
    }

    public void setVideocover(String videocover) {
        this.videocover = videocover;
    }

    public String getVideoscript() {
        return videoscript;
    }

    public void setVideoscript(String videoscript) {
        this.videoscript = videoscript;
    }
}
