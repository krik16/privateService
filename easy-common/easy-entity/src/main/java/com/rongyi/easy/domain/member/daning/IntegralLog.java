package com.rongyi.easy.domain.member.daning;

import java.util.Date;

public class IntegralLog {
    /**  */
    private Integer id;

    /** 修改后的value */
    private String value;

    /** 用户id */
    private Integer integralId;

    /** 备注 */
    private String memo;

    /**  */
    private Date createAt;

    /** 操作业务 */
    private Integer operateBiz;

    /** 会员id */
    private Integer memberId;

    /** 会员名 */
    private String memberName;

    /**
     * 
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 修改后的value
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * 修改后的value
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 用户id
     * @return integralId
     */
    public Integer getIntegralId() {
        return integralId;
    }

    /**
     * 用户id
     * @param integralId
     */
    public void setIntegralId(Integer integralId) {
        this.integralId = integralId;
    }

    /**
     * 备注
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 备注
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 操作业务
     * @return operateBiz
     */
    public Integer getOperateBiz() {
        return operateBiz;
    }

    /**
     * 操作业务
     * @param operateBiz
     */
    public void setOperateBiz(Integer operateBiz) {
        this.operateBiz = operateBiz;
    }

    /**
     * 会员id
     * @return memberId
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 会员id
     * @param memberId
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 会员名
     * @return memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 会员名
     * @param memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}