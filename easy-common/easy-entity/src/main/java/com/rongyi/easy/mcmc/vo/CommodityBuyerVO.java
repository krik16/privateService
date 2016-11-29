package com.rongyi.easy.mcmc.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import com.rongyi.easy.mcmc.Commodity;
import com.rongyi.easy.roa.vo.GroupMemberVO;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

public class CommodityBuyerVO implements Serializable {
    private static final long serialVersionUID = -1461107119422444629L;
    private static final Integer MAX_GALLERY_POSITION = 100;

    private String shopName;//店铺名称
    private List<String> commodityPicList; // 图片地址
    private String commodityId;
    private String commodityCode;
    private String commodityStock;
    private int commodityStatus; // 状态
    private int commodityAppStatus;// 商品APP显示状态 (0下架  1上架  3待上架 4秒杀结束)
    private int commodityType;//渠道  1商家，2买手
    private boolean supportCourierDeliver;//支持快递发货    导购：true是   false否；买手：默认true
    private boolean supportSelfPickup;//支持到店自提  true 是    false否
    private boolean offlinePayment;// 线下支付
    private boolean onlinePayment;// 线上支付
    private boolean offlineRefund;// 线下退款
    private boolean onlineRefund;// 线上退款
    private List<String> shopIM;// 店铺可用IM账号
    private String bullId;//创建人
    private Double distance = 0.0; //距离
    private int saleShopCount; //销售店铺数，小于等于1为单店销售，大于1为多店销售
    private boolean watching = false; //是否正在看
    private List<Double> location; //经纬度
    private String systemNumber; //商品SPU
    private String activityType = "0";    //活动类型[0其他 闪购1、特卖2、秒杀3]
	//拼团商品数据
	private Integer activityCommodityStock;//活动商品库存
	private double activityPrice;//拼团商品最低价格
	private Long endAt;//拼团活动结束时间
	private Long startAt;//拼团活动开始时间
	private Integer activityStatus;//1:未开始，2：进行中，3：活动已结束
	private Boolean forceAttention = false;//下单是否需要强制关注,true：要关注，false：不需要关注
	private Integer groupPeopleLimit;//成团所需人数
	private String activityCommodityDesc;//拼团活动商品描述
	private int groupTotalNum;//活动商品参团总人数
    private String easyOrder;//容易令
    private Integer terminalType;//上架终端：com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
    private int isSpot;//是否现货	0 非现货 1现货
    private String mallName;//商场名称
    private String mallMid;//商场mongoId
    private List<String> goodsParam;//商品参数
    private double discount;
    private String commodityCurrentPrice;
    private Integer galleryPosition;//1,2,3分别对应橱窗1,2,3
    private String commodityOPriceMax;//我是最高原价”,
    private String commodityOPriceMin;//我是最低原价”,
    private String commodityCPriceMax;//我是最高现价”,
    private String commodityCPriceMin;//我是最低现价”,
    private String commodityOPOfLCP;//我是最低现价对应的原价
    private String commodityPostage;//我是商品邮费”,
    private String commodityDescription;//我是商品描述”,
    private String commodityName;//我是商品名称”,
    private String shopId;//123”,
    private Integer purchaseCount;//商品的限购数量
    private String shopMid;
    private String commodityBrandName;//商品所属的品牌名字
    private boolean isCollected;  //是否被收藏
    private String mallTip; ///< 商城标签（商城名称，如果是街边店则是街边点名称）
    private String brandLogo;
    private String shopLogo;
    private String weAndTeStatus;//商品在终端机与App上的隐藏与显示
    private String securityDesc;//保障说明
    private String securityIcon;//保障说明icon
    private Boolean isSale;//是否可售 true 可售 false 不可售
    private Integer existEnd;//是否存在已结束活动，1存在 0 不存在
    private Integer existStart;//是否存在待开始活动 1存在，0 不存在
    private Integer existProgress;//是否存在进行中活动，1存在，0 不存在
    private Long activityStartAt;//活动开始时间
    private Long activityEndAt;//活动结束时间
    private Integer activityStock;//活动库存
    private String activityMinPrice;//活动 各规格中最低价
    private Long registerAt;//上架时间
	private Long soldOutAt;//下架时间
    private Integer shelvesType;//1:立即上架，手动下架,2:定时上下架


	public Long getRegisterAt() {
		return registerAt;
	}

	public void setRegisterAt(Long registerAt) {
		this.registerAt = registerAt;
	}

	public Long getSoldOutAt() {
		return soldOutAt;
	}

