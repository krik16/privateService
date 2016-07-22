package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;

import com.google.inject.internal.Lists;

/**
 * 类ActivityContentVO.java的实现描述：TODO 类实现描述
 * 
 * @author jiejie 2014年6月19日 下午4:26:25
 */
public class ActivityContentVO implements Serializable{

    private Integer      id;
    private String       title;
    private String       mallName;
    private double       logoX;
    private double       logoY;
    private List<String> pictureList;
    private String       activityDateStr;
    private String       cost;
    private String       content;
    private String       recommentView;
    private String       mapPicture;
    private Integer      totalCount; //total mark count.
    private boolean      isFav;          // 是否收藏
    private String       iconUrl;
    private String       category;
    private Integer      mallNumber; //活动被举行商场数量
    private String       refType;   // 关联类型
    private String       refId;     // 分享时关联的id， mall,shop
    private String       grouponId; //团购优惠券ID
    private String description;//分享描述
    
    private String address; // 地址
    private String shareUrl;//分享链接地址
    private String picUrl;//分享需要的图片    
    
    private List<ActivityContentMallVO>  mallList;//
    
    private List<ActivityMall2VO> mallList2;//新版爱品牌的商场 店铺 品牌

	public List<ActivityMall2VO> getMallList2() {
		return mallList2;
	}

	public void setMallList2(List<ActivityMall2VO> mallList2) {
		this.mallList2 = mallList2;
	}

	public List<ActivityContentMallVO> getMallList() {
		return mallList;
	}

	public void setMallList(List<ActivityContentMallVO> mallList) {
		this.mallList = mallList;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGrouponId() {
        return grouponId;
    }

    public void setGrouponId(String grouponId) {
        this.grouponId = grouponId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<String> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<String> pictureList) {
        this.pictureList = pictureList;
    }

    public String getActivityDateStr() {
        return activityDateStr;
    }

    public void setActivityDateStr(String activityDateStr) {
        this.activityDateStr = activityDateStr;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRecommentView() {
        return recommentView;
    }

    public void setRecommentView(String recommentView) {
        this.recommentView = recommentView;
    }

    public String getMapPicture() {
        return mapPicture;
    }

    public void setMapPicture(String mapPicture) {
        this.mapPicture = mapPicture;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public boolean getIsFav() {
        return isFav;
    }

    public void setFav(boolean isFav) {
        this.isFav = isFav;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

	public String getCategory() {
		return category;
	}

	public String getRefType() {
		return refType;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public void setRefId(String refId) {
		this.refId = refId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ActivityContentVO [id=" + id + ", title=" + title
				+ ", mallName=" + mallName + ", logoX=" + logoX + ", logoY="
				+ logoY + ", pictureList=" + pictureList + ", activityDateStr="
				+ activityDateStr + ", cost=" + cost + ", content=" + content
				+ ", recommentView=" + recommentView + ", mapPicture="
				+ mapPicture + ", totalCount=" + totalCount + ", isFav="
				+ isFav + ", iconUrl=" + iconUrl + ", category=" + category
				+ ", mallNumber=" + mallNumber + ", refType=" + refType
				+ ", refId=" + refId + ", grouponId=" + grouponId
				+ ", description=" + description + ", address=" + address
				+ ", shareUrl=" + shareUrl + ", picUrl=" + picUrl
				+ ", mallList=" + mallList + ", mallList2=" + mallList2 + "]";
	}

}
