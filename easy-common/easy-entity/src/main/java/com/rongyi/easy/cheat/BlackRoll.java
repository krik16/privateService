package com.rongyi.easy.cheat;

import java.io.Serializable;
import java.util.Date;

public class BlackRoll implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8637684754246223142L;

	private Integer id;

    /**
     * 付款账号
     */
    private String payAccout;

    /**
     * 账号类型(0:支付宝，1：微信)
     */
    private Byte accoutType;

    /**
     * 刷单总数量
     */
    private Integer count;

    /**
     * 状态(0:整除，1：冻结)
     */
    private Byte status;

    /**
     * 活动类型
     */
    private Byte activeType;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayAccout() {
        return payAccout;
    }

    public void setPayAccout(String payAccout) {
        this.payAccout = payAccout;
    }

    public Byte getAccoutType() {
        return accoutType;
    }

    public void setAccoutType(Byte accoutType) {
        this.accoutType = accoutType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getActiveType() {
        return activeType;
    }

    public void setActiveType(Byte activeType) {
        this.activeType = activeType;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}