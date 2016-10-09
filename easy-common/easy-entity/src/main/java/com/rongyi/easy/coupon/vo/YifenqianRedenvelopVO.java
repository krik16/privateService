package com.rongyi.easy.coupon.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2016/10/9.
 */
public class YifenqianRedenvelopVO implements Serializable {
    private List<String> commodityIds;
    private Integer status;

    public List<String> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<String> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "YifenqianRedenvelopVO{" +
                "commodityIds=" + commodityIds +
                ", status=" + status +
                '}';
    }
}
