package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.param.AdviseShopParam;
import com.rongyi.easy.mcmc.param.LiveParam;
import com.rongyi.easy.rmmm.param.BullParam;
import com.rongyi.easy.solr.LiveSolrDocument;
import com.rongyi.easy.solr.param.LiveSearchParam;

/**
 * 直播服务接口
 * 
 * @author xiaobo
 *
 */
public interface LiveService {	
	/**
	 * 更新直播状态
	 * @param id 直播id
	 * @param status 0发布，1上线，2下线
	 * @return 返回 boolean 的 ResponseVO
	 */
	ResponseVO updateLiveStatus(String id,int status);
	
	/**
	 * 新增、修改直播，如果存在则修改
	 * @param vo 直播实体
	 * @return 返回带liveId 的 ResponseVO
	 */
	ResponseVO insertLive(LiveParam vo);
	
	/**
	 * 通过买手id查询直播列表
	 * @param bullId 买手id
	 * @param liveStatus 直播状态 -1全部，0发布，1上线，2下线
	 * @param commodityStatus 商品状态 -1全部，0下架，1上架
	 * @param commodityCount 需要返回的商品个数，如果为-1，返回全部商品。
	 * @param page 页数
	 * @param pageSize 页大小
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO getLiveList(String bullId,int liveStatus,int commodityStatus,int commodityCount,int page,int pageSize);
	
	/**
	 * 获取直播详情
	 * @param id 直播id
	 * @param commodityStatus 商品状态 ，-1全部，0下架，1上架
	 * @return 带LiveVO的ResponseVO
	 */
	ResponseVO getLiveDetail(String id,int commodityStatus);
	
	/**
	 * 获取买手信息
	 * @param bullId 买手id
	 * @return 带LiveBullInfoVO实体的ResponseVO
	 */
	ResponseVO getBullInfo(String bullId);
	
	/**
	 * 搜索直播
	 * @param param 搜索参数
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO searchLiveList(LiveSearchParam param);
	
	/**
	 * 建议商店
	 * @param vo 建议商店实体
	 * @return 带建议id的ResponseVO
	 */
	ResponseVO adviseShop(AdviseShopParam vo);
	
	/**
	 * 获取品牌列表
	 * @return 带List&lt;LiveBrandVO&gt;的ResponseVO
	 */
	ResponseVO getBrandList(BullParam param);
	
	/**
	 * 通过直播id列表查询直播列表
	 * @param ids 直播id列表
	 * @param time 直播时间,-1查询所有时间
	 * @param commodityCount 需要返回的商品个数，如果为-1，返回全部商品。
	 * @param liveStatus 直播状态 -1 全部，-2 只有预热和上线，0预热，1上线，2下线
	 * @param commodityStatus 商品状态 -1全部，0下架，1上架
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO getLiveByIdsAndTime(List<String> ids, long time, int commodityCount, int liveStatus,
			int commodityStatus);
	
	/**
	 * FE端搜索直播接口
	 * @param liveName 直播名称
	 * @param bullId 买手id
	 * @param bullNickName 买手昵称
	 * @param status 状态
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @param page 页数
	 * @param pageSize 页大小
	 * @param type 0表示直播开始时间 1表示直播结束时间
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO searchFELiveList(String liveName,String bullId,String bullNickName,Integer status,Integer type,Long beginTime,Long endTime,Integer page,Integer pageSize);
    
	/**
	 * FE端通过直播id获取直播
	 * @param liveId 直播id
	 * @return 带LiveVO的ResponseVO
	 */
	ResponseVO getFELiveDetail(String liveId);

	/**
	 * FE端获取直播商品
	 * @param liveId 直播id
	 * @param page 页数
	 * @param pageSize 页大小
	 * @return 带list&lt;CommodityVO&gt;的ResponseVO
	 */
	ResponseVO getFECommodityByLiveId(String liveId,Integer page,Integer pageSize);
	
	/**
	 * FE端直播停播
	 * @param liveId 直播id
	 * @return ResponseVO 只包括 meta
	 */
	ResponseVO feLiveStop(String liveId);
	
	/**
	 * FE直播商品下架
	 * @param commodityId
	 * @return
	 */
	ResponseVO feCommodityOffShelves(String commodityId);

	/**
	 * 直播mongo批量转solr对象
	 * @param skip
	 * @param pageSize
	 * @return
	 */
	public List<LiveSolrDocument> getLiveSolrDocumentList(int skip,int pageSize);

	/**
	 * 直播mongo转solr对象
	 * @param liveId
	 * @return
	 */
	public LiveSolrDocument getLiveSolrDocument(String liveId);

	/**
	 * 查询直播数量
	 * @return
	 */
	public long getLiveCount();

}

