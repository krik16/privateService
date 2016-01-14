package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 容易逛首页-明星店铺
 * Created by Breggor on 2015/9/10.
 */
public class StarShopVO implements Serializable {

    private String title;  //标题
    private String provId; //省份Id
    private String cityId;  //城市Id
    private List<ShopVO> shops; //店铺信息在roa处理
    private String shopIds; //店铺Id
    private String publishBeginAt;  //发布开始时间"
    private String publishEndAt; //发布结束时间"

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public List<ShopVO> getShops() {
        return shops;
    }

    public void setShops(List<ShopVO> shops) {
        this.shops = shops;
    }

    public String getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(String publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public String getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(String publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public String getShopIds() {
        return shopIds;
    }

    public void setShopIds(String shopIds) {
        this.shopIds = shopIds;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("title", title)
                .append("provId", provId)
                .append("cityId", cityId)
                .append("shops", shops)
                .append("shopIds", shopIds)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .toString();
    }

    public static class ShopVO implements Serializable {

        private String shopId; //店铺Ids
        private String shopName; //店铺名
        private String logo; //店铺LOGO
        private String notice; //店铺公告
        private String mallName; //所在商场名
        private String address; //地址
        private float[] location; //[float,float]经纬度
        private int rating; //int评分
        private boolean isFav; // boolean是否收藏
        private boolean isRebate; //boolean是否有抵扣券
        private boolean isActiviy; //boolean是否有优惠信息
        private boolean isCoupon; //boolean是否有代金券

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

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public String getMallName() {
            return mallName;
        }

        public void setMallName(String mallName) {
            this.mallName = mallName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public float[] getLocation() {
            return location;
        }

        public void setLocation(float[] location) {
            this.location = location;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public boolean getIsFav() {
            return isFav;
        }

        public void setIsFav(boolean isFav) {
            this.isFav = isFav;
        }

        public boolean getIsRebate() {
            return isRebate;
        }

        public void setIsRebate(boolean isRebate) {
            this.isRebate = isRebate;
        }

        public boolean getIsActiviy() {
            return isActiviy;
        }

        public void setIsActiviy(boolean isActiviy) {
            this.isActiviy = isActiviy;
        }

        public boolean getIsCoupon() {
            return isCoupon;
        }

        public void setIsCoupon(boolean isCoupon) {
            this.isCoupon = isCoupon;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("shopId", shopId)
                    .append("shopName", shopName)
                    .append("logo", logo)
                    .append("notice", notice)
                    .append("mallName", mallName)
                    .append("address", address)
                    .append("location", location)
                    .append("rating", rating)
                    .append("isFav", isFav)
                    .append("isRebate", isRebate)
                    .append("isActiviy", isActiviy)
                    .append("isCoupon", isCoupon)
                    .toString();
        }
    }
}