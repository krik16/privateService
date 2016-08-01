package com.rongyi.easy.bdata.vo;

/**
 * Desc: bdata mallvo
 * User: chris
 * Date: 2015/10/24 18:19
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

public class BuildingVO implements Serializable {

	private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String mallId;
    public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "BuildingVO [id=" + id + ", name=" + name + ", mallId=" + mallId + ", valid=" + valid + ", type=" + type
				+ "]";
	}
	public void setId(String id) {
		this.id = id;
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
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	private Integer valid;
    private Integer type;

}
