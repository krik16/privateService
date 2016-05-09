package com.rongyi.rss.mcmc;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.param.AdviseShopParam;
import com.rongyi.easy.mcmc.param.LiveParam;
import com.rongyi.easy.rmmm.param.BullParam;
import com.rongyi.easy.roa.param.SearchCommodityBrandParam;
import com.rongyi.easy.solr.param.LiveSearchParam;

/**
 * 直播ROA服务接口
 * 
 * @author xiaobo
 *
 */
public interface ROALiveService {
	/**
	 * 更新直播状态
	 * 
	 * @param id
	 *            直播id
	 * @param status
	 *            0发布，1上线，2下线
	 * @return 返回 boolean 的 ResponseVO
	 */
	ResponseVO updateLiveStatus(String id, int status);

	/**
	 * 新增、修改直播，如果存在则修改
	 * 
	 * @param vo
	 *            直播实体
	 * @return 返回带liveId 的 ResponseVO
	 */
	ResponseVO insertLive(LiveParam vo);

	/**
	 * 通过买手id查询直播列表
	 * 
	 * @param bullId
	 *            买手id
	 * @param liveStatus
	 *            直播状态 -1全部，0发布，1上线，2下线
	 * @param commodityStatus
	 *            商品状态 -1全部，0下架，1上架
	 * @param commodityCount
	 *            需要返回的商品个数，如果为-1，返回全部商品。
	 * @param page
	 *            页数
	 * @param pageSize
	 *            页大小
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO getLiveList(String bullId, int liveStatus, int commodityStatus, int commodityCount, int page,
			int pageSize);

	/**
	 * 获取直播详情
	 * 
	 * @param id
	 *            直播id
	 * @param commodityStatus
	 *            商品状态 ，-1全部，0下架，1上架
	 * @return 带LiveVO的ResponseVO
	 */
	ResponseVO getLiveDetail(String id, int commodityStatus);

	/**
	 * 获取买手信息
	 * 
	 * @param bullId
	 *            买手id
	 * @return 带LiveBullInfoVO实体的ResponseVO
	 */
	ResponseVO getBullInfo(String bullId);

	/**
	 * 搜索直播
	 * 
	 * @param param
	 *            搜索参数
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO searchLiveList(LiveSearchParam param);

	/**
	 * 建议商店
	 * 
	 * @param vo
	 *            建议商店实体
	 * @return 带建议id的ResponseVO
	 */
	ResponseVO adviseShop(AdviseShopParam vo);

	/**
	 * 获取品牌列表
	 * 
	 * @param bullId
	 *            买手id
	 * @param liveId
	 *            直播id
	 * @param page
	 *            页数
	 * @param pageSize
	 *            页大小
	 * @return 带List&lt;LiveBrandVO&gt;的ResponseVO
	 */
	ResponseVO getBrandList(BullParam param);

	/**
	 * 通过直播id列表查询直播列表
	 * 
	 * @param ids
	 *            直播id列表
	 * @param time
	 *            直播时间,-1 查询所有时间
	 * @param commodityCount
	 *            需要返回的商品个数，如果为-1，返回全部商品。
	 * @param liveStatus
	 *            直播状态 -1 全部，-2 只有预热和上线，0预热，1上线，2下线
	 * @param commodityStatus
	 *            商品状态 -1全部，0下架，1上架
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO getLiveByIdsAndTime(List<String> ids, long time, int commodityCount, int liveStatus,
			int commodityStatus);
    /*
    根据Id删除直播商品
     */
	ResponseVO  deleteById (String id);

	/**
	 * 查询品牌列表（除用户已订阅，爱品牌品牌墙）
	 *
	 * @param brandParam
	 *
	 * @return List<brandVo>
	 */
	ResponseVO searchBrandsForUser(SearchCommodityBrandParam brandParam);
}
