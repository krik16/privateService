package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Created by lijing on 2015/10/20.
 */
public class QuickDetailVO implements Serializable {
    /**
     * 图片
     */
    private String picName;
    /**
     * 标题
     */
    private String title;
    /**类型
     *商场    1
     店铺    2
     文章    7
     商品    4
     代金券  5
     直播    12（new）
     特卖    13（new）
     外链    9
     */
    private String quickType;
    /**外链值*/
    private String quickTypeVal;
    /***
     * 分享标题
     */
    private String shareTitle;
    /***
     * 分享内容
     */
    private String shareContent;
    /***
     * 分享图片
     */
    private String sharePic;
    /***
     * 页面标题
     */
    private String appTitle;
    
    /**
     * APP版本兼容增加的字段
     */
    private String picNameTwo;

    /**
     * typeVal
     */
    private String typeVal;

    public String getTypeVal() {
        return typeVal;
    }

    public void setTypeVal(String typeVal) {
        this.typeVal = typeVal;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuickType() {
        return quickType;
    }

    public void setQuickType(String quickType) {
        this.quickType = quickType;
    }

    public String getQuickTypeVal() {
        return quickTypeVal;
    }

    public void setQuickTypeVal(String quickTypeVal) {
        this.quickTypeVal = quickTypeVal;
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

    public String getPicNameTwo() {
		return picNameTwo;
	}

	public void setPicNameTwo(String picNameTwo) {
		this.picNameTwo = picNameTwo;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("picName", picName)
                .append("title", title)
                .append("quickType", quickType)
                .append("quickTypeVal", quickTypeVal)
                .append("shareTitle", shareTitle)
                .append("shareContent", shareContent)
                .append("sharePic", sharePic)
                .append("appTitle", appTitle)
                .append("typeVal", typeVal)
                .toString();
    }
}
