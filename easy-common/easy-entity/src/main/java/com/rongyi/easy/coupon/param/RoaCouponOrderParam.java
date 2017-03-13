package com.rongyi.easy.coupon.param;

import com.rongyi.core.common.util.JsonUtil;

import java.io.Serializable;
import java.util.Map;

/**
 * ROA 优惠券订单参数
 * 使用场合：1.微信公众号优惠劵 2.互动屏优惠券
 *
 * @author Breggor
 */
public class RoaCouponOrderParam implements Serializable {

    private String buyerId; // 容易逛用户ID 或者会员ID
    private String buyerName; // 持有人
    private String buyerMobile; // 持有人手机
    private String devId; //设备ID，购买优惠券时限购使用
    private String couponId; // 优惠券 ID
    private Integer unitNum; // 用户下单量
    private String weixinAppId; ///< 微信标准版appid
    private String openId; // 当下单渠道是“微网站”时，需传入openid
    private Integer orderSource; // 下单渠道, 0为摩生活，1为微网站，2为终端机，3其他
    private String tmStatus = "0"; //为1:手机用户登陆终端机领取优惠券状态
    private String mallId; // 商场对应的ID
    private String extraInfo;///< 扩展数据
    private Integer ts; ///< 时间戳（秒）
    private String sign; ///< 签名
    // private Integer serviceType; // 商场类型

    /**
     * 将json字符串转换成RoaCouponOrderParam对象
     *
     * @param params
     * @return
     */
    public static RoaCouponOrderParam build(String params) {
        Map<String, Object> map = JsonUtil.getMapFromJson(params);
        RoaCouponOrderParam param = new RoaCouponOrderParam();
        if (map.get("couponId") != null) {
            param.setCouponId(map.get("couponId").toString());
        }
        if (map.get("unitNum") != null) {
            param.setUnitNum(Integer.parseInt(map.get("unitNum").toString()));
        }
        if (map.get("buyerName") != null) {
            param.setBuyerName(map.get("buyerName").toString());
        }
        if (map.get("buyerMobile") != null) {
            param.setBuyerMobile(map.get("buyerMobile").toString());
        }
        if (map.get("orderSource") != null) {
            param.setOrderSource(Integer.parseInt(map.get("orderSource").toString()));
        }
        if (map.get("mallId") != null) {
            param.setMallId(map.get("mallId").toString());
        }
        if (map.get("openId") != null) {
            param.setOpenId(map.get("openId").toString());
        }
        if (map.get("buyerId") != null) {
            param.setBuyerId(map.get("buyerId").toString());
        }
        if (map.get("tmStatus") != null) {
            param.setTmStatus(map.get("tmStatus").toString());
        }
        if (map.get("devId") != null) {
            param.setDevId(map.get("devId").toString());
        }
        return param;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getTmStatus() {
        return tmStatus;
    }

    public void setTmStatus(String tmStatus) {
        this.tmStatus = tmStatus;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

//    public Integer getServiceType() {
//        return serviceType;
//    }
//
//    public void setServiceType(Integer serviceType) {
//        this.serviceType = serviceType;
//    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getWeixinAppId() {
        return weixinAppId;
    }

    public void setWeixinAppId(String weixinAppId) {
        this.weixinAppId = weixinAppId;
    }

    public Integer getTs() {
        return ts;
    }

    public void setTs(Integer ts) {
        this.ts = ts;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "RoaCouponOrderParam{" +
                "buyerId='" + buyerId + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerMobile='" + buyerMobile + '\'' +
                ", devId='" + devId + '\'' +
                ", couponId='" + couponId + '\'' +
                ", unitNum=" + unitNum +
                ", weixinAppId='" + weixinAppId + '\'' +
                ", openId='" + openId + '\'' +
                ", orderSource=" + orderSource +
                ", tmStatus='" + tmStatus + '\'' +
                ", mallId='" + mallId + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                ", ts=" + ts +
                ", sign='" + sign + '\'' +
//                ", serviceType=" + serviceType +
                '}';
    }
}