	public void setSoldOutAt(Long soldOutAt) {
		this.soldOutAt = soldOutAt;
	}

	public Integer getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(Integer activityStatus) {
		this.activityStatus = activityStatus;
	}

	public Integer getActivityCommodityStock() {
		return activityCommodityStock;
	}

	public void setActivityCommodityStock(Integer activityCommodityStock) {
		this.activityCommodityStock = activityCommodityStock;
	}

	public double getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(double activityPrice) {
		this.activityPrice = activityPrice;
	}

	public Long getEndAt() {
		return endAt;
	}

	public void setEndAt(Long endAt) {
		this.endAt = endAt;
	}

	public Long getStartAt() {
		return startAt;
	}

	public void setStartAt(Long startAt) {
		this.startAt = startAt;
	}

	public Boolean getForceAttention() {
		return forceAttention;
	}

	public void setForceAttention(Boolean forceAttention) {
		this.forceAttention = forceAttention;
	}

	public Integer getGroupPeopleLimit() {
		return groupPeopleLimit;
	}

	public void setGroupPeopleLimit(Integer groupPeopleLimit) {
		this.groupPeopleLimit = groupPeopleLimit;
	}

	public String getActivityCommodityDesc() {
		return activityCommodityDesc;
	}

	public void setActivityCommodityDesc(String activityCommodityDesc) {
		this.activityCommodityDesc = activityCommodityDesc;
	}

	public int getGroupTotalNum() {
		return groupTotalNum;
	}

	public void setGroupTotalNum(int groupTotalNum) {
		this.groupTotalNum = groupTotalNum;
	}

    public Integer getGalleryPosition() {
        return galleryPosition;
    }

    public void setGalleryPosition(Integer galleryPosition) {
        this.galleryPosition = galleryPosition;
    }

    public String getCommodityCurrentPrice() {
        return commodityCurrentPrice;
    }

