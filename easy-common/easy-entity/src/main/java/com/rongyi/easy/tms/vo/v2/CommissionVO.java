package com.rongyi.easy.tms.vo.v2;

import java.io.Serializable;
import java.util.Date;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/26 10:26
 * 增加佣金实体类
 **/
public class CommissionVO implements Serializable{

    private static final long serialVersionUID = 3193084614319603893L;
    /**
     * 返佣类型(0:推广返佣,1:首单返佣,2:小票返佣)
     */
    private Integer type;

    /**
     * 注册人类型(1:容易逛,2:摩店)
     */
    private Integer registerType;

    /**
     * 注册人id
     */
    private String registerId;

    /**
     * 注册人手机号
     */
    private String  registerPhone;

    /**
     * 订单创建时间(用户注册完成时间)
     */
    private Date createAt;

    /**
     * 订单号(首单返佣使用)
     */
    private String orderNo;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "CommissionVO{" +
                "type=" + type +
                ", registerType=" + registerType +
                ", registerId='" + registerId + '\'' +
                ", registerPhone='" + registerPhone + '\'' +
                ", createAt=" + createAt +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
