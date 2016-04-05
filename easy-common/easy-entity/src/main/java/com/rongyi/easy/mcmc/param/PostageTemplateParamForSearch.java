package com.rongyi.easy.mcmc.param;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.util.Date;


/**
 * 商家后台店铺列表查询参数类
 * 
 * @author wzh
 *
 */
public class PostageTemplateParamForSearch {

	private String mallName;//商城名字

	private Integer currpage;//当前页1表示第一页
	
	private Integer pageSize;//每页大小

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public Integer getCurrpage() {
		return currpage;
	}

	public void setCurrpage(Integer currpage) {
		this.currpage = currpage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
