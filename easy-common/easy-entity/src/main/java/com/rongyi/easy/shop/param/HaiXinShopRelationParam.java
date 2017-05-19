package com.rongyi.easy.shop.param;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2017/5/15.
 */
public class HaiXinShopRelationParam implements Serializable {

    private String shopMid;
    private String importUrl;

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getImportUrl() {
        return importUrl;
    }

    public void setImportUrl(String importUrl) {
        this.importUrl = importUrl;
    }

    @Override
    public String toString() {
        return "HaiXinShopRelationParam{" +
                "shopMid='" + shopMid + '\'' +
                ", importUrl='" + importUrl + '\'' +
                '}';
    }
}
