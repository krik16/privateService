package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: IndustryVersionParam 
 * @Description: 
 * @author Kenny
 * @date 2016年10月24日 下午6:26:28 
 *  
 */
public class IndustryVersionParam implements Serializable {
	private static final long serialVersionUID = 2905367200197306832L;
	
	private Integer id;
	
	private String name;//版本名称
	
	private List<Integer> auths;//权限值

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

	public List<Integer> getAuths() {
		return auths;
	}

	public void setAuths(List<Integer> auths) {
		this.auths = auths;
	}

	@Override
	public String toString() {
		return "IndustryVersionParam [name=" + name + ", auths=" + auths + "]";
	}

}
