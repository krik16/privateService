package com.rongyi.easy.malllife.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiejie 2014年6月23日 下午6:46:36
 */
public class ContentPojo implements Serializable{

    private Integer id;
    private String  title;
    private String  contentType;  // 文章类型：活动，文章
    private String  category;
    private Integer contentStatus; // 状态
    private String  mark;         // 标签
    private String  picture;      // 缩略图
    private Integer markCount;    // 收藏总数
    private Integer referenceId;  // 外键id
    private String  type;
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
    private String  description;    //分享描述
    
    private Integer      mallNumber; //活动被举行商场数量 
    private double distance;//经纬度距离
    
	private Date topStartDate;
    
    private Date topEndDate;
    
    private String weeks;
    
    private String times;
    
    private Integer activity_recommend;
    
    private String selectTypeOfActivityRecommend;
    
    private Integer activity_recommend_Timer;
    
    /*
     * Below fields added by Brady 
     */
    private String  actionCost; // 活动费用
    /**
     * 1表示未开始
     * 2表示进行中
     * 3表示已过期
     */
    private Integer isExpired; // 是否过期
    
    private String grouponId; // 团购券ID
    
    public Integer getActivity_recommend_Timer() {
		return activity_recommend_Timer;
	}

	public void setActivity_recommend_Timer(Integer activity_recommend_Timer) {
		this.activity_recommend_Timer = activity_recommend_Timer;
	}

	public String getSelectTypeOfActivityRecommend() {
		return selectTypeOfActivityRecommend;
	}

	public void setSelectTypeOfActivityRecommend(
			String selectTypeOfActivityRecommend) {
		this.selectTypeOfActivityRecommend = selectTypeOfActivityRecommend;
	}

	public Integer getActivity_recommend() {
		return activity_recommend;
	}

	public void setActivity_recommend(Integer activity_recommend) {
		this.activity_recommend = activity_recommend;
	}

	public Date getTopStartDate() {
		return topStartDate;
	}

	public void setTopStartDate(Date topStartDate) {
		this.topStartDate = topStartDate;
	}

	public Date getTopEndDate() {
		return topEndDate;
	}

	public void setTopEndDate(Date topEndDate) {
		this.topEndDate = topEndDate;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public String getTimes() {
		return times;
	}

	public void setTimes(String times) {
		this.times = times;
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

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(Integer contentStatus) {
        this.contentStatus = contentStatus;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getMarkCount() {
        return markCount;
    }

    public void setMarkCount(Integer markCount) {
        this.markCount = markCount;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

	public String getType() {
		return type;
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

	public Integer getTotalCount() {
		return totalCount;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public boolean isFav() {
		return isFav;
	}

	public String getRecommend() {
		return recommend;
	}

	public String getArticleUrl() {
		return articleUrl;
	}

	public String getRefId() {
		return refId;
	}

	public String getRefType() {
		return refType;
	}

	public void setType(String type) {
		this.type = type;
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

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public void setFav(boolean isFav) {
		this.isFav = isFav;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMallNumber() {
		return mallNumber;
	}

	public void setMallNumber(Integer mallNumber) {
		this.mallNumber = mallNumber;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getActionCost() {
		return actionCost;
	}

	public void setActionCost(String actionCost) {
		this.actionCost = actionCost;
	}

	public Integer getIsExpired() {
		return isExpired;
	}

	public void setIsExpired(Integer isExpired) {
		this.isExpired = isExpired;
	}

    public String getGrouponId() {
        return grouponId;
    }

    public void setGrouponId(String grouponId) {
        this.grouponId = grouponId;
    }

}
