/** 
* @Title: PoiShopInput.java 
* @Package com.rongyi.easy.solr.retrival 
* @Description: 店铺POI检索输入参数
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年8月17日 上午10:40:55 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.retrival;

import java.io.Serializable;

/**
 * @author ZhengYl
 *
 */
public class PoiShopInput implements Serializable {

	/**  */
	private static final long serialVersionUID = -2785321136670633297L;

	/** keyword */
	private String q = "";

	/** radius distance : distance */
	private String r = "0";

	/** general category id : cat_id */
	private String g = "0";

	/** sort type : sort*/
	private String s = "001";

	/** page start from : from */
	private int start = 0;

	/** page size : size */
	private int count = 50;

	/** longitude : coord_y */
	private int lon = 111992927;

	/** latitude : coord_x */
	private int lat = 28851343;

	/** city id : city_name  */
	private String cityid = "-1";

	/** brand_id */
	private String brandId;

	/** zone_id */
	private String zoneId;

	/** shop_id */
	private String shopId;

	/** mall_id */
	private String mallId;

	/** filter shops having goods */
	private boolean commodityRequired = false;

	/**
	 * constructor for APP parameters
	 * @param param from APP
	 */
	public PoiShopInput(){
		
	}

	public PoiShopInput(PoiParam param) {
		if (param.getKeyword() != null) {
			this.q = param.getKeyword();
		}
		if (param.getDistance() != 0) {
			this.r = String.valueOf(param.getDistance());
		}
		if (param.getMall_id() != null) {
			this.mallId = param.getMall_id();
		}
		if (param.getSort() != null) {
			this.s = param.getSort();
		}
		if (param.getFrom() != 0) {
			this.start = param.getFrom();
		}
		if (param.getSize() != 0) {
			this.count = param.getSize();
		}
		if (param.getBrand_id() != null) {
			this.brandId = param.getBrand_id();
		}
		if (param.getZone_id() != null) {
			this.zoneId = param.getZone_id();
		}
		if (param.getShop_id() != null) {
			this.shopId = param.getShop_id();
		}
		if (param.isCommodityRequired()) {
			this.commodityRequired = true;
		}
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLon() {
		return lon;
	}

	public void setLon(int lon) {
		this.lon = lon;
	}

	public int getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public boolean isCommodityRequired() {
		return commodityRequired;
	}

	public void setCommodityRequired(boolean commodityRequired) {
		this.commodityRequired = commodityRequired;
	}

}
