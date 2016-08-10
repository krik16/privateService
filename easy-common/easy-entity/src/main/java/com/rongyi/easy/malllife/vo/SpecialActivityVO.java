package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

public class SpecialActivityVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer receiveCount;//剩余领取次数
	/**
     * 0:成功。1：用户id 为空；2：没有设置可领取的卡券;3:该用户的次数已经用完了;4:卡券已经领完了
     */
    private Integer status;
	public Integer getReceiveCount() {
		return receiveCount;
	}
	public void setReceiveCount(Integer receiveCount) {
		this.receiveCount = receiveCount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SpecialActivityVO [receiveCount=" + receiveCount + ", status="
				+ status + "]";
	}
    
}
