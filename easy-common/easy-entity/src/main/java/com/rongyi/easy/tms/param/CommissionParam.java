package com.rongyi.easy.tms.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenjun
 * @date 2017/2/27 11:03
 */
public class CommissionParam implements Serializable{
    private static final long serialVersionUID = -8905745959599578938L;

    private Integer searchType;//0:客服审核列表，1:财务审核列表
    private Integer status;//不传：全部  1：商家待审核 2：财务待审核（商家审核通过） 3：财务审核通过 -1：商家审核不通过 -2：财务审核不通过
    private String commNo;//返佣流水号
    private String createAtBegin;//账号注册开始时间始（yyyy-mm-dd hh:mm:ss）
    private String createAtEnd;//账号注册开始时间止（yyyy-mm-dd hh:mm:ss）
    private String registerPhone;//注册人账号
    private String registerTimeBegin;//
    private String registerTimeEnd;//
    private String invitePhone;//邀请人账号
    private BigDecimal commissionAmountBegin;//返佣金额始
    private BigDecimal commissionAmountEnd;//返佣金额止
    private Integer guideType;//角色类型：0:全部  1:导购 2:买手
    private Integer registerType;//注册人类型: 0:全部 1:容易逛 2:摩店
    private String orderCreateAtBegin;//订单生成时间止（yyyy-mm-dd hh:mm:ss）
    private String orderCreateAtEnd;//订单生成时间止（yyyy-mm-dd hh:mm:ss）

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCommNo() {
        return commNo;
    }

    public void setCommNo(String commNo) {
        this.commNo = commNo;
    }

    public String getCreateAtBegin() {
        return createAtBegin;
    }

    public void setCreateAtBegin(String createAtBegin) {
        this.createAtBegin = createAtBegin;
    }

    public String getCreateAtEnd() {
        return createAtEnd;
    }

    public void setCreateAtEnd(String createAtEnd) {
        this.createAtEnd = createAtEnd;
    }

    public String getRegisterPhone() {
        return registerPhone;
    }

    public void setRegisterPhone(String registerPhone) {
        this.registerPhone = registerPhone;
    }

    public String getRegisterTimeBegin() {
        return registerTimeBegin;
    }

    public void setRegisterTimeBegin(String registerTimeBegin) {
        this.registerTimeBegin = registerTimeBegin;
    }

    public String getRegisterTimeEnd() {
        return registerTimeEnd;
    }

    public void setRegisterTimeEnd(String registerTimeEnd) {
        this.registerTimeEnd = registerTimeEnd;
    }

    public String getInvitePhone() {
        return invitePhone;
    }

    public void setInvitePhone(String invitePhone) {
        this.invitePhone = invitePhone;
    }

    public BigDecimal getCommissionAmountBegin() {
        return commissionAmountBegin;
    }

    public void setCommissionAmountBegin(BigDecimal commissionAmountBegin) {
        this.commissionAmountBegin = commissionAmountBegin;
    }

    public BigDecimal getCommissionAmountEnd() {
        return commissionAmountEnd;
    }

    public void setCommissionAmountEnd(BigDecimal commissionAmountEnd) {
        this.commissionAmountEnd = commissionAmountEnd;
    }

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public String getOrderCreateAtBegin() {
        return orderCreateAtBegin;
    }

    public void setOrderCreateAtBegin(String orderCreateAtBegin) {
        this.orderCreateAtBegin = orderCreateAtBegin;
    }

    public String getOrderCreateAtEnd() {
        return orderCreateAtEnd;
    }

    public void setOrderCreateAtEnd(String orderCreateAtEnd) {
        this.orderCreateAtEnd = orderCreateAtEnd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    public Map<String,Object> toMap(){
        Map<String,Object> map = new HashMap<>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if(obj!=null){
                    map.put(field.getName(), obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
