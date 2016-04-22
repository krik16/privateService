package com.rongyi.easy.mcmc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 摩店建商品白名单
 * @author ll
 * @date 2016-03-18
 * @package com.rongyi.easy.mcmc.entity
 * @easy-common
 */
public class MshopWhiteList implements Serializable {
	private static final long serialVersionUID = 928030892358687050L;
	
	private Integer id;
	private Integer type;
	private Integer merchantType;
	private String merchantId;
	private String merchantName;
	private Date createAt;
	private Integer status;

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

	public Integer getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(Integer merchantType) {
		this.merchantType = merchantType;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MshopWhiteList{" +
				"id=" + id +
				", type=" + type +
				", merchantType=" + merchantType +
				", merchantId='" + merchantId + '\'' +
				", merchantName='" + merchantName + '\'' +
				", createAt=" + createAt +
				", status=" + status +
				'}';
	}
}
