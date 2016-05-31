package com.rongyi.easy.malllife.vo;

import java.io.Serializable;
import java.util.List;
/**
 * 潮人攻略列表返回VO
 * @author user
 *
 */
public class HipsterStrategyListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<HipsterStrategyVO> hipsterStrategyList;

	public List<HipsterStrategyVO> getHipsterStrategyList() {
		return hipsterStrategyList;
	}

	public void setHipsterStrategyList(List<HipsterStrategyVO> hipsterStrategyList) {
		this.hipsterStrategyList = hipsterStrategyList;
	}
	
}
