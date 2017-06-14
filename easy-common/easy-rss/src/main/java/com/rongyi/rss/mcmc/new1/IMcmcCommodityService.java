package com.rongyi.rss.mcmc.new1;

import com.rongyi.easy.mcmc.vo.commodity.new1.CommodityVO;
import com.rongyi.easy.mcmc.vo.commodity.new1.FullCommodityVO;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;

import java.util.List;

public interface IMcmcCommodityService {

	/**
	 * 摩店：发布、编辑商品
	 * @param fullCommodityVO
	 * @return
	 */
	public List<String> create(FullCommodityVO fullCommodityVO);

}
