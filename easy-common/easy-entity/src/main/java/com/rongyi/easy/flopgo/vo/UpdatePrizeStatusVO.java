package com.rongyi.easy.flopgo.vo;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.CouponCommodity;

import java.io.Serializable;
import java.util.List;

<<<<<<< HEAD
=======
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.vo.CouponVO;

>>>>>>> develop-yuzhijian
/**
 * 用户返回的是修改奖品状态的接口的vo
 *
 * @author user
 */
<<<<<<< HEAD
public class UpdatePrizeStatusVO implements Serializable {
=======
public class UpdatePrizeStatusVO implements Serializable
{
>>>>>>> develop-yuzhijian

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String id;//奖品id
    private String username;//用户名
    private String channel;//用户渠道
    private String activityID;//活动id
<<<<<<< HEAD
    private String active_status = "0";//券状态
    private String coupon_id;//卷码
    private String type;//卷类型
    private List<CouponCommodity> scope;//现金卷的使用范围
=======
    private String active_status="0";//券状态
    private String coupon_id;//卷码
    private String type;//卷类型
    private List<CouponVO.CouponProduct> scope;//现金卷的使用范围
>>>>>>> develop-yuzhijian
    private String title;//奖品名称
    private String deadlines;//有效时间
    private String restrictions;//使用限制
    private String recommendation;//推荐文案
    private double actual_price;//实际价格
    private double discount_price;//折扣价格
    private List<String> thumb_img;//缩略图
    private List<String> detail_img;//详情图
<<<<<<< HEAD

    public UpdatePrizeStatusVO() {
=======
    public UpdatePrizeStatusVO(){
>>>>>>> develop-yuzhijian

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

<<<<<<< HEAD
    public UpdatePrizeStatusVO(Coupon coupon) {
        if (coupon != null) {
            this.type = coupon.getCouponType().toString();
            this.title = coupon.getName();
            this.restrictions = coupon.getLimitDesc();

            if ("02".equals(coupon.getCouponType())) {
                this.actual_price = coupon.getOrigPrice2Double();
                this.discount_price = coupon.getCurrPrice2Double();
                this.scope = null;
                this.recommendation = coupon.getUsageDesc();
            }
            if ("03".equals(coupon.getCouponType())) {
                this.discount_price = coupon.getDiscount();
                this.scope = coupon.getCouponCommodities();
                this.recommendation = coupon.getRecommend();
            }
            this.detail_img = coupon.getDetailPicUrls();
=======
    public UpdatePrizeStatusVO(CouponVO coupon){
        if(coupon!=null){
            this.type=coupon.getCouponType();
            this.title=coupon.getTitle();
            this.restrictions=coupon.getUseDescription();

            if("02".equals(coupon.getCouponType())){
                this.actual_price=coupon.getOriginalPrice();
                this.discount_price=coupon.getCurrentPrice();
                this.scope=null;
                this.recommendation=coupon.getUseDescription();
            }
            if("03".equals(coupon.getCouponType())){
                this.discount_price=coupon.getDiscount();
                this.scope=coupon.getProducts();
                this.recommendation=coupon.getRecommend();
            }
            this.detail_img=coupon.getDetailPicUrls();
>>>>>>> develop-yuzhijian


        }
    }
<<<<<<< HEAD

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getActive_status() {
        return active_status;
    }

    public void setActive_status(String active_status) {
        this.active_status = active_status;
    }

    public String getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(String coupon_id) {
        this.coupon_id = coupon_id;
    }

    public String getType() {
        return type;
    }

=======
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getChannel() {
        return channel;
    }
    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getActivityID() {
        return activityID;
    }
    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }
    public String getActive_status() {
        return active_status;
    }
    public void setActive_status(String active_status) {
        this.active_status = active_status;
    }
    public String getCoupon_id() {
        return coupon_id;
    }
    public void setCoupon_id(String coupon_id) {
        this.coupon_id = coupon_id;
    }
    public String getType() {
        return type;
    }
>>>>>>> develop-yuzhijian
    public void setType(String type) {
        this.type = type;
    }

<<<<<<< HEAD
    public List<CouponCommodity> getScope() {
        return scope;
    }

    public void setScope(List<CouponCommodity> scope) {
        this.scope = scope;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(String deadlines) {
        this.deadlines = deadlines;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public double getActual_price() {
        return actual_price;
    }

    public void setActual_price(double actual_price) {
        this.actual_price = actual_price;
    }

    public double getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(double discount_price) {
        this.discount_price = discount_price;
    }

    public List<String> getThumb_img() {
        return thumb_img;
    }

    public void setThumb_img(List<String> thumb_img) {
        this.thumb_img = thumb_img;
    }

    public List<String> getDetail_img() {
        return detail_img;
    }

=======
    public List<CouponVO.CouponProduct> getScope() {
        return scope;
    }
    public void setScope(List<CouponVO.CouponProduct> scope) {
        this.scope = scope;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDeadlines() {
        return deadlines;
    }
    public void setDeadlines(String deadlines) {
        this.deadlines = deadlines;
    }
    public String getRestrictions() {
        return restrictions;
    }
    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }
    public String getRecommendation() {
        return recommendation;
    }
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
    public double getActual_price() {
        return actual_price;
    }
    public void setActual_price(double actual_price) {
        this.actual_price = actual_price;
    }
    public double getDiscount_price() {
        return discount_price;
    }
    public void setDiscount_price(double discount_price) {
        this.discount_price = discount_price;
    }
    public List<String> getThumb_img() {
        return thumb_img;
    }
    public void setThumb_img(List<String> thumb_img) {
        this.thumb_img = thumb_img;
    }
    public List<String> getDetail_img() {
        return detail_img;
    }
>>>>>>> develop-yuzhijian
    public void setDetail_img(List<String> detail_img) {
        this.detail_img = detail_img;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> develop-yuzhijian
