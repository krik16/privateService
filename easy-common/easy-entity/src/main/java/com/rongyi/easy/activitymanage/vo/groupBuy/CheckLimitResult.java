package com.rongyi.easy.activitymanage.vo.groupBuy;

import java.io.Serializable;

/**
 * Created by caohongjiang on 2016/10/26.
 */
public class CheckLimitResult implements Serializable {


    private static final long serialVersionUID = -7629710913698536850L;

    /**
     *0 ,开团,1 参团
     */
    private Integer goupyType;
    private Boolean isAllowed;

    public Integer getGoupyType() {
        return goupyType;
    }

    public void setGoupyType(Integer goupyType) {
        this.goupyType = goupyType;
    }

    public Boolean getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    @Override
    public String toString() {
        return "CheckLimitResult{" +
                "goupyType=" + goupyType +
                ", isAllowed=" + isAllowed +
                '}';
    }
}
