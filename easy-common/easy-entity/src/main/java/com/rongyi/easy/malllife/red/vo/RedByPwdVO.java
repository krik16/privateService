package com.rongyi.easy.malllife.red.vo;

import java.io.Serializable;
/**
 * 根据密码获取红包
 * @author user
 *
 */
public class RedByPwdVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean isRebate;//是否是抵扣券
	private boolean isRedEnvelope;//是否是红包
	public boolean isRebate() {
		return isRebate;
	}
	public void setRebate(boolean isRebate) {
		this.isRebate = isRebate;
	}
	public boolean isRedEnvelope() {
		return isRedEnvelope;
	}
	public void setRedEnvelope(boolean isRedEnvelope) {
		this.isRedEnvelope = isRedEnvelope;
	}
	@Override
	public String toString() {
		return "RedByPwdVO [isRebate=" + isRebate + ", isRedEnvelope="
				+ isRedEnvelope + "]";
	}
	
}