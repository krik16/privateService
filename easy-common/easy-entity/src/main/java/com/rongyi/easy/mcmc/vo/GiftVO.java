package com.rongyi.easy.mcmc.vo;


import com.rongyi.core.enumerate.mcmc.TerminalTypeEnum;
import com.rongyi.easy.util.StandardConvertionUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *  礼品VO
 *
 *  @author yaoyiwei
 *  @date 2016-11-16
 *  @version 1.0
 *
 */
public class GiftVO implements Serializable {

    private String code;
    private List<String> picList;
    private String name;
    private List<GiftPaymentVO> paymentVOs;
    private Integer stock;
    private List<String> terminalMsg;
    private Date createAt;
    private String createBy;
    private Integer status;
    private Integer terminalType;
    private String platform;

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

    public List<String> getTerminalMsg() {
        String platform = StandardConvertionUtil.convertTerminalTypeToPlatform(this.terminalType);
        String[] arrayPlatform = platform.split(",");
        if(arrayPlatform.length  == 1) {
            return Arrays.asList(TerminalTypeEnum.getMsgByCode(Integer.parseInt(platform)));
        }

        List<String> list = new ArrayList<>();
        for(int i = 0; i < arrayPlatform.length; i++) {
            if(null != TerminalTypeEnum.getMsgByCode(Integer.parseInt(arrayPlatform[i]))) {
                list.add(TerminalTypeEnum.getMsgByCode(Integer.parseInt(arrayPlatform[i])));
            }
        }

        return list;
    }

    public void setTerminalMsg(List<String> terminalMsg) {
        this.terminalMsg = terminalMsg;
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
                ", terminalMsg=" + terminalMsg +
                ", createAt=" + createAt +
                ", createBy='" + createBy + '\'' +
                ", status=" + status +
                ", terminalType=" + terminalType +
                ", platform=" + platform +
                '}';
    }
}
