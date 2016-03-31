/**
 * 
 */
package com.rongyi.easy.shop.vo;

import com.rongyi.easy.shop.entity.BuildingEntity;


/** 
 * @ClassName: BuildingVO 
 * @Description: TODO
 * @author wzh
 * @date 2015年11月9日 下午7:35:45 
 *  
 */
public class BuildingVO implements Comparable<BuildingVO>{
	
	private String id;
	
	private Integer type;//楼栋类型 0楼1栋2幢3座
	
	private String name;//楼栋名字
	
	private String mallId;//楼栋对应的商场
	
	private int valid;//0正常1隐藏2删除
	
	public BuildingVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BuildingVO(BuildingEntity build) {
		super();
		if(build!=null){
			this.id = build.getId().toString();
			this.type = build.getType();
			this.name = build.getName();
			this.mallId = build.getMall_id().toString();
			this.valid = build.getValid();
		}
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	@Override
	public int compareTo(BuildingVO o) {
		return this.getName().compareTo(o.getName());
	}
	
}
