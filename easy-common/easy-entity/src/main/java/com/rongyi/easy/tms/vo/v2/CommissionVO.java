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
     *邀请人类型(1:导购,2:买手)
     */
    private Integer guideType;

    /**
     * 邀请人id
     */
    private String guideId;

    /**
     * 邀请人手机号
     */
    private String invitePhone;

    /**
     * 注册人类型(1:容易逛,2:摩店)
     */
    private Integer registerType;

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

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    public String getInvitePhone() {
        return invitePhone;
    }

    public void setInvitePhone(String invitePhone) {
        this.invitePhone = invitePhone;
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
                ", guideType=" + guideType +
                ", guideId='" + guideId + '\'' +
                ", invitePhone='" + invitePhone + '\'' +
                ", registerType=" + registerType +
                ", registerPhone='" + registerPhone + '\'' +
                ", createAt='" + createAt + '\'' +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
