package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/**
 * 收藏页对象 类ContentFavVO.java的实现描述：TODO 类实现描述
 * 
 * @author jiejie 2014年6月26日 下午4:14:13
 */
public class ContentFavVO implements Serializable{

    private Integer id;
    private String  type;
    private String  title;
    private double  logoX;
    private double  logoY;
    private String  mallName;    
    private Integer totalCount;
    private String  picUrl;
    private boolean isFav = true;
    private String  recommend; // 推荐   
    private String  articleUrl;  // 文章超链接
    private String  refId;       // 分享时关联的id， mall,shop
    private String  refType;
    private String  category;
    private String  description;    //分享描述
    private String  shareUrl;
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

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

	public double getLogoX() {
		return logoX;
	}

	public double getLogoY() {
		return logoY;
	}

	public String getMallName() {
		return mallName;
	}

	public String getRecommend() {
		return recommend;
	}

	public String getCategory() {
		return category;
	}

	public void setLogoX(double logoX) {
		this.logoX = logoX;
	}

	public void setLogoY(double logoY) {
		this.logoY = logoY;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

}
