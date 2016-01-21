package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

public class UserShopEntity implements Serializable{
	
	 /**  */
    private Long id;

    /** 品牌ID */
    private Long brandId;

    /** 商场ID */
    private Long mallId;

    /** 店铺ID */
    private Long shopId;

    /** 状态：0删除，1正常 */
    private Integer status;

    /** 创建时间 */
    private Date createAt;

    /** 用户ID */
    private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Long getMallId() {
		return mallId;
	}

	public void setMallId(Long mallId) {
		this.mallId = mallId;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
    
}
