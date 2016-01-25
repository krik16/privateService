package com.rongyi.easy.coupon.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 订单可用和不可用抵扣券列表
 * Created by lqy on 2015/11/21.
 */
public class PlatformRebateForOrderVO implements Serializable {

    /**
     * 订单可用抵扣券列表
     */
    private List<PlatformRebateVO> usablePlatformRebateVOs;

    /**
     * 订单不可用抵扣券列表
     */
    private List<PlatformRebateVO> unUsablePlatformRebateVOs;

    public List<PlatformRebateVO> getUsablePlatformRebateVOs() {
        return usablePlatformRebateVOs;
    }

    public void setUsablePlatformRebateVOs(List<PlatformRebateVO> usablePlatformRebateVOs) {
        this.usablePlatformRebateVOs = usablePlatformRebateVOs;
    }

    public List<PlatformRebateVO> getUnUsablePlatformRebateVOs() {
        return unUsablePlatformRebateVOs;
    }

    public void setUnUsablePlatformRebateVOs(List<PlatformRebateVO> unUsablePlatformRebateVOs) {
        this.unUsablePlatformRebateVOs = unUsablePlatformRebateVOs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("usablePlatformRebateVOs", usablePlatformRebateVOs)
                .append("unUsablePlatformRebateVOs", unUsablePlatformRebateVOs)
                .toString();
    }
}
