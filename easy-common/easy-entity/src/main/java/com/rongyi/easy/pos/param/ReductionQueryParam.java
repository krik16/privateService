package com.rongyi.easy.pos.param;

import com.rongyi.easy.pos.entity.ReductionUnitEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 获取满减活动请求参数
 *
 * @author wangjh7
 * @date 2017-02-28
 */
public class ReductionQueryParam implements Serializable {
    private String mallId;
    private String shopId;
    // 	用户类型 1：普通用户 2：会员
    private Integer memberType;
    // 平台类型 2：微信 6：POS
    private Integer platform;
    // 商品卡券集合
    private List<ReductionUnitEntity> unitList;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public List<ReductionUnitEntity> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<ReductionUnitEntity> unitList) {
        this.unitList = unitList;
    }

    @Override
    public String toString() {
        return "ReductionQueryParam{" +
                "mallId='" + mallId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", memberType=" + memberType +
                ", platform=" + platform +
                ", unitList=" + unitList +
                '}';
    }
}
