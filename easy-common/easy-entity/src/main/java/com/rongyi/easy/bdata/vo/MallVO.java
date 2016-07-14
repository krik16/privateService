package com.rongyi.easy.bdata.vo;

/**
 * Desc: bdata mallvo
 * User: chris
 * Date: 2015/10/24 18:19
 */
import java.io.Serializable;
import java.util.List;

public class MallVO implements Serializable {
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

	private static final long serialVersionUID = 1L;
    private String id;//商场ID
    private String name;//商场名称
    private String mold;//商场类型
    private Integer businessStatus;//商场营业状态, 0:正常营业1:即将开业2:暂停营业3:停止营业
    private Integer recommend;//商场推荐：1-未推荐、2-已推荐
    private List<String> aliases;//商场别名
    private String weixin;//微信号
    private MallAddressVO mallAddress;//商场地址
    private String businessHours;//营业时间
    private String description;//商场介绍
    private String telephone;
    private String transInfor;//交通信息
    private List<ParkingVO> parking;//停车信息
    private Integer terminalMall;//终端机合作1-无合作、2-有合作
    private String appearPic;//APP外景图片：APP外景图的url地址
    private String webAppearPic;//WEB外景图片：WEB外景图url地址
    private String traffPic;//商场交通图：交通图url地址
    private String introPic;//商场介绍图：商场介绍图url地址
    private String terminalLogo;//终端机logo：终端机logourl地址
    private String wechatPic; //商场 微信展示图片：微信地址
    private String icon;//商场ICOn：图片logoURl
    private String tags;
    private Integer rank;
    private String slug;
    private Long shopNum;
    private double logoX;  //经度
    private double logoY;  //纬度
    private boolean hasCustomCategory;//是否有自定义分类
    
    

    public boolean isHasCustomCategory() {
		return hasCustomCategory;
	}

	public void setHasCustomCategory(boolean hasCustomCategory) {
		this.hasCustomCategory = hasCustomCategory;
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

    public Integer getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
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

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
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

    public String getTransInfor() {
        return transInfor;
    }

    public void setTransInfor(String transInfor) {
        this.transInfor = transInfor;
    }

    public List<ParkingVO> getParking() {
        return parking;
    }

    public void setParking(List<ParkingVO> parking) {
        this.parking = parking;
    }

    public Integer getTerminalMall() {
        return terminalMall;
    }

    public void setTerminalMall(Integer terminalMall) {
        this.terminalMall = terminalMall;
    }

    public String getAppearPic() {
        return appearPic;
    }

    public void setAppearPic(String appearPic) {
        this.appearPic = appearPic;
    }

    public String getWebAppearPic() {
        return webAppearPic;
    }

    public void setWebAppearPic(String webAppearPic) {
        this.webAppearPic = webAppearPic;
    }

    public String getTraffPic() {
        return traffPic;
    }

    public void setTraffPic(String traffPic) {
        this.traffPic = traffPic;
    }

    public String getIntroPic() {
        return introPic;
    }

    public void setIntroPic(String introPic) {
        this.introPic = introPic;
    }

    public String getTerminalLogo() {
        return terminalLogo;
    }

    public void setTerminalLogo(String terminalLogo) {
        this.terminalLogo = terminalLogo;
    }

    public String getWechatPic() {
        return wechatPic;
    }

    public void setWechatPic(String wechatPic) {
        this.wechatPic = wechatPic;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Long getShopNum() {
        return shopNum;
    }

    public void setShopNum(Long shopNum) {
        this.shopNum = shopNum;
    }
}
