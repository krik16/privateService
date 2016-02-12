package com.rongyi.easy.activitymanage.vo;

import java.io.Serializable;

/**
 * Created by Leon on 2016/2/11.
 */
public class ActivityGoodsVO implements Serializable {

    private String goodsId;
    private String goodsName;

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return goodsName;
    }
}
