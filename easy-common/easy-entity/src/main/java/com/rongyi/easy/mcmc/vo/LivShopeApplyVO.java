package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;

/**
 * 店铺申请邮件记录
 * 
 * @author xiaobo
 *
 */
public class LivShopeApplyVO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 买手id
	 */
	private String bullId;
	/**
	 * 商场名称
	 */
	private String mallName;
	/**
	 * 店铺名称
	 */
	private String shopNmae;
	
	public String getBullId() {
		return bullId;
	}
	public void setBullId(String bullId) {
		this.bullId = bullId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getShopNmae() {
		return shopNmae;
	}
	public void setShopNmae(String shopNmae) {
		this.shopNmae = shopNmae;
	}
}
