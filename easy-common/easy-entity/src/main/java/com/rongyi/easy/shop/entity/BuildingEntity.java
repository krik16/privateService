/**
 * 
 */
package com.rongyi.easy.shop.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/** 
 * @ClassName: BuildingEntity 
 * @Description: 楼栋
 * @author wzh
 * @date 2015年11月9日 下午4:55:42 
 *  
 */
@SuppressWarnings("serial")
@Entity(value="building",noClassnameStored=true)
public class BuildingEntity implements Serializable{
	
	@Id
	private ObjectId id;
	
	private Integer type;//楼栋类型 0楼1栋2幢3座
	
	private String name;//楼栋名字
	
	private ObjectId mall_id;//楼栋对应的商场
	
	private int valid;//0正常1隐藏2删除

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectId getMall_id() {
		return mall_id;
	}

	public void setMall_id(ObjectId mall_id) {
		this.mall_id = mall_id;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

}
