package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.vo.AdviseShopVO;
import com.rongyi.easy.mcmc.vo.LiveVO;

/**
 * 直播ROA服务接口
 * 
 * @author xiaobo
 *
 */
public interface ROALiveService {
	/**
	 * 新增、修改直播，如果存在则修改
	 * @param vo 直播实体
	 * @return 返回带liveId 的 ResponseVO
	 */
	ResponseVO insertLive(LiveVO vo);
	
	/**
	 * 通过买手id查询直播列表
	 * @param bullId 买手id
	 * @param commodityCount 需要返回的商品个数，如果为0，返回全部商品。
	 * @param page 页数
	 * @param pageSize 页大小
	 * @return 带List&lt;LiveVO&gt;的ResponseVO
	 */
	ResponseVO getLiveList(String bullId,int commodityCount,int page,int pageSize);
	
	/**
	 * 获取直播详情
	 * @param id 直播id
	 * @return 带LiveVO的ResponseVO
	 */
	ResponseVO getLiveDetail(String id);
	
	/**
	 * 获取买手信息
	 * @param bullId 买手id
	 * @return 带LiveBullInfoVO实体的ResponseVO
	 */
	ResponseVO getBullInfo(String bullId);
	
	/**
	 * 搜索直播
	 * @param param 搜索参数
	 * @return 返回带LiveVO的ResponseVO
	 */
	ResponseVO searchLiveList(String param);
	
	/**
	 * 建议商店
	 * @param vo 建议商店实体
	 * @return 带建议id的ResponseVO
	 */
	ResponseVO adviseShop(AdviseShopVO vo);
	
	/**
	 * 获取品牌列表
	 * @param bullId 买手id
	 * @param liveId 直播id
	 * @param page 页数
	 * @param pageSize 页大小
	 * @return 带List&lt;LiveBrandVO&gt;的ResponseVO
	 */
	ResponseVO getBrandList(String bullId,String liveId,int page,int pageSize);
	
}
