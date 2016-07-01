package com.rongyi.easy.malllife.vo;

import org.apache.commons.collections.CollectionUtils;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.List;

public class ShopCommodityVO implements Serializable{
    private List<String> shopCommodityPicList;
    private ObjectId shopCommodityId;
    private String shopCommodityOrigPrice;//取得的商品的原价
    private String shopCommodityCurrPrice;//取得的商品的现在价格
    private String shopCommodityName;//取得的商品名字
    private String shopCommodityDetailUrl;//取得的商品详情的链接地址
    private String shopPic;//得到第一个商品图片
    private String mallTip;//商场/街边店标签
    public ShopCommodityVO(){
        
    }
    public ShopCommodityVO(com.rongyi.easy.mcmc.Commodity commodity){
        this.shopCommodityId=commodity.getId();
        this.shopCommodityCurrPrice=commodity.getCurrentPrice();
        this.shopCommodityOrigPrice=commodity.getOriginalPrice();
        this.shopCommodityName=commodity.getName();
        if(CollectionUtils.isNotEmpty(commodity.getPicList())){
        	this.shopCommodityPicList = commodity.getPicList();
        	this.shopPic = commodity.getPicList().get(0);//最后一个url要自己拼接 凭借的时候问下超哥
        }
    }
    
    
    public String getShopPic() {
        return shopPic;
    }
    
    public void setShopPic(String shopPic) {
        this.shopPic = shopPic;
    }
    public List<String> getShopCommodityPicList() {
        return shopCommodityPicList;
    }
    
    public void setShopCommodityPicList(List<String> shopCommodityPicList) {
        this.shopCommodityPicList = shopCommodityPicList;
    }
    
    public ObjectId getShopCommodityId() {
        return shopCommodityId;
    }
    
    public void setShopCommodityId(ObjectId shopCommodityId) {
        this.shopCommodityId = shopCommodityId;
    }
    
    public String getShopCommodityOrigPrice() {
        return shopCommodityOrigPrice;
    }
    
    public void setShopCommodityOrigPrice(String shopCommodityOrigPrice) {
        this.shopCommodityOrigPrice = shopCommodityOrigPrice;
    }
    
    public String getShopCommodityCurrPrice() {
        return shopCommodityCurrPrice;
    }
    
    public void setShopCommodityCurrPrice(String shopCommodityCurrPrice) {
        this.shopCommodityCurrPrice = shopCommodityCurrPrice;
    }
    
    public String getShopCommodityName() {
        return shopCommodityName;
    }
    
    public void setShopCommodityName(String shopCommodityName) {
        this.shopCommodityName = shopCommodityName;
    }
    
    public String getShopCommodityDetailUrl() {
        return shopCommodityDetailUrl;
    }
    
    public void setShopCommodityDetailUrl(String shopCommodityDetailUrl) {
        this.shopCommodityDetailUrl = shopCommodityDetailUrl;
    }
    
}
