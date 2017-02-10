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
    private String serviceId;
    private String switchStatus;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
                ", serviceId='" + serviceId + '\'' +
                ", switchStatus='" + switchStatus + '\'' +
                '}';
    }
}
