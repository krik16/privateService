package com.rongyi.easy.mcmc;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 建议店铺
 * @author xiaobo
 *
 */
@Entity("mcmc_advise_shop")
public class AdviseShop  implements  Serializable{	
	private static final long serialVersionUID = 1L;
	/**
	 * mongo id
	 */
	@Id
	private ObjectId id;
	/**
	 * 建议人
	 */
	private String createBy;
	/**
	 * 商场名称
	 */
	private String mallName;
	/**
	 * 店铺名称
	 */
	private String shopName;
	/**
	 * 创建时间
	 */
	private Date createAt;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	

}
