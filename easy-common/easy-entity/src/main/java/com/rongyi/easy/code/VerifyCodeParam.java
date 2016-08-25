package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/5/23 19:58
 * Package:com.rongyi.easy.code
 * Project:easy-market
 */
public class VerifyCodeParam implements Serializable {
    private final static Long serialVersionUID=1L;

    /**
     * 码
     */
    private String code;
    /**
     * 活动id
     */
    private String activityId;
    /**
     * 0:卡券；1：邀请码；2：礼品码 4 活动奖品码
     */
    private Integer type;

    /**
     * 商场id
     */
    private String mallId;

    /**
     * 店铺id
     */
    private String shopId;
    /**
     * 校验方式
     */
    private Long useMode;

    /**
     * 校验来源（PA/APP）
     */
    private String source;
    /**
     * 校验人id
     */
    private Integer sellerId;

    /**
     * 活动终端 1app 2微商城 3标准微信 4互动屏
     */
    private Integer terminal;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Long getUseMode() {
        return useMode;
    }

    public void setUseMode(Long useMode) {
        this.useMode = useMode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VerifyCodeParam{");
        sb.append("code=").append(code);
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", type=").append(type);
        sb.append(", mallId='").append(mallId).append('\'');
        sb.append(", shopId='").append(shopId).append('\'');
        sb.append(", useMode=").append(useMode);
        sb.append(", source='").append(source).append('\'');
        sb.append(", sellerId=").append(sellerId);
        sb.append(", terminal=").append(terminal);
        sb.append('}');
        return sb.toString();
    }
}
