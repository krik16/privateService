package com.rongyi.easy.malllife.vo.province_city;

import java.io.Serializable;
import java.util.List;
/**
 * 省份VO
 * @author user
 *
 */
public class ProvinceVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String _type;
	private String name;
	private String parent_id;
	private List<String> parent_ids;
	private String hotDistrict;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String get_type() {
		return _type;
	}
	public void set_type(String _type) {
		this._type = _type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}
	public List<String> getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(List<String> parent_ids) {
		this.parent_ids = parent_ids;
	}
	public String getHotDistrict() {
		return hotDistrict;
	}
	public void setHotDistrict(String hotDistrict) {
		this.hotDistrict = hotDistrict;
	}
	
}
