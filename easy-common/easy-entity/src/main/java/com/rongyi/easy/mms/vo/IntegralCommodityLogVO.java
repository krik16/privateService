package com.rongyi.easy.mms.vo;

import java.io.Serializable;
import java.util.Date;

/**	
 * @Author:  柯军
 * @Description: 积分商品库存日志记录 
 * @datetime:2015年4月29日上午10:24:04
 *
 **/
public class IntegralCommodityLogVO implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = -1202893139754284770L;

    private Integer id;

    /** 创建时间 */
    private Date createAt;

    /** 用户ID */
    private Integer memberId;
    
    /**用户名称   */
    private String memberName;
    /** 积分商品ID*/
    private Integer integralId;
    
    /**积分商品名称   */
    private String title;
    
    /** 库存增加数量  */
    private Integer value;
    
    /**操作动作*/
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
}
