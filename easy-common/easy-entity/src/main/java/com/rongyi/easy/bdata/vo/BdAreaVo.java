package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

/**
 * 新sql区域表
 * @author user
 *
 */
public class BdAreaVo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer areaId;            //省市区商圈Id
	private Integer parentId;          //上级省市区商圈Id
	private String areaMid;            //对应的mongoId
	private Integer type;              //类型 （0:国、1:省、2:市、3:区、4:商圈）
	private Integer flag;              //标志：0非热门 1热门
	private String cnname;             //中文名称
	private String name;               //拼音名称
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
