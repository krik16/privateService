package com.rongyi.easy.content_v2.param;

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

/**
 * Created by WUH
 * on 2017/1/18.
 */
public class CashCouponParam extends BaseParam  implements Serializable {
    private Integer specialId;

    public Integer getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Integer specialId) {
        this.specialId = specialId;
    }

    @Override
    public String toString() {
        return "CashCouponParam{" +
                "specialId=" + specialId +
                "BaseParam{" + super.toString() + "}" +
                '}';
    }
}
