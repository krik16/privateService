package com.rongyi.easy.bdata.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 区域实体
 * @author sj
 *
 */
public class BdArea implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer areaId;            //省市区商圈Id
	private Integer parentId;          //上级省市区商圈Id
	private String areaMid;            //对应的mongoId
	private Integer type;              //类型 （0:国、1:省、2:市、3:区、4:商圈）
	private Integer flag;              //标志：0非热门 1热门
	private String cnname;             //中文名称
	private String enname;             //英文名称
	private String name;               //拼音名称
	private String shortName;          //简称
	private Integer status;            //状态 1正常 0删除
	private Date createAt;           
	private Integer createBy;
	private Date updateAt;
	private Integer updateBy;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getAreaMid() {
		return areaMid;
	}
	public void setAreaMid(String areaMid) {
		this.areaMid = areaMid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getCnname() {
		return cnname;
	}
	public void setCnname(String cnname) {
		this.cnname = cnname;
	}
	public String getEnname() {
		return enname;
	}
	public void setEnname(String enname) {
		this.enname = enname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
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
	public Integer getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}
}
