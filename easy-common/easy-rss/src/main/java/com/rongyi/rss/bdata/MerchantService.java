package com.rongyi.rss.bdata;

import java.util.List;

import com.rongyi.easy.bdata.vo.MallShopVO;

public interface MerchantService {

	/**
	 * 根据类型和id查询下属商场/店铺列表
	 * @param type  (0) 集团，(1)商场，(4,5)店铺
	 * @param id
	 * @return
	 */
	public List<MallShopVO> getMallShopVO(Integer type,String id);
	
	/**
	 * 根据类型和id查询下属商场/店铺列表
	 * @param type  (0) 集团，(1)商场，(4,5)店铺
	 * @param id
	 * @return
	 */
	public List<String> getMallShopIds(Integer type,String id);
	/**
	 * 根据商场id和店铺id查询子店铺集合
	 * @param type
	 * @param mallId
	 * @param shopId
	 * @return
	 */
	public List<MallShopVO> getSubShopListByMallIdAndShopId(Integer type,String mallId,String shopId);
}
