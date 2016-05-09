package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/**
 * 类ContentVO.java的实现描述：TODO 类实现描述
 * 
 * @author jiejie 2014年6月19日 下午3:40:22
 */
public class ContentVO implements Serializable {

    private Integer id;//活动id
    private String  type;//article/activity/sameCity: 文章/活动/同城
    private String  title;
    private String  mallName;
    private double  logoX;
    private double  logoY;  
    private Integer totalCount; //被标记总数
    private String  picUrl;
    private String  recommend; // 推荐   
    private String  refType;   // 关联类型
    private boolean isFav;
    private String  articleUrl; // 文章超链接
    private String  refId;     // 分享时关联的id， mall,shop
    private String  category;
    private String  description;    //分享描述

    private Integer mallNumber; //活动被举行商场数量 
    private String  shareUrl;//分享链接
    private Integer style; //1:精彩活动 2优惠资讯
    
    public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public double getLogoX() {
        return logoX;
    }

    public void setLogoX(double logoX) {
        this.logoX = logoX;
    }

    public double getLogoY() {
        return logoY;
    }

    public void setLogoY(double logoY) {
        this.logoY = logoY;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public boolean getIsFav() {
        return isFav;
    }

    public void setFav(boolean isFav) {
        this.isFav = isFav;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

	public String getCategory() {
		return category;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getMallNumber() {
		return mallNumber;
	}

	public void setMallNumber(Integer mallNumber) {
		this.mallNumber = mallNumber;
	}

	@Override
	public String toString() {
		return "ContentVO [id=" + id + ", type=" + type + ", title=" + title
				+ ", mallName=" + mallName + ", logoX=" + logoX + ", logoY="
				+ logoY + ", totalCount=" + totalCount + ", picUrl=" + picUrl
				+ ", recommend=" + recommend + ", refType=" + refType
				+ ", isFav=" + isFav + ", articleUrl=" + articleUrl
				+ ", refId=" + refId + ", category=" + category
				+ ", description=" + description + ", mallNumber=" + mallNumber
				+ ", shareUrl=" + shareUrl + ", style=" + style + "]";
	}



}
