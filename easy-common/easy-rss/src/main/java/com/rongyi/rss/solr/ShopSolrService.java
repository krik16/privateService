/** 
* @Title: ShopSolrService.java 
* @Package com.rongyi.rss.solr 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年8月17日 上午11:45:38 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.solr;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.constant.EPOITipType;
import com.rongyi.easy.mcmc.constant.EPOIType;
import com.rongyi.easy.solr.PoiDocument;
import com.rongyi.easy.solr.ShopDocument;
import com.rongyi.easy.solr.param.ShopSearchParam;
import com.rongyi.easy.solr.result.ShopSearchIdsResult;
import com.rongyi.easy.solr.result.ShopSearchResult;

import java.util.List;

/**
 * @author ZhengYl
 *
 */
public interface ShopSolrService {
	
	/**
	 * C端店铺商场搜索主入口
	 * 
	 * @author ZhengYl
	 * @date 2015年10月17日 下午2:37:10 
	 * @param input
	 * @return
	 */
	public ShopSearchResult poiSearch(ShopSearchParam input);

	/**
	 * poi更新
	 * 
	 * @author ZhengYl
	 * @date 2015年10月17日 下午2:37:12 
	 * @param id
	 * @param mid
	 * @param status
	 * @return
	 */
	public boolean updatePoiStatus(String id, String mid, int status);
	
	/**
	 * B端店铺关键词检索
	 * 
	 * @author ZhengYl
	 * @date 2015年10月17日 下午2:37:15 
	 * @param input
	 * @return
	 */
	public ShopSearchIdsResult selectShopIndexByName(ShopSearchParam input);
	
	/**
	 * 店铺管理后台更新poi索引
	 * 
	 * @author ZhengYl
	 * @date 2015年10月27日 上午11:50:37 
	 * @param poiDocument
	 * @return
	 */
	public boolean updatePoiIndex(PoiDocument poiDocument);
	
	/**
	 * 店铺管理后台更新shop索引
	 * @param shopDocument	店铺索引doc对象
	 * @return
	 */
	public boolean updateShopIndex(ShopDocument shopDocument);

	/**
	 * 根据商场ID || 店铺名称 获取店铺列表
	 * @param param
	 * @return
	 */
	public ShopSearchIdsResult getShopListByName(ShopSearchParam param);


	/**
	 * 清除标签（店铺/商场等）
	 *
	 * @param poiType     poi类型
	 * @return
	 * @author wangjh7
	 * @date 2016-05-05
	 */
	public ResponseVO clearPOITip(EPOIType poiType);

	/**
	 * 更新标签的值
	 *
	 * @param poiType     POI类型
	 * @param poiList     需要更新的ID及对应TIP的值
	 * @param epoiTipType 更新的字段
	 * @return
	 * @author wangjh7
	 * @date 2016-05-05
	 */
	public ResponseVO updatePOITip(EPOIType poiType, List<String> poiList, EPOITipType epoiTipType);

	/**
	 * 查询POIID对应标签的值
	 *
	 * @param poiIds 查询的ID及对应TIP的值
	 * @return List<com.rongyi.easy.solr.result.ShopSearchInfo>
	 */
	public ResponseVO selectPOITipByPOIIds(List<String> poiIds);

	/**
	 * 设置标签（店铺/商场等）
	 *
	 * @return
	 * @author wangjh7
	 * @date 2016-05-05
	 */
	public void setPOITip();
}
