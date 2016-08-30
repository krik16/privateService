package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.mcmc.vo.CommoditySortVo;
import com.rongyi.easy.rmmm.base.BaseParam;

public class CommodityToTopParam extends BaseParam implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/*private List<String> commodityIds;
	private Integer sort;//0 未置顶  大于0  置顶
	private Integer type;//type 1表示   置顶，type 0 表示取消置顶
	public List<String> getCommodityIds() {
		return commodityIds;
	}
	public void setCommodityIds(List<String> commodityIds) {
		this.commodityIds = commodityIds;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	*/
	private List<CommoditySortVo> commoditySortVos;

	public List<CommoditySortVo> getCommoditySortVos() {
		return commoditySortVos;
	}

	public void setCommoditySortVos(List<CommoditySortVo> commoditySortVos) {
		this.commoditySortVos = commoditySortVos;
	}
}
