/** 
* @Title: LiveSearchParam.java 
* @Package com.rongyi.easy.solr.param 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年10月14日 上午10:19:41 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.solr.param;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.easy.rmmm.base.BaseParam;

/**
 * @author ZhengYl
 *
 */
public class LiveSearchParam extends BaseParam implements Serializable{

	/**  */
	private static final long serialVersionUID = -8710679871751949024L;
	
	private String _id; // id
	private String keyword;   //关键词 直播名
	private String coord_x;   //坐标x
	private String coord_y;   //坐标y
	private String cat_id;        //值为1:表示查询 商场, 2:值为24位长表示直播所属店铺或者商场分类的mongoId
	private String zone_id;   //区域id，用于筛选； 包括距离筛选，距离筛选时传入m为单位的距离 如：500，1000
	private String city_name; //城市名（如  上海&上海市）
	private String sort;      //排序规则（distance，null，couponRequired（commodityRequired），date）
	private int from;         //页
	private int size;         //一页数量
	private String liveId;//直播id 查询直播详情使用
	private String locId; //直播对应的商场or店铺的Id
 	private String bullName; // 买手昵称

	private String bullId; // 买手id
	private Date start_time; // 开始时间
	private Date end_time; // 结束时间
	private Integer status;//直播状态0:发布/预热中，1:上线/进行中，2:下线(已过期),-1代表删除
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public String getBullName() {
		return bullName;
	}
	public void setBullName(String bullName) {
		this.bullName = bullName;
	}
	public String getBullId() {
		return bullId;
	}
	public void setBullId(String bullId) {
		this.bullId = bullId;
	}
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}	

 
	public String getLiveId() {
		return liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(String coord_x) {
		this.coord_x = coord_x;
	}
	public String getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(String coord_y) {
		this.coord_y = coord_y;
	}
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getZone_id() {
		return zone_id;
	}
	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}

	@Override
	public String toString() {
		return "LiveSearchParam{" +
				"_id='" + _id + '\'' +
				", keyword='" + keyword + '\'' +
				", coord_x='" + coord_x + '\'' +
				", coord_y='" + coord_y + '\'' +
				", cat_id='" + cat_id + '\'' +
				", zone_id='" + zone_id + '\'' +
				", city_name='" + city_name + '\'' +
				", sort='" + sort + '\'' +
				", from=" + from +
				", size=" + size +
				", liveId='" + liveId + '\'' +
				", locId='" + locId + '\'' +
				", bullName='" + bullName + '\'' +
				", bullId='" + bullId + '\'' +
				", start_time=" + start_time +
				", end_time=" + end_time +
				", status=" + status +
				'}';
	}
}