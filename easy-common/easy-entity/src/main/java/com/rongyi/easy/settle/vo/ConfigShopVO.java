package com.rongyi.easy.settle.vo;

import com.rongyi.easy.roa.vo.ShopPositionVO;

import java.io.Serializable;

/**
 * Created by hebo on 2015/12/14.
 *
 */
public class ConfigShopVO implements Serializable{
    private String shopId;
//    private String shopName;
    private String accountList;
    private String bizRealAddress;//商户地址
    private String bizName;
    private Integer linkShopOp;//关联店铺操作(0:选择,1:排除)
    private  Integer linkRole;//关联角色（1：导购  2：买手）
    private Integer linkType;//关联类型（0:所有,1:自身,2:部分）
//    private ShopPositionVO position;//详细地址

    public String getBizRealAddress() {
        return bizRealAddress;
    }

    public void setBizRealAddress(String bizRealAddress) {
        this.bizRealAddress = bizRealAddress;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public Integer getLinkShopOp() {
        return linkShopOp;
    }

    public void setLinkShopOp(Integer linkShopOp) {
        this.linkShopOp = linkShopOp;
    }

    public Integer getLinkRole() {
        return linkRole;
    }

    public void setLinkRole(Integer linkRole) {
        this.linkRole = linkRole;
    }

    public Integer getLinkType() {
        return linkType;
    }

    public void setLinkType(Integer linkType) {
        this.linkType = linkType;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

//    public String getShopName() {
//        return shopName;
//    }
//
//    public void setShopName(String shopName) {
//        this.shopName = shopName;
//    }

    public String getAccountList() {
        return accountList;
    }

    public void setAccountList(String accountList) {
        this.accountList = accountList;
    }

//    public ShopPositionVO getPosition() {
//        return position;
//    }
//
//    public void setPosition(ShopPositionVO position) {
//        this.position = position;
//    }
}
