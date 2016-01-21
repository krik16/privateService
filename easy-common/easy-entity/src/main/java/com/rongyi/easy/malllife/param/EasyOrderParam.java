package com.rongyi.easy.malllife.param;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/1/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/1/20              1.0            创建文件
 *
 */

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

public class EasyOrderParam extends BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;


    private String orderCode;//令牌Code





    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
}
