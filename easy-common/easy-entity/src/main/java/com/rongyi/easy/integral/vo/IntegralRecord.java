package com.rongyi.easy.integral.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 积分
* @Title: IntegralRecord.java 
* @Package com.rongyi.easy.integral.pojo 
* @Description: 
* @author zzq 
* @date 2015-7-17 下午4:27:01
 */
public class IntegralRecord {
	private String user_id;
	private int sourceType;//1:app,2:后台操作
	private int action ; //1加积分，2减积分
	private int type; //1.上传头像，2评论店铺或商场，3订单评论，4.每日签到，5.下单扣减，6支付超时恢复积分，7支付失败恢复积分，8验券成功加积分，9交易成功加积分
	private int score; //积分
	private BigDecimal pay_money; //支付金额
	private BigDecimal total_money;//总金额
	private BigDecimal deduction ; //抵扣金额
 	private int remain_score;  //剩余积分
 	private String item_name; //商品名称
 	private String item_id; //id
 	private String item_type; //商品类型 1优惠券，2商品
 	private String order_sn; //订单号
 	private String coupon_code; //券码
 	private String comment_id; //评论id
 	private String event_id; //user_id+action+type+event_id
 	private Date update_time; 
 	private String reason; 
 	
	public BigDecimal getTotal_money() {
		return total_money;
	}
	public void setTotal_money(BigDecimal total_money) {
		this.total_money = total_money;
	}
 	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getSourceType() {
		return sourceType;
	}
	public void setSourceType(int sourceType) {
		this.sourceType = sourceType;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int action) {
		this.action = action;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public BigDecimal getPay_money() {
		return pay_money;
	}
	public void setPay_money(BigDecimal pay_money) {
		this.pay_money = pay_money;
	}
	public BigDecimal getDeduction() {
		return deduction;
	}
	public void setDeduction(BigDecimal deduction) {
		this.deduction = deduction;
	}
	public int getRemain_score() {
		return remain_score;
	}
	public void setRemain_score(int remain_score) {
		this.remain_score = remain_score;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public String getOrder_sn() {
		return order_sn;
	}
	public void setOrder_sn(String order_sn) {
		this.order_sn = order_sn;
	}
	public String getCoupon_code() {
		return coupon_code;
	}
	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}
	public String getEvent_id() {
		return event_id;
	}
	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getOp_name() {
		return op_name;
	}
	public void setOp_name(String op_name) {
		this.op_name = op_name;
	}
	private String op_name;
}
