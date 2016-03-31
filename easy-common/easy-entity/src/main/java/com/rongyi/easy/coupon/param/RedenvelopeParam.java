package com.rongyi.easy.coupon.param;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.rongyi.easy.coupon.entity.Coupon;
import com.rongyi.easy.coupon.entity.CouponBrand;
import com.rongyi.easy.coupon.entity.CouponCategory;
import com.rongyi.easy.coupon.entity.CouponCommodity;
import com.rongyi.easy.coupon.entity.CouponCommodityCategory;
import com.rongyi.easy.coupon.entity.CouponMall;
import com.rongyi.easy.coupon.entity.CouponShop;
import com.rongyi.easy.coupon.entity.CouponVoucher;
import com.rongyi.easy.coupon.vo.operation.VoucherCouponVO;

/**
 * 红包参数
 */
@SuppressWarnings("serial")
public class RedenvelopeParam implements Serializable {
	private static final long serialVersionUID = 7422873726669964441L;
	private static final String ORDER_BY_CLAUSE = "create_at DESC";
	private String orderByClause = ORDER_BY_CLAUSE;
	private String id;// 促销券id
	private List<String> ids;// 促销券ids
	private String name;// 促销券名称/商场名称/券码领用人名称
	private Integer type;// 促销券类型(0:注册，1：常规)/商场对应商圈类型(0:省id,1:市.区.商圈id)
	private Integer status;// 促销券状态(0:待审核，1:审核未通过，2:待发布，3:进行中，4:已结束，5:已下架)/券码状态(0:未使用、1:已使用、2:已过期)
	private Integer applyGoods;// 促销券适用范围1(0：商品/代金券，1：商品，2：代金券)
	private Integer relatedType;// 促销券适用范围2(0：全场，1：品牌，2：商场，3：店铺、4：分类，5：信息)/代金券关联类型
	private Integer applyObject;// 促销券适用对象(0:商家/买手,1:商家,2:买手)
	private Integer preferentialType;// 促销券适用规则(0：满减,1:立减)
	private Date publishStartAt;// 促销券发布开始时间(精确到分)
	private Integer discount;// 促销券金额
	private Date publishEndAt;// 促销券发布结束时间(精确到分)
	private Date validStartAt;// 促销券有效期开始时间
	private Date validEndAt;// 促销券有效期结束时间
	private Integer validDays;// 促销券有效期天数
	private String limitDesc;// 促销券促销规则(使用限制)
	private String remark;// 促销券促销券备注
	private String usageDesc;// 促销券促销券说明
	private String synTarget;// 促销券同步终端(容易逛,互动屏,微信 “1,1,1”表示三个都选中“0,0,0”表示都没选中)
	private Integer count;// 促销券追加数量50000以内
	private Integer origPrice;// 促销券规则(满多少减多少,满的价格)
	private Integer totalCount;// 促销券发行量/分页记录总数
	private List<String> couponIds;// 促销券id集合(下架/批量下架/通过/批量通过)
	private String reason;// 促销券下架/审核未通过原因
	private String relatedTypeId;// 集团id/平牌id/商场id/店铺id
	private String lv1Id;// 代金券分类一级id
	private String lv2Id;//二级分类id
	private String brandId;// 品牌id
	private String cateId;//品牌分类id
	private String brandCname;// 品牌中文名称
	private String brandEname;// 品牌英文名称
	private String mallId;// 商场Id
	private List<String> mallIds;// 商场Id
	private String flag;//有效期类型 0:时间控件,1：天
	private String zoneId;// 商圈
	private String zoneType;//商圈对应类型
	private Integer currentPage;// 当前页数
	private Integer pageSize;// 分页数量
	private String commodityId;// 商品id/商品分类id
	private String commodityName;// 商品名称
	private String shopId;// 店铺id
	private String shopName;// 店铺名称
	private String code;// 券码
	private String orderNo;// 订单号
	private String userPhone;// 券码领用账号
	private Integer receiveChannel;// 券码领用渠道(0:容易逛,1:互动屏,2:微信)
	private Date receiveTime;// 券码领取时间
	private List<CouponBrand> listCouponBrand;// 关联品牌
	private List<String> brandIds;// 品牌id
	private List<CouponMall> listCouponMall;// 关联商场
	private List<CouponShop> listCouponShop;// 关联店铺
	private List<VoucherCouponVO> listVoucherCouponVO;// 关联代金券
	private List<CouponVoucher> listCouponVouchers;// 关联代金券
	private List<CouponCategory> listCouponCategory;//关联卡券分类
	private List<CouponCommodity> listCouponCommodity;// 关联商品
	private List<CouponCommodityCategory> couponCommodityCategories;//商品分类
	private boolean isRelatedAll;//是否关联品牌、或商场下所有店铺 0否 1是
	private Integer offset;
	private String unpassReasons;
	private Integer publishChannel;
	private Integer dateType;//时间类型：发布开始时间[0] 发布结束时间[1] 有效期开始时间[2] 有效期结束时间[3]
	private Date startDate;//时间范围的开始和结束时间
	private Date endDate;//时间范围的开始和结束时间
//	public static void main(String[] args) {
//		SimpleDateFormat sFormat = new SimpleDateFormat("");
//	}
	private Integer couponType;//卡券类型: 代金券[0],抵扣券[1], 红包[2]
    private String displayRegion;//展示区域：常规区域,活动区域;未选中[0]，选中[1] 例如 "1,1"表示都选中
	public Integer getPublishChannel() {
		return publishChannel;
	}

