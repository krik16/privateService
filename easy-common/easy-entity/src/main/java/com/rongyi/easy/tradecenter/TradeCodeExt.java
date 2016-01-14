package com.rongyi.easy.tradecenter;

import java.io.Serializable;
import java.util.Date;

public class TradeCodeExt implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 6690550729071075593L;

	private Integer id;

    private String couponCode;

    private String couponCodeMd5;
    
    private Byte status;
    
    private Date createAt;

    private Date updateAt;
    
    

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponCodeMd5() {
		return couponCodeMd5;
	}

	public void setCouponCodeMd5(String couponCodeMd5) {
		this.couponCodeMd5 = couponCodeMd5;
	}

    
}