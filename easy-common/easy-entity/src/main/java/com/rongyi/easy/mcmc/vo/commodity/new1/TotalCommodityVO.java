package com.rongyi.easy.mcmc.vo.commodity.new1;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.constant.Identity;
import com.rongyi.easy.bsoms.entity.SessionUserInfo;
import com.rongyi.easy.malllife.constants.Constants;
import com.rongyi.easy.mcmc.TotalCommodity;
import com.rongyi.easy.mcmc.constant.CommodityConstants;
import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;
import com.rongyi.easy.mcmc.param.CommodityParam;
import com.rongyi.easy.mcmc.param.CommoditySpecParam;
import com.rongyi.easy.ryoms.entity.WechatInfoVo;
import com.rongyi.easy.util.new1.CommodityUtil;
import com.rongyi.easy.util.new1.StringUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.*;

/**
 * Created by yaoyiwei on 2017/4/11.
 */
public class TotalCommodityVO implements Serializable, Cloneable {
    private static final long serialVersionUID = -3022699601318372490L;

    private ObjectId id;

    private String name;//商品名称
    private String category;//商品品类id
    private Integer status;//状态  0下架 1上架 (当前时间在上架时间和下架时间之间)2是删除3待上架4待处理5待审核 6审核失败

    private String code;//商品条码（海信：商品编码）
    private String barCode; // 商品条形码（海信）
    private String description;//商品描述
    private String postage;//商品邮费
    private Integer stock;//商品库存

    private Date createAt;//数据创建日期
    private Date updateAt;//数据更新日期
    private String originalPrice;//商品原价
    private String currentPrice;//商品现价
    private Integer updateBy;//修改人
    private Integer createBy;//创建者

    private List<String> picList;//商品图片列表

    private List<ObjectId> categoryIds;//商品所属的品类列表
    private List<Integer> customCategoryIds;//自定义分类集合;

    //private Integer distribution;//配送方式 1表示到店自提2快递3表示支持两种方式
    private Integer freight;//1表示商家承担运费,0表示买家承担运费
    private Integer terminalType;//上架终端：com.rongyi.easy.mcmc.constant.CommodityTerminalType常量定义
    private Date registerAt;//上架时间
    private Date soldOutAt;//下架时间
    private Integer source;//来源
    private Integer stockStatus;//0表示统一库存1表示分管库存
    private List<ObjectId> commodityIds;
    private List<ObjectId> specList;//商品规格列表
    private String reason;//下架原因

    private String brandMid;//品牌id
    private List<String> filialeMids;//分公司id
    private List<String> shopMids;//店铺id
    //private String brandId;//品牌mysqlId


    private String commodityModelNo;//商品款号
    private List<String> goodsParam;//商品参数

    private boolean supportCourierDeliver=true;//支持快递发货字段  true 是    false否

    private boolean supportSelfPickup=true;//支持到店自提  true 是    false否

    private Integer identity = 4;//0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购,6买手

    private boolean immediateOn = false;//true表示设置是立即上架

    private List<String> skus;//规格sku集合

    private Integer purchaseCount;//商品的限购数量

    private Integer templateId;//邮费模版id
    private boolean goodsSec = true;//正品保障

    private String subheading;  //副标题

    private String commodityDetails; //商品详情

    private Double discount; // 折扣

    private Integer shelvesType;//1:立即上架，手动下架,2:定时上下架

    private List<String> locationIds;//商品记录发到所有集团或者单个商场或者单个店铺集合
    private List<Integer> serviceIds;//微信公众号ids或者容易逛id
    private List<String> mallServiceIds;
    private Integer accountType;
    private String merchantId;  //商户id
    private List<WechatInfoVo> wechatInfoVos;
    private Integer serviceDescriptionId;
    private String serviceDescription;//售后说明
    private String serviceDescriptionRemark;

    private List<String> onServiceIds;
    private List<String> offServiceIds;
    private String brandName;
    private Integer commodityRange;
    private Integer updateType = 1; // 0：修改库存，1：修改商品。默认1
    private Integer sourceParam = 0; // 本次数据来源。0：商家后台页面添加，1：海信导入，2：app摩店。默认0

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public List<ObjectId> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<ObjectId> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public List<Integer> getCustomCategoryIds() {
        return customCategoryIds;
    }

