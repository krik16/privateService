package com.rongyi.easy.bdata.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WUH on 2017/5/2.
 * 区域类型枚举
 */
public enum ZonesTypeEnum {
    TYPE_PROVINCE("Province"),
    TYPE_CITY("City"),
    TYPE_DISTRICT("District"),
    TYPE_BUSINESS_DISTRICT("BusinessDistrict"),
    TYPE_MALL("Mall"),
    TYPE_MALL_AREA("MallArea");

    ZonesTypeEnum(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public static List<String> getZoneNameList(){
        ZonesTypeEnum[] zoneTypes = ZonesTypeEnum.values();
        List<String> zoneList = new ArrayList<>();
        for(ZonesTypeEnum zoneType: zoneTypes){
            zoneList.add(zoneType.getName());
        }
        return zoneList;
    }
}
