package com.rongyi.easy.shop.param;

import java.io.Serializable;
import java.util.List;

/**
 * 商家后台店铺管理实体类
 * 
 * @author wzh
 *
 */
public class ExclusiveCategoryParam implements Serializable {

	private static final long serialVersionUID = 5321646214285676988L;

	private List<String> name;// 专属分类名字

	private Integer type;// 0一级分类1二级分类

	private String parentid;// 父类id（插入二级分类才有）

	private String id;

	private String mallId;// 商场id
	
	private List<String> ids;//批量删除的ids集合
	
	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	
	
}
