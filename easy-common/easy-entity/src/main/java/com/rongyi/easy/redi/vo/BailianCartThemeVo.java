package com.rongyi.easy.redi.vo;

public class BailianCartThemeVo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;// id 
	private String title;// 名称
	private String memo;// 描述
	private String appListPic;// 商品图片
	private String appDetailPic;// 商品图片
	
	public BailianCartThemeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BailianCartThemeVo(String id, String title, String memo,
			String appListPic, String appDetailPic) {
		super();
		this.id = id;
		this.title = title;
		this.memo = memo;
		this.appListPic = appListPic;
		this.appDetailPic = appDetailPic;
	}
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
	public String getAppListPic() {
		return appListPic;
	}
	public void setAppListPic(String appListPic) {
		this.appListPic = appListPic;
	}
	public String getAppDetailPic() {
		return appDetailPic;
	}
	public void setAppDetailPic(String appDetailPic) {
		this.appDetailPic = appDetailPic;
	}
	
	



}