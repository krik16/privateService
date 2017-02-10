package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * 商品在各个端的显示隐藏Param
 *
 * @author yaoyiwei
 * @date 2017-02-08
 * @version 1.0
 *
 */
public class CommoditySwitchParam  implements Serializable {

    private String commodityId;
    private String terminalId;
    private String switchStatus;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    @Override
    public String toString() {
        return "CommoditySwitchParam{" +
                "commodityId='" + commodityId + '\'' +
                ", terminalId='" + terminalId + '\'' +
                ", switchStatus='" + switchStatus + '\'' +
                '}';
    }
}
