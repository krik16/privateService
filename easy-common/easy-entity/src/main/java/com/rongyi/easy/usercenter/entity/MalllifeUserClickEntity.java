package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

public class MalllifeUserClickEntity implements Serializable{
	
	/** 主键  */
    private Integer id;

    /** 类型 1订单详情进入物流详情 2订单列表进入物流详情 3物流详情进入IM  */
    private Integer type;

    /** 点击次数  */
    private Integer clickTimes;

    /** 创建时间  */
    private Date createAt;

    /** 修改时间  */
    private Date updateAt;

    public MalllifeUserClickEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MalllifeUserClickEntity(Integer type, Integer clickTimes,
			Date createAt, Date updateAt) {
		super();
		this.type = type;
		this.clickTimes = clickTimes;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Integer clickTimes) {
        this.clickTimes = clickTimes;
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

	@Override
	public String toString() {
		return "MalllifeUserClickEntity [id=" + id + ", type=" + type
				+ ", clickTimes=" + clickTimes + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + "]";
	}
}