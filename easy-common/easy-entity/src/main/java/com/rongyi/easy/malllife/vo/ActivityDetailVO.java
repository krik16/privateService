package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ActivityDetailVO implements Serializable{

	private Integer id;

	private String title;

	private String activityCode;// 团购券验证码

	private Integer status;// 未使用:0,已使用:1,退款中:2,已退款:3,已过期:4

	private String useTime;// 使用日期

	private String startTime;// 有效期始

	private String endTime;// 有效期止

	private String useLimit;// 使用限制

	private String useWay;// 使用方式

	private Integer num;// 可使用商家数

	private List<ActivityMallVo> mallvos;// 相关商家

	private String thumbnail;

	private List<MyOrderActivityVO> myActivityList;

	private Integer ticketTotalNumber;

	private BigDecimal grouponPrice;
	
	private boolean notOutCodeFlag = true; // 外部导入券标志 true 不是外部导入券,false 是外部导入券

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUseLimit() {
		return useLimit;
	}

	public void setUseLimit(String useLimit) {
		this.useLimit = useLimit;
	}

	public String getUseWay() {
		return useWay;
	}

	public void setUseWay(String useWay) {
		this.useWay = useWay;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public List<ActivityMallVo> getMallvos() {
		return mallvos;
	}

	public void setMallvos(List<ActivityMallVo> mallvos) {
		this.mallvos = mallvos;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<MyOrderActivityVO> getMyActivityList() {
		return myActivityList;
	}

	public void setMyActivityList(List<MyOrderActivityVO> myActivityList) {
		this.myActivityList = myActivityList;
	}

	public Integer getTicketTotalNumber() {
		return ticketTotalNumber;
	}

	public void setTicketTotalNumber(Integer ticketTotalNumber) {
		this.ticketTotalNumber = ticketTotalNumber;
	}

	public BigDecimal getGrouponPrice() {
		return grouponPrice;
	}

	public void setGrouponPrice(BigDecimal grouponPrice) {
		this.grouponPrice = grouponPrice;
	}

	public boolean isNotOutCodeFlag() {
		return notOutCodeFlag;
	}

	public void setNotOutCodeFlag(boolean notOutCodeFlag) {
		this.notOutCodeFlag = notOutCodeFlag;
	}
	
}
