package com.rongyi.easy.ryoms.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WUH on 2017/4/27.
 * 店铺类型枚举
 * 注意：类型实体定义的店铺类型是shop_nature
 */
public enum ShopTypeEnum {
    NORMAL_SHOP("0", "普通店"),
    TAX_FREE("1", "免税店"),
    SHOPPE("2", "专柜"),
    DISCOUNT_SHOP("3", "折扣店"),
    FLAGSHIP_SHOP("4", "旗舰店"),
    FRANCHISEE("5", "加盟店");

    ShopTypeEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static List<String> getShopNameList(){
        ShopTypeEnum[] shopTypes = ShopTypeEnum.values();
        List<String> shopList = new ArrayList<>();
        for(ShopTypeEnum shopType: shopTypes){
            shopList.add(shopType.getName());
        }
        return shopList;
    }

    @Override
    public String toString() {
        return "ShopTypeEnum{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public static ShopTypeEnum getShopTypeByName(String name){
        ShopTypeEnum[] shopTypes = ShopTypeEnum.values();
        for(ShopTypeEnum shopType: shopTypes){
            if(shopType.getName().equals(name)){
                return shopType;
            }
        }
        return null;
    }

    public static ShopTypeEnum getShopTypeByCode(String code){
        ShopTypeEnum[] shopTypes = ShopTypeEnum.values();
        for(ShopTypeEnum shopType: shopTypes){
            if(shopType.getCode().equals(code)){
                return shopType;
            }
        }
        throw new RuntimeException("未找到对应的店铺类型");
    }
}
