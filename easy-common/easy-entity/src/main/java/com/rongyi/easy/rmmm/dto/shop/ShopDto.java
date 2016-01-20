package com.rongyi.easy.rmmm.dto.shop;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/4/30
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/4/30              1.0            创建文件
 *
 */
public class ShopDto implements Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String shopMid;  //商店MongId
    private Integer shopId;  //商店Id.

    public String shopLogo;   //店铺Logo
    public String id;    //店铺Id
    public String name; //店铺名称
    public String keyTag; //标签
    public String category;//品类





    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }


    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
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

    public String getKeyTag() {
        return keyTag;
    }

    public void setKeyTag(String keyTag) {
        this.keyTag = keyTag;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
