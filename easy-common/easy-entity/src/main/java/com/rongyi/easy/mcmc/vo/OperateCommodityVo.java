package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuying on 2016/6/22.
 */
public class OperateCommodityVo implements Serializable {


    private String  id ;//系统编号
    private String  name;//商品名称
    private String  picList;//商品图片
    private String  categoryIds;//商品所属的品类列表
    private String  mallName;//商场名称
    private String  shopName;//店铺名称
    private Integer source;// 渠道  0商家，1买手
    private Integer  status;//商品状态
    private Date createAt ;//创建时间
    private String reason;
    private String buyerAccount;
    private Date soldOutAt;//下架时间
    private String commodityModelNo;
    private Integer terminalType;
    private String weAndTeStatus;//商品在终端机与App上的隐藏与显示


    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public String getWeAndTeStatus() {
        return weAndTeStatus;
    }

    public void setWeAndTeStatus(String weAndTeStatus) {
        this.weAndTeStatus = weAndTeStatus;
    }

    public String getCommodityModelNo() {
        return commodityModelNo;
    }

    public void setCommodityModelNo(String commodityModelNo) {
        this.commodityModelNo = commodityModelNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicList() {
        return picList;
    }

    public void setPicList(String picList) {
        this.picList = picList;
    }

    public String getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public Date getSoldOutAt() {
        return soldOutAt;
    }

    public void setSoldOutAt(Date soldOutAt) {
        this.soldOutAt = soldOutAt;
    }

    @Override
    public String toString() {
        return "OperateCommodityVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", picList='" + picList + '\'' +
                ", categoryIds='" + categoryIds + '\'' +
                ", mallName='" + mallName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", source=" + source +
                ", status=" + status +
                ", createAt=" + createAt +
                ", reason='" + reason + '\'' +
                ", buyerAccount='" + buyerAccount + '\'' +
                ", soldOutAt=" + soldOutAt +
                ", commodityModelNo='" + commodityModelNo + '\'' +
                ", terminalType=" + terminalType +
                ", weAndTeStatus='" + weAndTeStatus + '\'' +
                '}';
    }
}
