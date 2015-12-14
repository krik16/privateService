package com.rongyi.easy.settle.vo;

import java.io.Serializable;

/**
 * Created by hebo on 2015/12/14.
 *
 */
public class ConfigShopVO implements Serializable{
    private String shopId;
    private String shopName;
    private String accountList;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAccountList() {
        return accountList;
    }

    public void setAccountList(String accountList) {
        this.accountList = accountList;
    }
}