	public void setPublishChannel(Integer publishChannel) {
		this.publishChannel = publishChannel;
	}

	public String getUnpassReasons() {
		return unpassReasons;
	}

	public void setUnpassReasons(String unpassReasons) {
		this.unpassReasons = unpassReasons;
	}

	public Integer getOffset() {
		offset = (this.currentPage -1) * this.pageSize;
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	
	public Integer getCouponType() {
		return couponType;
	}

	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
	}

	public String getLv2Id() {
		return lv2Id;
	}

	public void setLv2Id(String lv2Id) {
		this.lv2Id = lv2Id;
	}
	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public Integer getDateType() {
		return dateType;
	}

	public void setDateType(Integer dateType) {
		this.dateType = dateType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public void setid(String id) {
		this.id =StringUtils.isNotBlank(id)?id.trim():null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = StringUtils.isNotBlank(name)?name.trim():null;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getFlag() {
		return flag;
	}
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public String getCateId() {
		return cateId;
	}

	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getApplyGoods() {
		return applyGoods;
	}

	public void setApplyGoods(Integer applyGoods) {
		this.applyGoods = applyGoods;
	}

	public Integer getRelatedType() {
		return relatedType;
	}

	public void setRelatedType(Integer relatedType) {
		this.relatedType = relatedType;
	}

	public Integer getApplyObject() {
		return applyObject;
	}

	public void setApplyObject(Integer applyObject) {
		this.applyObject = applyObject;
	}

	public Integer getPreferentialType() {
		return preferentialType;
	}

	public void setPreferentialType(Integer preferentialType) {
		this.preferentialType = preferentialType;
	}

	public Date getPublishStartAt() {
		return publishStartAt;
	}

	public void setPublishStartAt(Date publishStartAt) {
		this.publishStartAt = publishStartAt;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Date getPublishEndAt() {
		return publishEndAt;
	}

	public void setPublishEndAt(Date publishEndAt) {
		this.publishEndAt = publishEndAt;
	}

	public Date getValidStartAt() {
		return validStartAt;
	}

	public void setValidStartAt(Date validStartAt) {
		this.validStartAt = validStartAt;
	}

	public Date getValidEndAt() {
		return validEndAt;
	}

	public void setValidEndAt(Date validEndAt) {
		this.validEndAt = validEndAt;
	}

	public Integer getValidDays() {
		return validDays;
	}

	public void setValidDays(Integer validDays) {
		this.validDays = validDays;
	}

	public String getLimitDesc() {
		return limitDesc;
	}

	public void setLimitDesc(String limitDesc) {
		this.limitDesc = limitDesc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUsageDesc() {
		return usageDesc;
	}

	public void setUsageDesc(String usageDesc) {
		this.usageDesc = usageDesc;
	}

	public String getSynTarget() {
		return synTarget;
	}

	public void setSynTarget(String synTarget) {
		this.synTarget = synTarget;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getOrigPrice() {
		return origPrice;
	}

	public void setOrigPrice(Integer origPrice) {
		this.origPrice = origPrice;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<String> getCouponIds() {
		return couponIds;
	}

	public void setCouponIds(List<String> couponIds) {
		this.couponIds = couponIds;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRelatedTypeId() {
		return relatedTypeId;
	}

	public void setRelatedTypeId(String relatedTypeId) {
		this.relatedTypeId = StringUtils.isNotBlank(relatedTypeId)?relatedTypeId.trim() : null;
	}

	public String getLv1Id() {
		return lv1Id;
	}

	public void setLv1Id(String lv1Id) {
		this.lv1Id = lv1Id;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandCname() {
		return brandCname;
	}

	public void setBrandCname(String brandCname) {
		this.brandCname = brandCname;
	}

	public String getBrandEname() {
		return brandEname;
	}

	public void setBrandEname(String brandEname) {
		this.brandEname = brandEname;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
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
		this.shopId = StringUtils.isNotBlank(shopId)?shopId.trim():null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getReceiveChannel() {
		return receiveChannel; 
	}

	public void setReceiveChannel(Integer receiveChannel) {
		this.receiveChannel = receiveChannel;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public List<CouponBrand> getListCouponBrand() {
		return listCouponBrand;
	}

	public void setListCouponBrand(List<CouponBrand> listCouponBrand) {
		this.listCouponBrand = listCouponBrand;
	}

	public List<CouponCategory> getListCouponCategory() {
		return listCouponCategory;
	}

	public void setListCouponCategory(List<CouponCategory> listCouponCategory) {
		this.listCouponCategory = listCouponCategory;
	}

	public List<CouponMall> getListCouponMall() {
		return listCouponMall;
	}

	public void setListCouponMall(List<CouponMall> listCouponMall) {
		this.listCouponMall = listCouponMall;
	}

	public List<CouponShop> getListCouponShop() {
		return listCouponShop;
	}

	public void setListCouponShop(List<CouponShop> listCouponShop) {
		this.listCouponShop = listCouponShop;
	}

	public List<VoucherCouponVO> getlListVoucherCouponVO() {
		return listVoucherCouponVO;
	}

	public void setListVoucherCouponVO(List<VoucherCouponVO> listVoucherCouponVO) {
		this.listVoucherCouponVO = listVoucherCouponVO;
	}

	public List<CouponCommodity> getListCouponCommodity() {
		return listCouponCommodity;
	}

	public void setListCouponCommodity(List<CouponCommodity> listCouponCommodity) {
		this.listCouponCommodity = listCouponCommodity;
	}
	public List<String> getMallIds() {
		return mallIds;
	}

	public void setMallIds(List<String> mallIds) {
		this.mallIds = mallIds;
	}
	public List<String> getBrandIds() {
		return brandIds;
	}

	public void setBrandIds(List<String> brandIds) {
		this.brandIds = brandIds;
	}

	public List<CouponCommodityCategory> getCouponCommodityCategories() {
		return couponCommodityCategories;
	}
	public List<CouponVoucher> getListCouponVouchers() {
		return listCouponVouchers;
	}

	public void setListCouponVouchers(List<CouponVoucher> listCouponVouchers) {
		this.listCouponVouchers = listCouponVouchers;
	}

	public void setCouponCommodityCategories(
			List<CouponCommodityCategory> couponCommodityCategories) {
		this.couponCommodityCategories = couponCommodityCategories;
	}
	public boolean getIsRelatedAll() {
		return isRelatedAll;
	}

	public void setIsRelatedAll(boolean isRelatedAll) {
		this.isRelatedAll = isRelatedAll;
	}
	public String getZoneType() {
		return zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = StringUtils.isNotBlank(shopName)?shopName.trim():null;
	}
	@Override
	public String toString() {
		return "RedenvelopeParam [id=" + id + ", ids=" + ids + ", name=" + name
				+ ", type=" + type + ", status=" + status + ", applyGoods="
				+ applyGoods + ", relatedType=" + relatedType
				+ ", applyObject=" + applyObject + ", preferentialType="
				+ preferentialType + ", publishStartAt=" + publishStartAt
				+ ", discount=" + discount + ", publishEndAt=" + publishEndAt
				+ ", validStartAt=" + validStartAt + ", validEndAt="
				+ validEndAt + ", validDays=" + validDays + ", limitDesc="
				+ limitDesc + ", remark=" + remark + ", usageDesc=" + usageDesc
				+ ", synTarget=" + synTarget + ", count=" + count
				+ ", origPrice=" + origPrice + ", totalCount=" + totalCount
				+ ", couponIds=" + couponIds + ", reason=" + reason
				+ ", relatedTypeId=" + relatedTypeId + ", lv1Id=" + lv1Id + ", lv2Id="
				+ lv2Id + ", brandId=" + brandId + ", cateId=" + cateId
				+ ", brandCname=" + brandCname + ", brandEname=" + brandEname
				+ ", mallId=" + mallId + ", mallIds=" + mallIds + ", flag="
				+ flag + ", zoneId=" + zoneId + ", zoneType=" + zoneType
				+ ", currentPage=" + currentPage + ", pageSize=" + pageSize
				+ ", commodityId=" + commodityId + ", commodityName="
				+ commodityName + ", shopId=" + shopId + ", code=" + code
				+ ", orderNo=" + orderNo + ", userPhone=" + userPhone
				+ ", receiveChannel=" + receiveChannel + ", receiveTime="
				+ receiveTime + ", listCouponBrand=" + listCouponBrand
				+ ", brandIds=" + brandIds + ", listCouponMall="
				+ listCouponMall + ", listCouponShop=" + listCouponShop
				+ ", listVoucherCouponVO=" + listVoucherCouponVO
				+ ", listCouponCategory=" + listCouponCategory
				+ ", listCouponCommodity=" + listCouponCommodity
				+ ", couponCommodityCategories=" + couponCommodityCategories
				+ ", isRelatedAll=" + isRelatedAll + ", orderByClause="
				+ orderByClause + ", offset=" + offset + ", unpassReasons="
				+ unpassReasons + ", publishChannel=" + publishChannel
				+ ", dateType=" + dateType + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", couponType=" + couponType
				+ ", displayRegion=" + displayRegion + "]";
	}
}
