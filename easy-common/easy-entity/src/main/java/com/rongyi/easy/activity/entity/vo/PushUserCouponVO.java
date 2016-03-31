
/**   
 * @Title: PushUserCouponVO.java 
 * @Package: com.rongyi.easy.activity.entity.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年4月23日 下午5:46:47 
 */


package com.rongyi.easy.activity.entity.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/** 
 * @Description
 * @author yb
 * @date 2015年4月23日 下午5:46:47 
 */

public class PushUserCouponVO implements Serializable{
    private String pushId;
    private String pushName;
    private String couponId;
    private List<String> couponCodes;
    private String couponTitle;
    private String userId;
    private Integer couponType;
    private String type;
    private String useRestriction;
    private Integer currentPrice;
    private Date validBeginDate;
    private Date validEndDate;
    private String userPhone;

    private String pushChannelId;


    /**
     * Creates a new instance of PushUserCouponVO.
     * Description
     *
     * @param pushId
     * @param pushName
     * @param couponId
     * @param couponCodes
     * @param couponTitle
     * @param userId
     * @param couponType
     * @param type
     * @param useRestriction
     * @param currentPrice
     * @param validBeginDate
     * @param validEndDate
     */


    public PushUserCouponVO(String pushId, String pushName, String couponId, List<String> couponCodes, String couponTitle, String userId, Integer couponType, String type, String useRestriction, Integer currentPrice, Date validBeginDate, Date validEndDate,String userPhone,String pushChannelId) {
        super();
        this.pushId = pushId;
        this.pushName = pushName;
        this.couponId = couponId;
        this.couponCodes = couponCodes;
        this.couponTitle = couponTitle;
        this.userId = userId;
        this.couponType = couponType;
        this.type = type;
        this.useRestriction = useRestriction;
        this.currentPrice = currentPrice;
        this.validBeginDate = validBeginDate;
        this.validEndDate = validEndDate;
        this.userPhone=userPhone;

        this.pushChannelId=pushChannelId;
    }

    @Override
    public String toString() {
        return "PushUserCouponVO{" +
            "pushId='" + pushId + '\'' +
            ", pushName='" + pushName + '\'' +
            ", couponId='" + couponId + '\'' +
            ", couponCodes=" + couponCodes +
            ", couponTitle='" + couponTitle + '\'' +
            ", userId='" + userId + '\'' +
            ", couponType=" + couponType +
            ", type='" + type + '\'' +
            ", useRestriction='" + useRestriction + '\'' +
            ", currentPrice=" + currentPrice +
            ", validBeginDate=" + validBeginDate +
            ", validEndDate=" + validEndDate +
            ", userPhone='" + userPhone + '\'' +
            ", pushChannelId='" + pushChannelId + '\'' +
            '}';
    }

    public String getPushChannelId() {
        return pushChannelId;
    }

    public void setPushChannelId(String pushChannelId) {
        this.pushChannelId = pushChannelId;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getPushName() {
        return pushName;
    }

    public void setPushName(String pushName) {
        this.pushName = pushName;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public List<String> getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUseRestriction() {
        return useRestriction;
    }

    public void setUseRestriction(String useRestriction) {
        this.useRestriction = useRestriction;
    }

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getValidBeginDate() {
        return validBeginDate;
    }

    public void setValidBeginDate(Date validBeginDate) {
        this.validBeginDate = validBeginDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    
}
