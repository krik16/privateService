package com.rongyi.easy.mcmc.vo;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *  礼品VO
 *
 *  @author yaoyiwei
 *  @date 2016-11-27
 *  @version 1.0
 *
 */
public class GiftVO implements Serializable {

    private String id;
    private String code;
    private List<String> picList;
    private String name;
    private List<GiftPaymentVO> paymentVOs;
    private Integer stock;
    private Date createAt;
    private String createBy;
    private Integer status;
    private Integer terminalType;
    private String platform;
    private String mappingId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GiftPaymentVO> getPaymentVOs() {
        return paymentVOs;
    }

    public void setPaymentVOs(List<GiftPaymentVO> paymentVOs) {
        this.paymentVOs = paymentVOs;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GiftVO{" +
                "code='" + code + '\'' +
                ", picList=" + picList +
                ", name='" + name + '\'' +
                ", paymentVOs=" + paymentVOs +
                ", stock=" + stock +
                ", createAt=" + createAt +
                ", createBy='" + createBy + '\'' +
                ", status=" + status +
                ", terminalType=" + terminalType +
                ", platform=" + platform +
                '}';
    }
}
