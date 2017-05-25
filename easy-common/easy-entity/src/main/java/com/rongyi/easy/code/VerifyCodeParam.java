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
     * 0:卡券；1：邀请码；2：礼品码 4 活动奖品码 5:BO应用券码
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

    private Integer count;

    private Integer platform;

    //0:商家后台；1：摩店；2：轻应用;3 :积分POS；4：家得利验券；5：其他  6：BO 万达BO渠道验券
    private Integer validChannel;

    private String signature;

    private String partnerId;

    private Long ts;

    private String nonceStr;

    private String storeId;

    private String wid;

    public Integer getValidChannel() {
        return validChannel;
    }

    public void setValidChannel(Integer validChannel) {
        this.validChannel = validChannel;
    }

    public Integer getCount() {
        if (count == null) {
            return 1;
        }
        return count;
    }

    public Integer getPlatform() {
        if (platform == null) {
            platform=0;
        }
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

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

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VerifyCodeParam{");
        sb.append("code='").append(code).append('\'');
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", type=").append(type);
        sb.append(", mallId='").append(mallId).append('\'');
        sb.append(", shopId='").append(shopId).append('\'');
        sb.append(", useMode=").append(useMode);
        sb.append(", source='").append(source).append('\'');
        sb.append(", sellerId=").append(sellerId);
        sb.append(", terminal=").append(terminal);
        sb.append(", count=").append(count);
        sb.append(", platform=").append(platform);
        sb.append(", validChannel=").append(validChannel);
        sb.append(", signature='").append(signature).append('\'');
        sb.append(", partnerId='").append(partnerId).append('\'');
        sb.append(", ts=").append(ts);
        sb.append(", nonceStr='").append(nonceStr).append('\'');
        sb.append(", storeId='").append(storeId).append('\'');
        sb.append(", wid='").append(wid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
