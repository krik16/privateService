package com.rongyi.easy.coupon.param;

import java.io.Serializable;
import java.util.Date;

/**
 * 红包参数
 */
public class RedenvelopeParam implements Serializable {

    /**
     * 序列号
     */
    private static final long serialVersionUID = 112316465456189L;

    /**
     * 这是优惠卷类型   以前优惠卷是02，现金卷是03  现在改为：卡券类型:代金券[0], 抵扣券[1], 红包[2]
     */
    private Integer couponType;
    /**
     * 关联类型 代金券：集团[0], 品牌[1], 商场[2],店铺[3];  红包 ：全场[0],商品[1]     以前的type 对应现在的related_type
     */
    private Integer relatedType;
    /**
     * 商品的Id
     */
    private String productId;
    /**
     * 关联商场的id
     */
    private String mallId;
    /**
     * 关联商场的名字
     */
    private String mallName;
    /**
     * 关联店铺的id
     */
    private String shopId;
    /**
     * 关联店铺的名字
     */
    private String shopName;
    /**
     * 发布渠道  ：卡券发布渠道：大运营平台[0], 商家管理后台[1]  sorceTarget 现在对应 publish_channel   以前的渠道有信息渠道 0：大运营管理平台 1：百货管理平台 2:摩店管理平台 3：摩店App   现在对应关系 除了百货管理平台对应商家关联渠道外 其他都对应 大运营平台
     */
    private Integer publish_channel;
    /**
     * 卷的名字      title对应name
     */
    private String name;
    /**
     * 红包关联的商品的商场id
     */
    private String productMallId;
    /**
     * 红包关联的商品的店铺id
     */
    private String productShopId;
    /**
     * 红包关联的商品的商场名称
     */
    private String productMallName;
    /**
     * 红包关联的商品的店铺名称
     */
    private String productShopName;
    /**
     * 这个是关联活动的    1表示关联翻牌购   2表示关联推送  0表示没有关联
     */
    private Integer activtiyStatus;
    /**
     * 要排序的字段名字
     */
    private String orderByColumName;
    /**
     * 字段名是按照什么排序 ：1降序，0升序
     */
    private Integer orderAscORDesc;
    /**
     * 审核状态: 待审核[0], 审核未通过[1], 审核通过[2]   以前的checkStatus 对应现在的status
     */
    private Integer status;
    /**
     * 是否删除：true表示删除 false表示没有删除
     */
    private Boolean isDeleted;
    /**
     * 发布日期是否《=这个日期
     */
    private Date publishStartDate;
    /**
     * 发布结束日期》=这个日期
     */
    private Date publicEndDate;
    /**
     * 当前卷的价格
     */
    private Double currentPrice;
    /**
     * 这个是以前的状态状态(审核中[0]、已上线[1]、已使用[2]、已过期[3]、已下线[4]  以前传入的是0，1 对应以前的status  现在  1代表未使用 ，未过期，为下架
     */
    public Integer noStatus;
    /**
     * 这个是库存  0代表库存==0  1代表库存要大于0 2代表库存大于等于0
     */
    private Integer stockCount;
    /**
     * 当前页数
     */
    private int curpage = 1;
    /**
     * 每页显示的数量
     */
    private int pagesize = 10;


    public RedenvelopeParam() {

    }


    public Integer getCouponType() {
        return couponType;
    }


    public Boolean getIsDeleted() {
        return isDeleted;
    }


    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    public Integer getStockCount() {
        return stockCount;
    }


    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }


    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }


    public Integer getRelatedType() {
        return relatedType;
    }


    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }


    public String getProductId() {
        return productId;
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getMallId() {
        return mallId;
    }


    public void setMallId(String mallId) {
        this.mallId = mallId;
    }


    public String getMallName() {
        return mallName;
    }


    public void setMallName(String mallName) {
        this.mallName = mallName;
    }


    public String getShopId() {
        return shopId;
    }


    public void setShopId(String shopId) {
        this.shopId = shopId;
    }


    public String getShopName() {
        return shopName;
    }


    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    public Integer getPublish_channel() {
        return publish_channel;
    }


    public void setPublish_channel(Integer publish_channel) {
        this.publish_channel = publish_channel;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Integer getActivtiyStatus() {
        return activtiyStatus;
    }

    public void setActivtiyStatus(Integer activtiyStatus) {
        this.activtiyStatus = activtiyStatus;
    }

    public String getOrderByColumName() {
        return orderByColumName;
    }

    public void setOrderByColumName(String orderByColumName) {
        this.orderByColumName = orderByColumName;
    }

    public Integer getOrderAscORDesc() {
        return orderAscORDesc;
    }

    public void setOrderAscORDesc(Integer orderAscORDesc) {
        this.orderAscORDesc = orderAscORDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPublishStartDate() {
        return publishStartDate;
    }

    public void setPublishStartDate(Date publishStartDate) {
        this.publishStartDate = publishStartDate;
    }

    public Date getPublicEndDate() {
        return publicEndDate;
    }

    public void setPublicEndDate(Date publicEndDate) {
        this.publicEndDate = publicEndDate;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getCurpage() {
        return curpage;
    }

    public void setCurpage(int curpage) {
        this.curpage = curpage;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getProductMallId() {
        return productMallId;
    }

    public void setProductMallId(String productMallId) {
        this.productMallId = productMallId;
    }

    public String getProductShopId() {
        return productShopId;
    }

    public void setProductShopId(String productShopId) {
        this.productShopId = productShopId;
    }

    public String getProductMallName() {
        return productMallName;
    }

    public void setProductMallName(String productMallName) {
        this.productMallName = productMallName;
    }


    public String getProductShopName() {
        return productShopName;
    }


    public void setProductShopName(String productShopName) {
        this.productShopName = productShopName;
    }


    public Integer getNoStatus() {
        return noStatus;
    }


    public void setNoStatus(Integer noStatus) {
        this.noStatus = noStatus;
    }

}