    public void setCommodityCurrentPrice(String commodityCurrentPrice) {
        this.commodityCurrentPrice = commodityCurrentPrice;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getSystemNumber() {
        return systemNumber;
    }

    public void setSystemNumber(String systemNumber) {
        this.systemNumber = systemNumber;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public boolean isWatching() {
        return watching;
    }

    public void setWatching(boolean watching) {
        this.watching = watching;
    }

    public int getSaleShopCount() {
        return saleShopCount;
    }

    public void setSaleShopCount(int saleShopCount) {
        this.saleShopCount = saleShopCount;
    }

    public boolean isOfflinePayment() {
        return offlinePayment;
    }

    public void setOfflinePayment(boolean offlinePayment) {
        this.offlinePayment = offlinePayment;
    }

    public boolean isOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(boolean onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public boolean isOfflineRefund() {
        return offlineRefund;
    }

    public void setOfflineRefund(boolean offlineRefund) {
        this.offlineRefund = offlineRefund;
    }

    public boolean isOnlineRefund() {
        return onlineRefund;
    }

    public void setOnlineRefund(boolean onlineRefund) {
        this.onlineRefund = onlineRefund;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getBullId() {
        return bullId;
    }

    public void setBullId(String bullId) {
        this.bullId = bullId;
    }

    public int getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(int commodityType) {
        this.commodityType = commodityType;
    }

    public String getCommodityStock() {
        return commodityStock;
    }

    public void setCommodityStock(String commodityStock) {
        this.commodityStock = commodityStock;
    }

    public int getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(int commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getCommodityBrandName() {
        return commodityBrandName;
    }

    public void setCommodityBrandName(String commodityBrandName) {
        this.commodityBrandName = commodityBrandName;
    }

    public String getCommodityOPOfLCP() {
        return commodityOPOfLCP;
    }

    public void setCommodityOPOfLCP(String commodityOPOfLCP) {
        this.commodityOPOfLCP = commodityOPOfLCP;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public String getMallTip() {
        return mallTip;
    }

    public void setMallTip(String mallTip) {
        this.mallTip = mallTip;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public int getIsSpot() {
        return isSpot;
    }

    public void setIsSpot(int isSpot) {
        this.isSpot = isSpot;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getMallMid() {
        return mallMid;
    }

    public void setMallMid(String mallMid) {
        this.mallMid = mallMid;
    }

    public List<String> getGoodsParam() {
        return goodsParam;
    }

    public void setGoodsParam(List<String> goodsParam) {
        this.goodsParam = goodsParam;
    }

    public CommodityBuyerVO() {

    }



    public List<String> getCommodityPicList() {
        return commodityPicList;
    }

    public void setCommodityPicList(List<String> commodityPicList) {
        this.commodityPicList = commodityPicList;
    }

    public String getCommodityOPriceMax() {
        return commodityOPriceMax;
    }

    public void setCommodityOPriceMax(String commodityOPriceMax) {
        this.commodityOPriceMax = commodityOPriceMax;
    }

    public String getCommodityOPriceMin() {
        return commodityOPriceMin;
    }

    public void setCommodityOPriceMin(String commodityOPriceMin) {
        this.commodityOPriceMin = commodityOPriceMin;
    }

    public String getCommodityCPriceMax() {
        return commodityCPriceMax;
    }

    public void setCommodityCPriceMax(String commodityCPriceMax) {
        this.commodityCPriceMax = commodityCPriceMax;
    }

    public String getCommodityCPriceMin() {
        return commodityCPriceMin;
    }

    public void setCommodityCPriceMin(String commodityCPriceMin) {
        this.commodityCPriceMin = commodityCPriceMin;
    }

    public String getCommodityPostage() {
        return commodityPostage;
    }

    public void setCommodityPostage(String commodityPostage) {
        this.commodityPostage = commodityPostage;
    }

    public String getCommodityDescription() {
        return commodityDescription;
    }

    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public boolean isCollected() {
        return isCollected;
    }

    public void setCollected(boolean isCollected) {
        this.isCollected = isCollected;
    }

    public List<String> getShopIM() {
        return shopIM;
    }

    public void setShopIM(List<String> shopIM) {
        this.shopIM = shopIM;
    }

    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public boolean isSupportCourierDeliver() {
        return supportCourierDeliver;
    }

    public void setSupportCourierDeliver(boolean supportCourierDeliver) {
        this.supportCourierDeliver = supportCourierDeliver;
    }

    public String getEasyOrder() {
        return easyOrder;
    }

    public void setEasyOrder(String easyOrder) {
        this.easyOrder = easyOrder;
    }

    public boolean isSupportSelfPickup() {
        return supportSelfPickup;
    }

    public void setSupportSelfPickup(boolean supportSelfPickup) {
        this.supportSelfPickup = supportSelfPickup;
    }

    public int getCommodityAppStatus() {
        return commodityAppStatus;
    }

    public void setCommodityAppStatus(int commodityAppStatus) {
        this.commodityAppStatus = commodityAppStatus;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getSecurityDesc() {
        return securityDesc;
    }

    public void setSecurityDesc(String securityDesc) {
        this.securityDesc = securityDesc;
    }

    public String getSecurityIcon() {
        return securityIcon;
    }

    public void setSecurityIcon(String securityIcon) {
        this.securityIcon = securityIcon;
    }

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    public Integer getExistEnd() {
        return existEnd;
    }

    public void setExistEnd(Integer existEnd) {
        this.existEnd = existEnd;
    }

    public Integer getExistStart() {
        return existStart;
    }

    public void setExistStart(Integer existStart) {
        this.existStart = existStart;
    }

    public Integer getExistProgress() {
        return existProgress;
    }

    public void setExistProgress(Integer existProgress) {
        this.existProgress = existProgress;
    }

    public Long getActivityStartAt() {
        return activityStartAt;
    }

    public void setActivityStartAt(Long activityStartAt) {
        this.activityStartAt = activityStartAt;
    }

    public Long getActivityEndAt() {
        return activityEndAt;
    }

    public void setActivityEndAt(Long activityEndAt) {
        this.activityEndAt = activityEndAt;
    }

    public Integer getActivityStock() {
        return activityStock;
    }

    public void setActivityStock(Integer activityStock) {
        this.activityStock = activityStock;
    }

    public String getActivityMinPrice() {
        return activityMinPrice;
    }

    public void setActivityMinPrice(String activityMinPrice) {
        this.activityMinPrice = activityMinPrice;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public String getWeAndTeStatus() {
        return weAndTeStatus;
    }

    public void setWeAndTeStatus(String weAndTeStatus) {
        this.weAndTeStatus = weAndTeStatus;
    }

    public Integer getShelvesType() {
        return null ==shelvesType?2:shelvesType;
    }

    public void setShelvesType(Integer shelvesType) {
        this.shelvesType = shelvesType;
    }

    public CommodityBuyerVO(Commodity commodity){
        if(commodity.getDiscount()!=null)
            this.discount=commodity.getDiscount();
        this.commodityId = commodity.getId().toString();
        this.commodityPicList = commodity.getPicList();
        this.commodityOPriceMax = commodity.getoPriceMax();
        this.commodityOPriceMin = commodity.getoPriceMin();
        this.commodityCPriceMax = commodity.getcPriceMax();
        this.commodityCPriceMin = commodity.getcPriceMin();
        this.commodityCurrentPrice=commodity.getCurrentPrice();
        this.goodsParam = commodity.getGoodsParam();//商品参数
        if(commodity.getPostage() != null && !commodity.getPostage().isEmpty()){
            try{
                double postage = Double.parseDouble(commodity.getPostage());
                this.commodityPostage = commodity.getPostage();
            }catch(Exception e){
                this.commodityPostage = "0.0";
            }
        }else{
            this.commodityPostage = "0.0";
        }
        if(commodity.isSpot()){
            this.isSpot = 1;//现货
        }else{
            this.isSpot = 0;//非现货
        }
//		this.commodityPostage = commodity.getPostage();
        this.commodityDescription = commodity.getDescription();
        this.commodityName = commodity.getName();
        this.shopId = commodity.getShopId();
        this.shopMid = "";
        if(commodity.getShopMid() != null ){
            this.shopMid = commodity.getShopMid();
        }
        this.mallMid = "";
        if(StringUtils.isNotBlank(commodity.getMallMid())){
            this.mallMid = commodity.getMallMid();
        }
        this.commodityOPOfLCP = commodity.getoPriceOfLowestCPrice();
        if (StringUtils.isBlank(this.commodityOPOfLCP)) {
            this.commodityOPOfLCP = "0.0";
        }
        this.commodityCode = commodity.getCode();
        this.commodityStatus = commodity.getStatus();
        this.commodityStock = String.valueOf(commodity.getStock());
        this.commodityBrandName = "";
        if(commodity.getBrandName() != null){
            this.commodityBrandName = commodity.getBrandName();
        }
        if(commodity.getCreate_by() != null){
            this.bullId = commodity.getCreate_by();//商品创建人
        }
        // 买手版渠道  0商家，1买手
        this.commodityType = commodity.getType();
        this.supportCourierDeliver = commodity.isSupportCourierDeliver();
        this.supportSelfPickup = commodity.isSupportSelfPickup();
        this.terminalType = commodity.getTerminalType();// 终端
        if(commodity.getPurchaseCount() == null || commodity.getPurchaseCount() == 0){
            this.purchaseCount = -1;
        }else{
            this.purchaseCount = commodity.getPurchaseCount();//商品限购数量
        }
        // 商品待上架且上架时间大于当前时间，app商品状态为 待上架
        //商品上架或待上架，且上架时间小于当前时间，且下架时间大于当前时间，app商品状态为 上架
        //其他 下架
        //状态 -1：非现货初始化(直播使用） 0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理5待审核 6审核失败
        if (this.commodityStatus == 3 && (commodity.getRegisterAt() != null && commodity.getRegisterAt().getTime() - new Date().getTime() > 0)) {
            this.commodityAppStatus = 3;
        } else if ((commodityStatus == 1 || commodityStatus == 3)
                && (commodity.getRegisterAt() != null && commodity.getRegisterAt().getTime() - new Date().getTime() <= 0)
                && (commodity.getSoldOutAt() != null && commodity.getSoldOutAt().getTime() - new Date().getTime() > 0)) {
            this.commodityAppStatus = 1;
        } else if (commodityAppStatus != 0 && commodityAppStatus != 1 && commodityAppStatus != 3) {
            this.commodityAppStatus = 0;
        } else {
            this.commodityAppStatus = this.commodityStatus;
        }
        this.systemNumber = commodity.getSystemNumber();

        //活动类型[0其他 闪购1、特卖2、秒杀3]
        if (StringUtils.isNotBlank(commodity.getSecKillSign())) {
            this.activityType = "3";
        } else if (commodity.getSaleId() != null) {
            this.activityType = "2";
        } else if (commodity.getFlashSaleId() != null) {
            this.activityType = "1";
        } else if (StringUtils.isNotBlank(commodity.getSecKillSign())) {
            this.activityType = "3";
        } else {
            //其他
            this.activityType = "0";
        }

        // 当前是秒杀商品
        if ("3".equals(this.activityType)) {
            long nowTime = new Date().getTime();
            // 商品处于上架状态
            if (this.commodityAppStatus == 1) {
                if (commodity.getActivityStartTime() != null && commodity.getActivityStartTime().getTime() > nowTime) {
                    // 秒杀未开始
                    this.commodityAppStatus = 3;
                } else if (commodity.getActivityEndTime() != null && commodity.getActivityEndTime().getTime() <= nowTime) {
                    // 秒杀已结束
                    this.commodityAppStatus = 4;
                }
            }
        }
        //默认返回非橱窗商品的值设置为0
        this.galleryPosition=commodity.getGalleryPosition()==null || commodity.getGalleryPosition()==0 ?0:MAX_GALLERY_POSITION-commodity.getGalleryPosition();
        this.weAndTeStatus = commodity.getWeAndTeStatus();
        if(commodity.getRegisterAt() != null){
        	this.registerAt = commodity.getRegisterAt().getTime();//上架时间
        }
        if(commodity.getSoldOutAt() != null){
        	this.soldOutAt = commodity.getSoldOutAt().getTime();//下架时间
        }
        if(commodity.getShelvesType() != null){
        	this.shelvesType=commodity.getShelvesType();
        }
    }

    @Override
    public String toString() {
        return "CommodityBuyerVO{" +
                "shopName='" + shopName + '\'' +
                ", commodityPicList=" + commodityPicList +
                ", commodityId='" + commodityId + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", commodityStock='" + commodityStock + '\'' +
                ", commodityStatus=" + commodityStatus +
                ", commodityAppStatus=" + commodityAppStatus +
                ", commodityType=" + commodityType +
                ", supportCourierDeliver=" + supportCourierDeliver +
                ", supportSelfPickup=" + supportSelfPickup +
                ", offlinePayment=" + offlinePayment +
                ", onlinePayment=" + onlinePayment +
                ", offlineRefund=" + offlineRefund +
                ", onlineRefund=" + onlineRefund +
                ", shopIM=" + shopIM +
                ", bullId='" + bullId + '\'' +
                ", distance=" + distance +
                ", saleShopCount=" + saleShopCount +
                ", watching=" + watching +
                ", location=" + location +
                ", systemNumber='" + systemNumber + '\'' +
                ", activityType='" + activityType + '\'' +
                ", commodityOPriceMax='" + commodityOPriceMax + '\'' +
                ", commodityOPriceMin='" + commodityOPriceMin + '\'' +
                ", commodityCPriceMax='" + commodityCPriceMax + '\'' +
                ", commodityCPriceMin='" + commodityCPriceMin + '\'' +
                ", commodityOPOfLCP='" + commodityOPOfLCP + '\'' +
                ", commodityBrandName='" + commodityBrandName + '\'' +
                ", securityDesc='" + securityDesc + '\'' +
                ", securityIcon='" + securityIcon + '\'' +
                ", isSale=" + isSale +
                ", existEnd=" + existEnd +
                ", existStart=" + existStart +
                ", existProgress=" + existProgress +
                ", activityStartAt=" + activityStartAt +
                ", activityEndAt=" + activityEndAt +
                ", activityStock=" + activityStock +
                ", activityMinPrice='" + activityMinPrice + '\'' +
                ", easyOrder='" + easyOrder + '\'' +
                ", commodityPostage='" + commodityPostage + '\'' +
                ", commodityDescription='" + commodityDescription + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", shopId='" + shopId + '\'' +
                ", purchaseCount=" + purchaseCount +
                ", shopMid='" + shopMid + '\'' +
                ", isCollected=" + isCollected +
                ", mallTip='" + mallTip + '\'' +
                ", terminalType=" + terminalType +
                ", isSpot=" + isSpot +
                ", mallName='" + mallName + '\'' +
                ", mallMid='" + mallMid + '\'' +
                ", goodsParam=" + goodsParam +
                ", discount=" + discount +
                ", commodityCurrentPrice='" + commodityCurrentPrice + '\'' +
                ", galleryPosition=" + galleryPosition +
                ", shelvesType=" + shelvesType +
                '}';
    }

    public void setTip() {
        this.setMallTip(StringUtils.isNotBlank(this.getMallName()) ?
                this.getMallName() : (StringUtils.isNotBlank(this.getShopName()) ? this.getShopName() : null));
    }

    private boolean judgeShelvesType(Date date1,Date date2){
        if(null ==date1 || null ==date2){
            return false;
        }
        Long difference=date1.getTime()-date2.getTime();
        return Math.abs(difference)<24*60*60*1000;//上下架时间相差一天
    }

    public  static  void  main(String args[]){
        Date  a=new Date();
        Date b= DateUtils.addYears(a, 30);
        Date c=DateUtils.addDays(a,1);
        CommodityBuyerVO vo=new CommodityBuyerVO();
        System.out.println(vo.judgeShelvesType(DateUtils.addYears(a, 30), b));
        System.out.println(c.getTime() - a.getTime());

    }
}
