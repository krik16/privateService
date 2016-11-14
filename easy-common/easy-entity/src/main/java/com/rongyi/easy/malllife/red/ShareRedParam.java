package com.rongyi.easy.malllife.red;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/5/6    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class ShareRedParam extends MalllifeBaseParam {

    /**订单号***/
    private String orderCode;
    /**订单类型***/
    private int orderType;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

	@Override
	public String toString() {
		return "ShareRedParam [orderCode=" + orderCode + ", orderType="
				+ orderType + "]";
	}
}
