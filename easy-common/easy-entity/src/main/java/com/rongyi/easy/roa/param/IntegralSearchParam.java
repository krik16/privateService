package com.rongyi.easy.roa.param;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangyang on 2016/7/28.
 */
public class IntegralSearchParam implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private Integer type;
    private String userId;
    public Date registerStartTime;
    public Date registerEndTime;
    public String userComPany;//公司名还是公司code
    private String money;
    private String qrCordId;
    private String shopId;
    private String jsessionId;
    private Integer ifIncludeRP;//0需要rp 1剔除rp
    private Integer hideLoseCard;//0或null查询所有，1:查询有效卡

    public String getJsessionId() {
        return jsessionId;
    }

    public void setJsessionId(String jsessionId) {
        this.jsessionId = jsessionId;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getQrCordId() {
        return qrCordId;
    }

    public void setQrCordId(String qrCordId) {
        this.qrCordId = qrCordId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Date getRegisterStartTime() {
        return registerStartTime;
    }

    public void setRegisterStartTime(Date registerStartTime) {
        this.registerStartTime = registerStartTime;
    }

    public Date getRegisterEndTime() {
        return registerEndTime;
    }

    public void setRegisterEndTime(Date registerEndTime) {
        this.registerEndTime = registerEndTime;
    }

    public String getUserComPany() {
        return userComPany;
    }

    public void setUserComPany(String userComPany) {
        this.userComPany = userComPany;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getIfIncludeRP() {
        return ifIncludeRP;
    }

    public void setIfIncludeRP(Integer ifIncludeRP) {
        this.ifIncludeRP = ifIncludeRP;
    }

    public Integer getHideLoseCard() {
        return hideLoseCard;
    }

    public void setHideLoseCard(Integer hideLoseCard) {
        this.hideLoseCard = hideLoseCard;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("currentPage", currentPage)
                .append("pageSize", pageSize)
                .append("type", type)
                .append("userId", userId)
                .append("registerStartTime",registerStartTime)
                .append("registerEndTime", registerEndTime)
                .append("userComPany", userComPany)
                .append("money", money)
                .append("qrCordId", qrCordId)
                .append("shopId", shopId)
                .append("jsessionId", jsessionId)
                .append("ifIncludeRP", ifIncludeRP)
                .append("hideLoseCard", hideLoseCard)
                .toString();
    }

}
