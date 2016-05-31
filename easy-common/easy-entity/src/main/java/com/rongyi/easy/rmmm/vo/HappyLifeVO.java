package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.util.List;

public class HappyLifeVO implements Serializable{
	
    private String bannerPic; //banner图片地址
    private Integer type; //文章类型  21 为特卖列表需要给出shareTitle,shareContent
    private String typeVal; //文章Id
    private String shareTitle;//分享标题
    private String shareContent;//分享内容
    private String sharePic;//分享图片
    private String appTitle;//页面标题
    
    List<HappyLifeWayVO> serviceWay;//服务入口

	public String getBannerPic() {
		return bannerPic;
	}

	public void setBannerPic(String bannerPic) {
		this.bannerPic = bannerPic;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTypeVal() {
		return typeVal;
	}

	public void setTypeVal(String typeVal) {
		this.typeVal = typeVal;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareContent() {
		return shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}

	public String getSharePic() {
		return sharePic;
	}

	public void setSharePic(String sharePic) {
		this.sharePic = sharePic;
	}

	public String getAppTitle() {
		return appTitle;
	}

	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}

	public List<HappyLifeWayVO> getServiceWay() {
		return serviceWay;
	}

	public void setServiceWay(List<HappyLifeWayVO> serviceWay) {
		this.serviceWay = serviceWay;
	}

	@Override
	public String toString() {
		return "HappyLifeVO [bannerPic=" + bannerPic + ", type=" + type
				+ ", typeVal=" + typeVal + ", shareTitle=" + shareTitle
				+ ", shareContent=" + shareContent + ", sharePic=" + sharePic
				+ ", appTitle=" + appTitle + ", serviceWay=" + serviceWay + "]";
	}

}
