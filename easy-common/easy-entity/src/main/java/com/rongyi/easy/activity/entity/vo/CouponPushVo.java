
/**   
 * @Title: CouponPushVo.java 
 * @Package: com.rongyi.easy.activity.entity.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年5月5日 下午5:58:11 
 */


package com.rongyi.easy.activity.entity.vo;

import java.text.SimpleDateFormat;

import org.apache.commons.lang.StringUtils;

import com.rongyi.easy.coupon.entity.old.Coupon;

/** 
 * @Description 传递给推送前台页面显示的卡券
 * @author yb
 * @date 2015年5月5日 下午5:58:11 
 */

public class CouponPushVo {
    private String id;
    private String status;
    private String checkStatus;
    private String publishStartTime;
    private String publishEndTime;
    private String validateStartTime;
    private String validateEndTime;
    private String sourceTarget;
    private String title;
    private String discount;
    private String couponType;
    private Double currentPrice;
    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    private int restCount;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCheckStatus() {
        return checkStatus;
    }
    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }
 
    public String getSourceTarget() {
        return sourceTarget;
    }
    public void setSourceTarget(String sourceTarget) {
        this.sourceTarget = sourceTarget;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCouponType() {
        return couponType;
    }
    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }
    public Double getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }
 
    public int getRestCount() {
        return restCount;
    }
    public void setRestCount(int restCount) {
        this.restCount = restCount;
    }
  
    
    public String getValidateStartTime() {
        return validateStartTime;
    }
    public void setValidateStartTime(String validateStartTime) {
        this.validateStartTime = validateStartTime;
    }
    public String getValidateEndTime() {
        return validateEndTime;
    }
    public void setValidateEndTime(String validateEndTime) {
        this.validateEndTime = validateEndTime;
    }
    public String getPublishStartTime() {
        return publishStartTime;
    }
    public void setPublishStartTime(String publishStartTime) {
        this.publishStartTime = publishStartTime;
    }
    public String getPublishEndTime() {
        return publishEndTime;
    }
    public void setPublishEndTime(String publishEndTime) {
        this.publishEndTime = publishEndTime;
    }
    /**
     * Creates a new instance of CouponPushVo.
     * Description 
     */
    	
    public CouponPushVo(Coupon coupon) {
       
        super();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:ss");
        if(StringUtils.isNotBlank(coupon.getCheckStatus())){
            this.checkStatus=coupon.getCheckStatus().equals("2")?"已通过":(coupon.getCheckStatus().equals("0")?"待审核":"未通过");
        }
        if(StringUtils.isNotBlank(coupon.getCouponType())){
            this.couponType=coupon.getCouponType().equals("02")?"优惠券":"现金券";
        }
        if(StringUtils.isNotBlank(coupon.getStatus())){
            this.status=coupon.getStatus().equals("0")?"审核中":(coupon.getStatus().equals("1")?"已上线":"不能使用");
        }
        this.currentPrice=coupon.getCurrentPrice();
        this.id=coupon.getId().toString();
        this.publishEndTime=coupon.getPublishEndDate()==null?"":sdf.format(coupon.getPublishEndDate());
        this.publishStartTime=coupon.getPublishBeginDate()==null?"":sdf.format(coupon.getPublishBeginDate());
        this.validateStartTime=coupon.getValidBeginDate()==null?"":sdf.format(coupon.getValidBeginDate());
        this.validateEndTime=coupon.getValidEndDate()==null?"":sdf.format(coupon.getValidEndDate());
        this.restCount=coupon.getTotalCount()-(coupon.getReceiveCount()==null?0:coupon.getReceiveCount());
        if(StringUtils.isBlank(coupon.getSourceTarget())){
            this.sourceTarget="无";
        }else{
            if(coupon.getSourceTarget().equals("0")){
                this.sourceTarget="大运营管理平台";
            }else if(coupon.getSourceTarget().equals("1")){
                this.sourceTarget="百货管理平台";
            }else if(coupon.getSourceTarget().equals("2")){
                this.sourceTarget="摩店管理平台";
            }else if(coupon.getSourceTarget().equals("3")){
                this.sourceTarget="摩店App";
            }
        }
        
        this.title=coupon.getTitle();
        this.discount=coupon.getDiscount()==null?"0":coupon.getDiscount().toString();
    }
    
    
}
