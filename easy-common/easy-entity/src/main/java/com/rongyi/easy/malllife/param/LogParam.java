package com.rongyi.easy.malllife.param;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/11/30
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/11/30              1.0            创建文件
 *
 */

import java.io.Serializable;

public class LogParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private  String pageNum;//页面数

    private String proSpecId;//商品类目Id

    private String userId;//操作人的Id
    private String mallId;//
    private String shopId;//
    private String brandId;//
    private String commodityId;//
    private String commodityType;//商品发布类型 （4店长、5导购，买手6）
    private String commodityPrice;//商品价格
    private String spcParam;// 类目参数
    private String skuNum;//sku商品数
    private String orderId;// 订单ID
    private String couponId;//
    private String couponSpec;//
    private String cBrandId;//品牌Id
    private String orderPay;//
    private String searchKey;//搜索关键字
    private String st;//搜索类型 （searchtype）1找店，2商品，3优惠
    private String oId;//参数Id



    //摩店使用
    private  String page;//[页面]
    private  String  forum;//[版块]
    private  String position;//[位置]
    private  String content;//[内容]
    private  String clickNum;//[点击量]
    private  String type;//[展示、点击、debug类型等]
    private  String timeStamp;//点击时间戳
    private  String channel;//分享渠道
    private String opRole;// 操作角色
    private String opType;//操作功能类型 createShopCart 创建，操作购物车 orderShopCart 生成购物车订单
    //邀请码分享  H5
    private String openId;
    private String phone;//用户领取时输入的手机号
    private Integer downloadNum;//邀请分享页面容易逛用户点击立即下载的次数
    private Integer browseNumber;//打开邀请分享的浏览次数
    private Integer uniqueVisitorsNum;//打开邀请分享的独立访问数（按openId统计）

    private String articleId;//文章id
    private String articleType;//文章类型 1 潮人攻略

    public Integer getBrowseNumber() {
		return browseNumber;
	}

	public void setBrowseNumber(Integer browseNumber) {
		this.browseNumber = browseNumber;
	}

	public Integer getUniqueVisitorsNum() {
		return uniqueVisitorsNum;
	}

	public void setUniqueVisitorsNum(Integer uniqueVisitorsNum) {
		this.uniqueVisitorsNum = uniqueVisitorsNum;
	}

	public Integer getDownloadNum() {
		return downloadNum;
	}

	public void setDownloadNum(Integer downloadNum) {
		this.downloadNum = downloadNum;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getProSpecId() {
        return proSpecId;
    }

    public void setProSpecId(String proSpecId) {
        this.proSpecId = proSpecId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getSpcParam() {
        return spcParam;
    }

    public void setSpcParam(String spcParam) {
        this.spcParam = spcParam;
    }

    public String getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(String skuNum) {
        this.skuNum = skuNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponSpec() {
        return couponSpec;
    }

    public void setCouponSpec(String couponSpec) {
        this.couponSpec = couponSpec;
    }


    public String getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(String orderPay) {
        this.orderPay = orderPay;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getcBrandId() {
        return cBrandId;
    }

    public void setcBrandId(String cBrandId) {
        this.cBrandId = cBrandId;
    }


    //


    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClickNum() {
        return clickNum;
    }

    public void setClickNum(String clickNum) {
        this.clickNum = clickNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOpRole() {
        return opRole;
    }

    public void setOpRole(String opRole) {
        this.opRole = opRole;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }
}
