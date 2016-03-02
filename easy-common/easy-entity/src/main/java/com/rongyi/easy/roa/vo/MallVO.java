package com.rongyi.easy.roa.vo;

import java.io.Serializable;
import java.util.List;

public class MallVO implements Serializable{
    private static final long serialVersionUID = 1L;
	private String id;//商场ID
	private String name;//商场名称
	private String mold;//商场类型
	private Integer business_status;//商场营业状态, 0:正常营业1:即将开业2:暂停营业3:停止营业
	private Integer recommend;//商场推荐：1-未推荐、2-已推荐
	private List<String> aliases;//商场别名
	private String weixin;//微信号
	private MallAddressVO mallAddress;//商场地址
	private String business_hours;//营业时间
	private String description;//商场介绍
	private String telephone;
	private String transport_information;//交通信息
	private List<ParkingVO> parking;//停车信息
	private Integer terminal_mall;//终端机合作1-无合作、2-有合作
	private String appearance_pic;//APP外景图片：APP外景图的url地址
	private String web_appearance_pic;//WEB外景图片：WEB外景图url地址
	private String traffic_pic;//商场交通图：交通图url地址
	private String introduction_pic;//商场介绍图：商场介绍图url地址
	private String terminal_logo;//终端机logo：终端机logourl地址
	private String wechat_pic; //商场 微信展示图片：微信地址
	private String icon;//商场ICOn：图片logoURl
	private String merlog_pic ;//商家后台Logo
	private String mall_level;//商场级别 A、B、C、S、SS
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMold() {
		return mold;
	}
	public void setMold(String mold) {
		this.mold = mold;
	}
	public Integer getBusiness_status() {
		return business_status;
	}
	public void setBusiness_status(Integer business_status) {
		this.business_status = business_status;
	}
	public Integer getRecommend() {
		return recommend;
	}
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	public List<String> getAliases() {
		return aliases;
	}
	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	
	public MallAddressVO getMallAddress() {
		return mallAddress;
	}
	public void setMallAddress(MallAddressVO mallAddress) {
		this.mallAddress = mallAddress;
	}
	public String getBusiness_hours() {
		return business_hours;
	}
	public void setBusiness_hours(String business_hours) {
		this.business_hours = business_hours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTransport_information() {
		return transport_information;
	}
	public void setTransport_information(String transport_information) {
		this.transport_information = transport_information;
	}
	public List<ParkingVO> getParking() {
		return parking;
	}
	public void setParking(List<ParkingVO> parking) {
		this.parking = parking;
	}
	public Integer getTerminal_mall() {
		return terminal_mall;
	}
	public void setTerminal_mall(Integer terminal_mall) {
		this.terminal_mall = terminal_mall;
	}
	public String getAppearance_pic() {
		return appearance_pic;
	}
	public void setAppearance_pic(String appearance_pic) {
		this.appearance_pic = appearance_pic;
	}
	public String getWeb_appearance_pic() {
		return web_appearance_pic;
	}
	public void setWeb_appearance_pic(String web_appearance_pic) {
		this.web_appearance_pic = web_appearance_pic;
	}
	public String getTraffic_pic() {
		return traffic_pic;
	}
	public void setTraffic_pic(String traffic_pic) {
		this.traffic_pic = traffic_pic;
	}
	public String getIntroduction_pic() {
		return introduction_pic;
	}
	public void setIntroduction_pic(String introduction_pic) {
		this.introduction_pic = introduction_pic;
	}
	public String getTerminal_logo() {
		return terminal_logo;
	}
	public void setTerminal_logo(String terminal_logo) {
		this.terminal_logo = terminal_logo;
	}
    public String getWechat_pic() {
        return wechat_pic;
    }
    public void setWechat_pic(String wechat_pic) {
        this.wechat_pic = wechat_pic;
    }
	public String getMerlog_pic() {
		return merlog_pic;
	}
	public void setMerlog_pic(String merlog_pic) {
		this.merlog_pic = merlog_pic;
	}
	/**
	 * @return the mall_level
	 */
	public String getMall_level() {
		return mall_level;
	}
	/**
	 * @param mall_level the mall_level to set
	 */
	public void setMall_level(String mall_level) {
		this.mall_level = mall_level;
	}
	/** 
	* @Title: toString 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @author shaozhou
	* @date 2016年3月2日 下午1:46:24
	* @throws 
	*/
	@Override
	public String toString() {
		return "MallVO [id=" + id + ", name=" + name + ", mold=" + mold + ", business_status=" + business_status
				+ ", recommend=" + recommend + ", aliases=" + aliases + ", weixin=" + weixin + ", mallAddress="
				+ mallAddress + ", business_hours=" + business_hours + ", description=" + description + ", telephone="
				+ telephone + ", transport_information=" + transport_information + ", parking=" + parking
				+ ", terminal_mall=" + terminal_mall + ", appearance_pic=" + appearance_pic + ", web_appearance_pic="
				+ web_appearance_pic + ", traffic_pic=" + traffic_pic + ", introduction_pic=" + introduction_pic
				+ ", terminal_logo=" + terminal_logo + ", wechat_pic=" + wechat_pic + ", icon=" + icon + ", merlog_pic="
				+ merlog_pic + ", mall_level=" + mall_level + "]";
	}
}
