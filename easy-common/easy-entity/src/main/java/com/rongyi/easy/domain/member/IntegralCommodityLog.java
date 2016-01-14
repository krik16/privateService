package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 积分商品操作日志表 
 * @datetime:2015年4月29日上午10:24:04
 *
 **/
public class IntegralCommodityLog implements Serializable{
    

    /**
     * 
     */
    private static final long serialVersionUID = -8647538326310709598L;

    private Integer id;

    /** 创建时间 */
    private Date createAt;

    /** 用户ID */
    private Integer memberId;
    
    /**用户名称   */
    private String memberName;
    /** 积分商品ID*/
    private Integer integralId;
    
    /** 库存增加数量  */
    private Integer value;
    
    /**操作动作*/
    private Integer operateBiz; 
    
    /**操作描述*/
    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Integer getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Integer integralId) {
        this.integralId = integralId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getOperateBiz() {
        return operateBiz;
    }

    public void setOperateBiz(Integer operateBiz) {
        this.operateBiz = operateBiz;
    }

}
