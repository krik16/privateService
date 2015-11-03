package com.rongyi.easy.flopgo.vo;

import com.rongyi.easy.coupon.entity.Coupon;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.vo.CouponVO;

public class FlopgoPrizeByTimesVO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String _id;//奖品id
	private Date created_at; //奖品创建时间
	private Date updated_at;//奖品修改时间
	private String type;//奖品的类型 02优惠卷03现金卷
	private String title;//奖品名字
	private String deadlines;//有效时间
	private String restrictions;//使用限制
	private double actual_price;//实际价格
	private double discount_price;//折扣价格
	private int active_status;//卷状态
	private String coupon_id;//卷码

	private List<String> thumb_img;//缩略图
	private List<String> detail_img;//详情图
	private List<CouponProductVO> scope;//现金卷的使用范围
	private String recommendation;//推荐文案
	private String activityId;//翻牌购的id
	public FlopgoPrizeByTimesVO(){

	}
	public FlopgoPrizeByTimesVO(FlopPrizeVO flopprize){
		this._id=flopprize.getId();
		this.created_at=flopprize.getCreateDate();
		this.updated_at=flopprize.getUpdateDate();
		this.type=flopprize.getTicketType();
		this.title=flopprize.getTitle();
		this.restrictions=flopprize.getUseRestriction();

		this.detail_img=flopprize.getDetailPicUrls();
		if("02".equals(flopprize.getTicketType())){
			this.actual_price=flopprize.getOriginalPrice();
			this.discount_price=flopprize.getNowPrice();
			this.scope=null;
			this.recommendation=flopprize.getUseDescription();
		}
		if("03".equals(flopprize.getTicketType())){
			this.discount_price=flopprize.getDiscount();
			this.recommendation=flopprize.getRecommend();
		}
	}
	public FlopgoPrizeByTimesVO(CouponVO flopprize){
		if(flopprize!=null){
			this._id=flopprize.getId().toString();
			this.created_at=flopprize.getCreateDate();
			this.updated_at=flopprize.getUpdateDate();
			this.type=flopprize.getCouponType();
			this.title=flopprize.getTitle();
			this.restrictions=flopprize.getUseRestriction();

			this.detail_img=flopprize.getDetailPicUrls();
			if("02".equals(flopprize.getCouponType())){
			//	this.actual_price=flopprize.getOrigPrice2Double();
				//this.discount_price=flopprize.getCurrPrice2Double();
				this.scope=null;
				//this.recommendation=flopprize.getUsageDesc();
			}
			if("03".equals(flopprize.getCouponType())){
				this.discount_price=flopprize.getDiscount();
				this.recommendation=flopprize.getRecommend();
			}
		}
	}
	public FlopgoPrizeByTimesVO(FlopPRizeResultByDateAFidVO flopprize){
		this._id=flopprize.getPrizeId();
		this.type=flopprize.getPrizeType();
		this.title=flopprize.getPrizeName();
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}

	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public int getActive_status() {
		return active_status;
	}
	public void setActive_status(int active_status) {
		this.active_status = active_status;
	}
	public String getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
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
	public void setDetail_img(List<String> detail_img) {
		this.detail_img = detail_img;
	}
	public List<CouponProductVO> getScope() {
		return scope;
	}
	public void setScope(List<CouponProductVO> scope) {
		this.scope = scope;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

}
