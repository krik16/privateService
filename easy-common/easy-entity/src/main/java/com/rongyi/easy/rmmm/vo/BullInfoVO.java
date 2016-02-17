/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司 author chenjun Description ： time ：2015年10月15日
 * History: 变更记录 <author> <time> <version> <desc> chenjun 2015年10月15日 1.0 创建文件
 */
public class BullInfoVO implements Serializable {

	private String bullId;// 买手id
	private String bullNickName;// 买手昵称
	private String bullLogo;// 买手头像
	private Double bullGrade;// 买手评级
	private Integer bullFansNum;// 用户关注数（粉丝）
	private Integer liveCount;// 买手直播场次
	private Integer commodityCount;// 买手持有的商品总数
	private Integer ifAttention = 0;// 是否已关注0否1是
	private String bullIntroduction;// 买手简介
	private String bullImId;// 买手环信id

	private String easyOrder;//容易令

	public String getBullId() {
		return bullId;
	}

	public void setBullId(String bullId) {
		this.bullId = bullId;
	}

	public String getBullNickName() {
		return bullNickName;
	}

	public void setBullNickName(String bullNickName) {
		this.bullNickName = bullNickName;
	}

	public String getBullLogo() {
		return bullLogo;
	}

	public void setBullLogo(String bullLogo) {
		this.bullLogo = bullLogo;
	}

	public Double getBullGrade() {
		return bullGrade;
	}

	public void setBullGrade(Double bullGrade) {
		this.bullGrade = bullGrade;
	}

	public Integer getBullFansNum() {
		return bullFansNum;
	}

	public void setBullFansNum(Integer bullFansNum) {
		this.bullFansNum = bullFansNum;
	}

	public Integer getLiveCount() {
		return liveCount;
	}

	public void setLiveCount(Integer liveCount) {
		this.liveCount = liveCount;
	}

	public Integer getCommodityCount() {
		return commodityCount;
	}

	public void setCommodityCount(Integer commodityCount) {
		this.commodityCount = commodityCount;
	}

	public Integer getIfAttention() {
		return ifAttention;
	}

	public void setIfAttention(Integer ifAttention) {
		this.ifAttention = ifAttention;
	}

	public String getBullIntroduction() {
		return bullIntroduction;
	}

	public void setBullIntroduction(String bullIntroduction) {
		this.bullIntroduction = bullIntroduction;
	}

	public String getBullImId() {
		return bullImId;
	}

	public void setBullImId(String bullImId) {
		this.bullImId = bullImId;
	}

	public String getEasyOrder() {
		return easyOrder;
	}

	public void setEasyOrder(String easyOrder) {
		this.easyOrder = easyOrder;
	}

	@Override
	public String toString() {
		return "BullInfoVO [bullId=" + bullId + ", bullNickName=" + bullNickName + ", bullLogo=" + bullLogo + ", bullGrade="
				+ bullGrade + ", bullFansNum=" + bullFansNum + ", liveCount=" + liveCount + ", commodityCount=" + commodityCount
				+ ", ifAttention=" + ifAttention + ", bullIntroduction=" + bullIntroduction + ", bullImId=" + bullImId + "]";
	}

}
