package com.rongyi.easy.settle.entity;

import java.io.Serializable;

/**
 * Created by Ventures on 2015/12/8.
 */
public class ConfigShop implements Serializable{
    private Integer id;
    private Integer configId;
    private String shopId;
    private String userList;
    private String realUserList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUserList() {
        return userList;
    }

    public void setUserList(String userList) {
        this.userList = userList;
    }

    public String getRealUserList() {
        return realUserList;
    }

    public void setRealUserList(String realUserList) {
        this.realUserList = realUserList;
    }
}
