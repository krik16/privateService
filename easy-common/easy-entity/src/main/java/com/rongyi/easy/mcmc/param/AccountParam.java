package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * Created by yaoyiwei on 2016/11/29.
 */
public class AccountParam implements Serializable {

    private String zoneId;
    private Integer type; // 0集团 1商场 4,5 店铺
    private String shopId;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
