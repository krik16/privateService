package com.rongyi.easy.rmmm.vo.shop;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  店铺相关参数 Vo
 * time:  2015/4/30
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/4/30              1.0            创建文件
 *
 */
public class ShopVo implements Serializable{

    private  String idStr; //ID 参数

    private  Integer idType; //传递类型

    private String mallId;//商场Id


    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }
}
