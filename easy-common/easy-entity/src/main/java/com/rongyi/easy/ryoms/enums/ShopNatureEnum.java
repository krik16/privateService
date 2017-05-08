package com.rongyi.easy.ryoms.enums;

import com.rongyi.core.constant.PropertyDate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WUH on 2017/5/3.
 * 店铺性质枚举类
 */
public enum ShopNatureEnum {

    MALL_SHOP("0", "商场店铺"),
    MALL_COUNTERS("1", "商场专柜"),
    CURBSIDE_SHOP("2", "街边店"),
    SPECIAL_SHOP("3", "特卖店"),
    CHAIN_SHOP("4", "连锁总部");

    private String code;

    private String name;

    private static Map<String, ShopNatureEnum> map = new HashMap<>();
    ShopNatureEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ShopNatureEnum{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public static ShopNatureEnum getShopNatureByCode(String code){
        if(map.size() == 0){
            for(ShopNatureEnum shopNature: ShopNatureEnum.values()){
                map.put(shopNature.getCode(), shopNature);
            }
        }
        ShopNatureEnum shopNature = map.get(code);
        if(shopNature == null){
            throw new NullPointerException("未找到正确的枚举类");
        }
        return shopNature;
    }

    public static PropertyDate[] getKeyValueMap(){
        ShopNatureEnum[] shopNatureEnums = ShopNatureEnum.values();
        PropertyDate[] propertyDates = new PropertyDate[shopNatureEnums.length];
        for(int i = 0; i < shopNatureEnums.length; i++){
            propertyDates[i] = new PropertyDate(shopNatureEnums[i].getCode(), shopNatureEnums[i].getName());
        }
        return propertyDates;
    }

}
