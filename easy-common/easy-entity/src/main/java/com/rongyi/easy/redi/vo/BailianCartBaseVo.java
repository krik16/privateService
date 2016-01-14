package com.rongyi.easy.redi.vo;

import java.util.List;

public class BailianCartBaseVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;// 篮筐id
	private String title;// 
	private String memo;// 
	private String themeAppListPic;// 
	private String themeAppDetailPic;// 
	private List<BailianCartVo> basketList;// 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getThemeAppListPic() {
		return themeAppListPic;
	}
	public void setThemeAppListPic(String themeAppListPic) {
		this.themeAppListPic = themeAppListPic;
	}
	public String getThemeAppDetailPic() {
		return themeAppDetailPic;
	}
	public void setThemeAppDetailPic(String themeAppDetailPic) {
		this.themeAppDetailPic = themeAppDetailPic;
	}
	public List<BailianCartVo> getBasketList() {
		return basketList;
	}
	public void setBasketList(List<BailianCartVo> basketList) {
		this.basketList = basketList;
	}
	@Override
	public String toString() {
		return "BailianCartBaseVo [id=" + id + ", title=" + title + ", memo="
				+ memo + ", themeAppListPic=" + themeAppListPic
				+ ", themeAppDetailPic=" + themeAppDetailPic + ", basketList="
				+ basketList + "]";
	}
	
	
}