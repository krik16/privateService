package com.rongyi.easy.ryoms.merchant.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 大运营后台行业列表
 * @ClassName: IndustrySearchVO 
 * @Description: 
 * @author Kenny
 * @date 2016年10月24日 下午2:56:45 
 *
 */
public class IndustrySearchVO implements Serializable {
	private static final long serialVersionUID = -7156451010782638774L;
	
	private Integer id;
	private String name;
	private String createBy;
	private Date createAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
}
