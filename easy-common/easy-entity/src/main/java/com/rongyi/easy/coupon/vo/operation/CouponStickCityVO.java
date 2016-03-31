package com.rongyi.easy.coupon.vo.operation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Description:代金券置顶城市VO
 * @author:lqy
 * @time:2015年8月1日 下午4:55:33
 */
public class CouponStickCityVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;

	/**
	 * 卡券名称
	 */
	private String name;

	/**
     * 关联类型
     * 代金券：集团[0], 品牌[1], 商场 [2], 店铺[3]
     */
    private Integer relatedType;

    /**
     * 关联类型对应的名称
     */
    private String relatedName;

    /**
     * 发布开始时间
     */
    private Date publishStartTime;

    /**
     * 发布结束时间
     */
    private Date publishEndTime;

    private StickCity stickCity = new StickCity();

    public static class StickCity implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer proId;

		private String pro;

    	private List<City> citys;

		public String getPro() {
			return pro;
		}

		public void setPro(String pro) {
			this.pro = pro;
		}

		public Integer getProId() {
			return proId;
		}

		public void setProId(Integer proId) {
			this.proId = proId;
		}

		public List<City> getCitys() {
			return citys;
		}

		public void setCitys(List<City> citys) {
			this.citys = citys;
		}
    }

    public static class City implements Serializable {

		private static final long serialVersionUID = 1L;

		private Integer cityId;

    	private String city;

		public Integer getCityId() {
			return cityId;
		}

		public void setCityId(Integer cityId) {
			this.cityId = cityId;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRelatedType() {
		return relatedType;
	}

	public void setRelatedType(Integer relatedType) {
		this.relatedType = relatedType;
	}

	public String getRelatedName() {
		return relatedName;
	}

	public void setRelatedName(String relatedName) {
		this.relatedName = relatedName;
	}

	public Date getPublishStartTime() {
		return publishStartTime;
	}

	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public Date getPublishEndTime() {
		return publishEndTime;
	}

	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public StickCity getStickCity() {
		return stickCity;
	}

	public void setStickCity(StickCity stickCity) {
		this.stickCity = stickCity;
	}

}
