package com.rongyi.easy.redi.param;


import java.util.List;


public class BailianShopParam {
	/**
	 * =============门店店铺信息实时同步=================
	 */
	private String brandLabel;//	品牌标签
	
	private String code  ; //商户编号
	
	private String  eLetter ;  //品牌英文首字母
	
	private String eName ;   //品牌英文名
	
	private String floorCode ; // 所在楼层编号
	
	private String floorImg ;  //所在楼层图
	
	private  String  floorTitle ;//所在楼层名
	
	private  String  intro ; //店铺描述
	
	private String name ; //店铺名
	
	private String shopLogo ;//店铺图标
	
	private List<String> imageList ; //商户图片
	
	private String shopRoom ; //铺位号
	
	private String actionType ;

	private String shopId ;
	





	public String getShopId() {
		return shopId;
	}




	public void setShopId(String shopId) {
		this.shopId = shopId;
	}




	public BailianShopParam(String brandLabel, String code, String eLetter,
			String eName, String floorCode, String floorImg, String floorTitle,
			String intro, String name, String shopLogo, List<String> imageList,
			String shopRoom, String actionType) {
		super();
		this.brandLabel = brandLabel;
		this.code = code;
		this.eLetter = eLetter;
		this.eName = eName;
		this.floorCode = floorCode;
		this.floorImg = floorImg;
		this.floorTitle = floorTitle;
		this.intro = intro;
		this.name = name;
		this.shopLogo = shopLogo;
		this.imageList = imageList;
		this.shopRoom = shopRoom;
		this.actionType = actionType;
	}




	public String getBrandLabel() {
		return brandLabel;
	}




	public void setBrandLabel(String brandLabel) {
		this.brandLabel = brandLabel;
	}




	public String getCode() {
		return code;
	}




	public void setCode(String code) {
		this.code = code;
	}




	public String geteLetter() {
		return eLetter;
	}




	public void seteLetter(String eLetter) {
		this.eLetter = eLetter;
	}




	public String geteName() {
		return eName;
	}




	public void seteName(String eName) {
		this.eName = eName;
	}




	public String getFloorCode() {
		return floorCode;
	}




	public void setFloorCode(String floorCode) {
		this.floorCode = floorCode;
	}




	public String getFloorImg() {
		return floorImg;
	}




	public void setFloorImg(String floorImg) {
		this.floorImg = floorImg;
	}




	public String getFloorTitle() {
		return floorTitle;
	}




	public void setFloorTitle(String floorTitle) {
		this.floorTitle = floorTitle;
	}




	public String getIntro() {
		return intro;
	}




	public void setIntro(String intro) {
		this.intro = intro;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getShopLogo() {
		return shopLogo;
	}




	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}







	public List<String> getImageList() {
		return imageList;
	}




	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}




	public String getShopRoom() {
		return shopRoom;
	}




	public void setShopRoom(String shopRoom) {
		this.shopRoom = shopRoom;
	}


	public BailianShopParam() {
		super();
	}




	public String getActionType() {
		return actionType;
	}




	public void setActionType(String actionType) {
		this.actionType = actionType;
	}




	@Override
	public String toString() {
		return "BailianShopParam [brandLabel=" + brandLabel + ", code=" + code
				+ ", eLetter=" + eLetter + ", eName=" + eName + ", floorCode="
				+ floorCode + ", floorImg=" + floorImg + ", floorTitle="
				+ floorTitle + ", intro=" + intro + ", name=" + name
				+ ", shopLogo=" + shopLogo + ", imageList=" + imageList
				+ ", shopRoom=" + shopRoom + ", actionType=" + actionType + "]";
	}


	

}