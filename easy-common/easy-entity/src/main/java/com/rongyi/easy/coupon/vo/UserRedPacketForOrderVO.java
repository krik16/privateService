package com.rongyi.easy.coupon.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 订单可使用和不可使用的红包列表
 * Created by lqy on 2015/11/23.
 */
public class UserRedPacketForOrderVO implements Serializable {

    /**
     * 订单可用红包列表
     */
    private List<UserRedPacketVO> usableUserRedPacketVOs;

    /**
     * 订单不可用红包列表
     */
    private List<UserRedPacketVO> unUsableUserRedPacketVOs;

    public List<UserRedPacketVO> getUsableUserRedPacketVOs() {
        return usableUserRedPacketVOs;
    }

    public void setUsableUserRedPacketVOs(List<UserRedPacketVO> usableUserRedPacketVOs) {
        this.usableUserRedPacketVOs = usableUserRedPacketVOs;
    }

    public List<UserRedPacketVO> getUnUsableUserRedPacketVOs() {
        return unUsableUserRedPacketVOs;
    }

    public void setUnUsableUserRedPacketVOs(List<UserRedPacketVO> unUsableUserRedPacketVOs) {
        this.unUsableUserRedPacketVOs = unUsableUserRedPacketVOs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("usableUserRedPacketVOs", usableUserRedPacketVOs)
                .append("unUsableUserRedPacketVOs", unUsableUserRedPacketVOs)
                .toString();
    }
}