    public void setCustomCategoryIds(List<Integer> customCategoryIds) {
        this.customCategoryIds = customCategoryIds;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public Date getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Date registerAt) {
        this.registerAt = registerAt;
    }

    public Date getSoldOutAt() {
        return soldOutAt;
    }

    public void setSoldOutAt(Date soldOutAt) {
        this.soldOutAt = soldOutAt;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
    }

    public List<ObjectId> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<ObjectId> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public List<ObjectId> getSpecList() {
        return specList;
    }

    public void setSpecList(List<ObjectId> specList) {
        this.specList = specList;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBrandMid() {
        return brandMid;
    }

    public void setBrandMid(String brandMid) {
        this.brandMid = brandMid;
    }

    public List<String> getFilialeMids() {
        return filialeMids;
    }

    public void setFilialeMids(List<String> filialeMids) {
        this.filialeMids = filialeMids;
    }

    public List<String> getShopMids() {
        return shopMids;
    }

    public void setShopMids(List<String> shopMids) {
        this.shopMids = shopMids;
    }

    public String getCommodityModelNo() {
        return commodityModelNo;
    }

    public void setCommodityModelNo(String commodityModelNo) {
        this.commodityModelNo = commodityModelNo;
    }

    public List<String> getGoodsParam() {
        return goodsParam;
    }

    public void setGoodsParam(List<String> goodsParam) {
        this.goodsParam = goodsParam;
    }

    public boolean isSupportCourierDeliver() {
        return supportCourierDeliver;
    }

    public void setSupportCourierDeliver(boolean supportCourierDeliver) {
        this.supportCourierDeliver = supportCourierDeliver;
    }

    public boolean isSupportSelfPickup() {
        return supportSelfPickup;
    }

    public void setSupportSelfPickup(boolean supportSelfPickup) {
        this.supportSelfPickup = supportSelfPickup;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public boolean isImmediateOn() {
        return immediateOn;
    }

    public void setImmediateOn(boolean immediateOn) {
        this.immediateOn = immediateOn;
    }

    public List<String> getSkus() {
        return skus;
    }

    public void setSkus(List<String> skus) {
        this.skus = skus;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public boolean isGoodsSec() {
        return goodsSec;
    }

    public void setGoodsSec(boolean goodsSec) {
        this.goodsSec = goodsSec;
    }

    public String getSubheading() {
        return subheading;
    }

    public void setSubheading(String subheading) {
        this.subheading = subheading;
    }

    public String getCommodityDetails() {
        return commodityDetails;
    }

    public void setCommodityDetails(String commodityDetails) {
        this.commodityDetails = commodityDetails;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getShelvesType() {
        return shelvesType;
    }

    public void setShelvesType(Integer shelvesType) {
        this.shelvesType = shelvesType;
    }

    public List<String> getLocationIds() {
        return locationIds;
    }

    public void setLocationIds(List<String> locationIds) {
        this.locationIds = locationIds;
    }

    public List<Integer> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<Integer> serviceIds) {
        this.serviceIds = serviceIds;
    }

    public List<String> getMallServiceIds() {
        return mallServiceIds;
    }

    public void setMallServiceIds(List<String> mallServiceIds) {
        this.mallServiceIds = mallServiceIds;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public List<WechatInfoVo> getWechatInfoVos() {
        return wechatInfoVos;
    }

    public void setWechatInfoVos(List<WechatInfoVo> wechatInfoVos) {
        this.wechatInfoVos = wechatInfoVos;
    }

    public Integer getServiceDescriptionId() {
        return serviceDescriptionId;
    }

    public void setServiceDescriptionId(Integer serviceDescriptionId) {
        this.serviceDescriptionId = serviceDescriptionId;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceDescriptionRemark() {
        return serviceDescriptionRemark;
    }

    public void setServiceDescriptionRemark(String serviceDescriptionRemark) {
        this.serviceDescriptionRemark = serviceDescriptionRemark;
    }

    public List<String> getOnServiceIds() {
        return onServiceIds;
    }

    public void setOnServiceIds(List<String> onServiceIds) {
        this.onServiceIds = onServiceIds;
    }

    public List<String> getOffServiceIds() {
        return offServiceIds;
    }

    public void setOffServiceIds(List<String> offServiceIds) {
        this.offServiceIds = offServiceIds;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getCommodityRange() {
        return commodityRange;
    }

    public void setCommodityRange(Integer commodityRange) {
        this.commodityRange = commodityRange;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public Integer getSourceParam() {
        return sourceParam;
    }

    public void setSourceParam(Integer sourceParam) {
        this.sourceParam = sourceParam;
    }

    @Override
    public String toString() {
        return "TotalCommodityVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", status=" + status +
                ", code='" + code + '\'' +
                ", barCode='" + barCode + '\'' +
                ", description='" + description + '\'' +
                ", postage='" + postage + '\'' +
                ", stock=" + stock +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", originalPrice='" + originalPrice + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                ", updateBy=" + updateBy +
                ", createBy=" + createBy +
                ", picList=" + picList +
                ", categoryIds=" + categoryIds +
                ", customCategoryIds=" + customCategoryIds +
                ", freight=" + freight +
                ", terminalType=" + terminalType +
                ", registerAt=" + registerAt +
                ", soldOutAt=" + soldOutAt +
                ", source=" + source +
                ", stockStatus=" + stockStatus +
                ", commodityIds=" + commodityIds +
                ", specList=" + specList +
                ", reason='" + reason + '\'' +
                ", brandMid='" + brandMid + '\'' +
                ", filialeMids=" + filialeMids +
                ", shopMids=" + shopMids +
                ", commodityModelNo='" + commodityModelNo + '\'' +
                ", goodsParam=" + goodsParam +
                ", supportCourierDeliver=" + supportCourierDeliver +
                ", supportSelfPickup=" + supportSelfPickup +
                ", identity=" + identity +
                ", immediateOn=" + immediateOn +
                ", skus=" + skus +
                ", purchaseCount=" + purchaseCount +
                ", templateId=" + templateId +
                ", goodsSec=" + goodsSec +
                ", subheading='" + subheading + '\'' +
                ", commodityDetails='" + commodityDetails + '\'' +
                ", discount=" + discount +
                ", shelvesType=" + shelvesType +
                ", locationIds=" + locationIds +
                ", serviceIds=" + serviceIds +
                ", mallServiceIds=" + mallServiceIds +
                ", accountType=" + accountType +
                ", merchantId='" + merchantId + '\'' +
                ", wechatInfoVos=" + wechatInfoVos +
                ", serviceDescriptionId=" + serviceDescriptionId +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", serviceDescriptionRemark='" + serviceDescriptionRemark + '\'' +
                ", onServiceIds=" + onServiceIds +
                ", offServiceIds=" + offServiceIds +
                ", brandName='" + brandName + '\'' +
                ", commodityRange=" + commodityRange +
                ", updateType=" + updateType +
                ", sourceParam=" + sourceParam +
                '}';
    }

    public Double getDiscount() {
        try {
            if(StringUtils.isNotBlank(this.currentPrice) && StringUtils.isNotBlank(this.originalPrice)) {
                NumberFormat ddf1 = NumberFormat.getNumberInstance() ;
                ddf1.setMaximumFractionDigits(2);
                Double currentPrice = Double.valueOf(this.currentPrice);
                Double originalPrice = Double.valueOf(this.originalPrice);

                return (originalPrice == 0) ? 10.0 : Double.valueOf(ddf1.format(currentPrice / originalPrice)) * 10;
            }
            return 10.0;
        } catch(Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void setTotalCommodityFromParam(CommodityParam param, SessionUserInfo userInfo, Map<String, Object> skus) {
        try {
            //老的商家后台数据默认是店长发布的商品
            this.setIdentity(CommodityUtil.resetIdentity(this.getIdentity(), userInfo.getIdentity()));
            this.setId(StringUtils.isNotBlank(param.getId())?new ObjectId(param.getId()):null);
            this.setName(param.getName());
            this.setCode(param.getCode());
            this.setCategory(param.getCategory());
            this.setCategoryIds(param.getCategoryIds());
            this.setCustomCategoryIds(param.getCustomCategoryIds());
            this.setDescription(param.getDescription());
            this.setPostage(param.getPostage());
            this.setOriginalPrice(param.getOriginalPrice());
            this.setCurrentPrice(param.getCurrentPrice());
            this.setPicList(param.getPicList());
            this.setSupportCourierDeliver(true);
            this.setSupportSelfPickup(true);
            switch(param.getDistribution()){
                //配送方式 1表示到店自提2快递3表示支持两种方式
                //supportCourierDeliver支持快递发货字段  true 是    false否
                // supportSelfPickup支持到店自提  true 是    false否
                case 2:this.setSupportSelfPickup(false);break;
                case 1:this.setSupportCourierDeliver(false);break;
                case 0:this.setSupportCourierDeliver(false);this.setSupportSelfPickup(false);
            }
            this.setFreight(param.getFreight());
            this.setTerminalType(param.getTerminalType());
            if(param.getStatus() != null && param.getStatus() == 5) {// 立即上架
                this.setRegisterAt(DateTool.addTime(new Date(), 3));
                this.setSoldOutAt(DateTool.addYears(this.getRegisterAt(), 1));
                this.setImmediateOn(true);//表示前端是立即上架修改页面展示使用
            } else {
                this.setRegisterAt(param.getRegisterAt());
                this.setSoldOutAt(param.getSoldOutAt());
            }
            this.setStatus(CommodityDataStatus.STATUS_COMMODITY_SHELVE_WAITING);//上架状态
            //商家后台修改商品不能改变来源
            if(this.getId() == null) {
                this.setSource(0);
            }
            this.setStockStatus(param.getStockStatus());
            if(this.getId() == null) {
                this.setCreateAt(new Date());
            }
            this.setUpdateAt(new Date());
            this.setUpdateBy(userInfo.getId());
            this.setPurchaseCount(param.getPurchaseCount());
            this.setTemplateId(param.getTemplateId());
            this.setReason(param.getReason());

            setFilialeMids(param.getCommoditySpeceParams(), this);
            setShopMids(param.getCommoditySpeceParams(), this);

            this.setCreateBy((param.getId() == null) ? userInfo.getId() : param.getCreateBy());

            if(CollectionUtils.isNotEmpty(skus.keySet())) {
                this.setSkus(new ArrayList<>(skus.keySet()));
            }

            this.setAccountType(userInfo.getIdentity());
            this.setMallServiceIds(param.getServiceIds());
            if(param.getTerminalType() == 1 ||
                    param.getTerminalType() == 3 ||
                    param.getTerminalType() == 5 ||
                    param.getTerminalType() == 7) {
                this.setOnServiceIds(Arrays.asList(Constants.ServiceId.APP_RONG_YI_GUANG));
            }
            this.setMerchantId(userInfo.getBindingMid());
            this.setSource(param.getSource());
            this.setSubheading(param.getSubheading());
            this.setCommodityDetails(param.getCommodityDetails());

            this.setShelvesType(param.getShelvesType());

            this.setBrandMid(param.getBrandMid());
            this.setBrandName(param.getBrandName());
            this.setCommodityModelNo(param.getCommodityModelNo());
            this.setServiceDescriptionId(param.getServiceDescriptionId());
            this.setServiceDescription(param.getServiceDescription());
            this.setServiceDescriptionRemark(param.getServiceDescriptionRemark());
            this.setGoodsParam(Arrays.asList(param.getGoodsParam()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("参数错误");
        }
    }

    public void setTotalCommodityFromHaiXinParam(CommodityParam param, SessionUserInfo userInfo) {
        try {

            this.id=StringUtils.isNotBlank(param.getId())?new ObjectId(param.getId()):null;
            this.setCommodityRange(CommodityConstants.CommodityType.HAIXIN);
            this.setName(param.getName());
            this.setCode(param.getCode());
            this.setBarCode(param.getBarCode());
            this.setCategory(param.getCategory());
            this.setCategoryIds(param.getCategoryIds());

            this.setCustomCategoryIds(param.getCustomCategoryIds());
            this.setDescription(param.getDescription());
            this.setPostage(param.getPostage());
            this.setOriginalPrice(param.getOriginalPrice());
            this.setCurrentPrice(param.getCurrentPrice());
            this.setPicList(param.getPicList());
            this.setSupportCourierDeliver(true);
            this.setSupportSelfPickup(true);
            if (null != param.getDistribution()) {
                switch(param.getDistribution()){
                    //配送方式 1表示到店自提2快递3表示支持两种方式
                    //supportCourierDeliver支持快递发货字段  true 是    false否
                    // supportSelfPickup支持到店自提  true 是    false否
                    case 2:this.setSupportSelfPickup(false);break;
                    case 1:this.setSupportCourierDeliver(false);break;
                    case 0:this.setSupportCourierDeliver(false);this.setSupportSelfPickup(false);
                }
            }
            this.setFreight(param.getFreight());

            //商家后台修改商品不能改变来源（修改商品，source在service层取数据原source值）
            this.setSource(param.getSource());
            if(this.getId() == null) {
                this.setCreateAt(new Date());
                this.setCreateBy(null == userInfo ? null : userInfo.getId());
                this.setTerminalType(CommodityTerminalType.TERMINAL_TYPE_4);

                this.setStatus(CommodityDataStatus.STATUS_COMMODITY_CHECK_PENDING);//上架状态:待审核

                // 新增：海信导入
                if (null != param.getSource() && 1 == param.getSource()) {
                    this.setStatus(CommodityDataStatus.STATUS_COMMODITY_PENDING);//上架状态:待处理
                    this.setCreateBy(-1);
                }
            }  else {
                this.setCreateBy(param.getCreateBy());
                this.setTerminalType(param.getTerminalType());
                this.setRegisterAt(param.getRegisterAt());
                this.setSoldOutAt(param.getSoldOutAt());
                this.setStatus(param.getStatus());
            }

            this.setStock(param.getRemain()); // 当前库存
            this.setStockStatus(param.getStockStatus());
            this.setUpdateAt(new Date());
            this.setUpdateBy(null == userInfo ? null : userInfo.getId());
            this.setPurchaseCount(param.getPurchaseCount());
            this.setTemplateId(param.getTemplateId());

            // 海信导入的数据，userinfo为空
            this.setMerchantId(null == userInfo ? param.getMerchantId() : userInfo.getBindingMid());
            this.setCommodityDetails(param.getCommodityDetails());
            this.setBrandMid(param.getBrandMid());
            this.setBrandName(param.getBrandName());
            this.setAccountType(null == userInfo ? null : userInfo.getIdentity());

            // 对应商品所属店铺MongoIds
            setShopMids(param.getCommoditySpeceParams(), this);

            // 判断商品是“修改库存”，还是“编辑商品信息”，涉及到mcmc中商品总表是否更新commodityIds
            this.setUpdateType(param.getType());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("参数错误");
        }
    }

    private void setFilialeMids(List<CommoditySpecParam> commoditySpecParams, TotalCommodityVO totalCommodityVO) {
        if(CollectionUtils.isNotEmpty(commoditySpecParams)){
            Set<String> set = new HashSet<>();

            for(CommoditySpecParam commoditySpecParam : commoditySpecParams){
                if(StringUtil.isMongoId(commoditySpecParam.getFilialeMid())) {
                    set.add(commoditySpecParam.getFilialeMid());
                }
            }
            totalCommodityVO.setFilialeMids(new ArrayList<>(set));
        }
    }

    private void setShopMids(List<CommoditySpecParam> commoditySpecParams, TotalCommodityVO totalCommodityVO) {
        if(CollectionUtils.isNotEmpty(commoditySpecParams)){
            Set<String> set = new HashSet<>();

            for(CommoditySpecParam commoditySpecParam : commoditySpecParams){
                if(StringUtil.isMongoId(commoditySpecParam.getShopMid())) {
                    set.add(commoditySpecParam.getShopMid());
                }
            }
            totalCommodityVO.setShopMids(new ArrayList<>(set));
        }
    }
}
