package com.rongyi.easy.tms.vo.v2;

import com.rongyi.easy.rmmm.vo.OrderManagerVO;

import java.io.Serializable;

/**
 * kejun
 * 2016/4/12 18:29
 **/
public class SubOrderVO extends OrderManagerVO implements Serializable{

    private static final long serialVersionUID = 229510295491487373L;

    /**
     * 商品编码
     */
    private String commodityMid;
    /**
     * 购买数量
     */
    private Integer quantity;
    /**
     * 商品规格id
     */
    private String commoditySpecMid;

    public String getCommodityMid() {
        return commodityMid;
    }

    public void setCommodityMid(String commodityMid) {
        this.commodityMid = commodityMid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCommoditySpecMid() {
        return commoditySpecMid;
    }

    public void setCommoditySpecMid(String commoditySpecMid) {
        this.commoditySpecMid = commoditySpecMid;
    }
}
