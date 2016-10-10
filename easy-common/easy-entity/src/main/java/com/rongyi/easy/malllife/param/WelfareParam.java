package com.rongyi.easy.malllife.param;

/*
 * Description:  
 * time:  2016/10/10
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * yuzhijian             2016/10/10              1.0            创建文件
 * Author   yuzhijian@rongyi.com || yuxia2217@163.com
 * Copyright (C),上海容易网电子商务有限公司
 */
public class WelfareParam extends MalllifeBaseParam {

    private int orderStatus;//订单状态 0支付ing，1支付成功，2支付失败

    private String orderNo;//订单号

    private String payNo;//支付账号

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
}
