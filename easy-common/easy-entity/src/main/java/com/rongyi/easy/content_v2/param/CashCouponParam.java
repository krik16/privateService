package com.rongyi.easy.content_v2.param;

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

/**
 * Created by WUH
 * on 2017/1/18.
 */
public class CashCouponParam extends BaseParam  implements Serializable {
    private Integer specialId;
    private Integer specialType;
    private String userId;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getSpecialType() {
        return specialType;
    }

    public void setSpecialType(Integer specialType) {
        this.specialType = specialType;
    }

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
                "specialType=" + specialType +
                "userId=" + userId +
                "BaseParam{" + super.toString() + "}" +
                '}';
    }
}
