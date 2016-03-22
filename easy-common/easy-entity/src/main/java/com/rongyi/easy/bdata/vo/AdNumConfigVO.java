package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

public class AdNumConfigVO implements Serializable {
	/** 
	* @Fields serialVersionUID
	*/ 
	private static final long serialVersionUID = 8723271476402191207L;
	private String mall_id;
	private Integer ryAdNum = 4;
    private Integer mallAdNum = 2;
    private Integer ryBannerNum = 4;
    private Integer mallBannerNum =2;
	/**
	 * @return the mall_id
	 */
	public String getMall_id() {
		return mall_id;
	}
	/**
	 * @param mall_id the mall_id to set
	 */
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}
	/**
	 * @return the ryAdNum
	 */
	public Integer getRyAdNum() {
		return ryAdNum;
	}
	/**
	 * @param ryAdNum the ryAdNum to set
	 */
	public void setRyAdNum(Integer ryAdNum) {
		this.ryAdNum = ryAdNum;
	}
	/**
	 * @return the mallAdNum
	 */
	public Integer getMallAdNum() {
		return mallAdNum;
	}
	/**
	 * @param mallAdNum the mallAdNum to set
	 */
	public void setMallAdNum(Integer mallAdNum) {
		this.mallAdNum = mallAdNum;
	}
	/**
	 * @return the ryBannerNum
	 */
	public Integer getRyBannerNum() {
		return ryBannerNum;
	}
	/**
	 * @param ryBannerNum the ryBannerNum to set
	 */
	public void setRyBannerNum(Integer ryBannerNum) {
		this.ryBannerNum = ryBannerNum;
	}
	/**
	 * @return the mallBannerNum
	 */
	public Integer getMallBannerNum() {
		return mallBannerNum;
	}
	/**
	 * @param mallBannerNum the mallBannerNum to set
	 */
	public void setMallBannerNum(Integer mallBannerNum) {
		this.mallBannerNum = mallBannerNum;
	}
}
