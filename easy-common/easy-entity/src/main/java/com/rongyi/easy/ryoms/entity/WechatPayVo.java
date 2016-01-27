package com.rongyi.easy.ryoms.entity;

/**
 * 微信号支付信息
 * @author user
 *
 */
public class WechatPayVo {
	private Integer id;
	private Integer wechatId;
	private String mchId;           //商户号
	private String tradeType;         //支付方式 0app 1公众号  2原生扫码(多种支付方式逗号分隔)
	private Byte isRongyiPay;       //是否容易内部支付 0不是 1是
	private String cretPath;        //证书路径
	
	public Integer getId() { 
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getWechatId() {
		return wechatId;
	}
	public void setWechatId(Integer wechatId) {
		this.wechatId = wechatId;
	}
	public String getMchId() {
		return mchId;
	}
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public Byte getIsRongyiPay() {
		return isRongyiPay;
	}
	public void setIsRongyiPay(Byte isRongyiPay) {
		this.isRongyiPay = isRongyiPay;
	}
	public String getCretPath() {
		return cretPath;
	}
	public void setCretPath(String cretPath) {
		this.cretPath = cretPath;
	}
	
	
}
