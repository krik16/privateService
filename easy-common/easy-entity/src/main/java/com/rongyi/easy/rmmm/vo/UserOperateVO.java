/**
 * 
 */
package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年11月18日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年11月18日               1.0              创建文件
 */
public class UserOperateVO implements Serializable{
	
	private Integer newCoupon = 0;//上次操作我的代金券之后领取的代金券数量
	private Integer newHongBao = 0;	//上次操作我的红包之后领取的红包数量
	private Integer newRebate = 0;//上次操作我的抵扣券之后领取的抵扣券数量
	private Integer newTempNum = 0;// 系统消息数量
	public Integer getNewCoupon() {
		return newCoupon;
	}
	public void setNewCoupon(Integer newCoupon) {
		this.newCoupon = newCoupon;
	}
	public Integer getNewHongBao() {
		return newHongBao;
	}
	public void setNewHongBao(Integer newHongBao) {
		this.newHongBao = newHongBao;
	}
	public Integer getNewRebate() {
		return newRebate;
	}
	public void setNewRebate(Integer newRebate) {
		this.newRebate = newRebate;
	}
	public Integer getNewTempNum() {
		return newTempNum;
	}
	public void setNewTempNum(Integer newTempNum) {
		this.newTempNum = newTempNum;
	}
	

}
