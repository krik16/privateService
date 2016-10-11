package com.rongyi.rss.activitymanage;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activity.entity.QueryActivityGoods;
import com.rongyi.easy.activitymanage.entity.*;
import com.rongyi.easy.activitymanage.param.ActivityGoodsImportParam;
import com.rongyi.easy.activitymanage.param.ActivityGoodsParam;
import com.rongyi.easy.activitymanage.param.SearchActivityParam;
import com.rongyi.easy.activitymanage.vo.*;

/**
 * 活动后台管理接口 Created by Leon on 2016/1/20.
 */
public interface ActivityRoundService {

	boolean saveOrUpdateRound(ActivityRoundInfo activityRoundInfo);

	boolean delRound(int roundId);

	Map getActivityRoundInfoList(int activityId, int state, int currentPage, int pageSize);
	
	PagingVO<ActivityRoundInfo> getRoundListByTime(int activityId,Date begin ,Date end ,int currentPage, int pageSize);

	/**
	 * 添加场次商品
	 */
	boolean addRoundGoods(List<RoundGood> roundGoods);

	/**
	 * 容易逛:根据spu查出所有的sku信息:场次 库存 价格,提报库存什么的
	 */
	List<GoodShowStyleInRY> searchGoodInActivityRoundInfo(String spu);
	
	/**
	 * 容易逛:根据spu,场次开始时间,查处相关数据
	 */
	List<RoundGood> getRoundGood(String goodId,Date roundStartTime);
	
	/**
	 * 展示场次商品列表
	 * 
	 * @param roundId
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	Map listRoundGoods(int roundId, int currentPage, int pageSize);

	boolean increaseStock(List<ActivityOrderGoods> goods);

	boolean reduceStock(List<ActivityOrderGoods> goods);
	
	RoundGoodInSell getRoundGoodInfo(int roundId,int goodSku);
	
	boolean delGoodInRound(int activityId,String goodId) throws Exception;

	/***
	 * 商品列表:查询商品是否在活动中,是否有活动库存,活动价格,场次id
	 * @param goodsId
	 * @return
	 */
	List<GoodsInAppList> getGoodsList(List<String> goodsId);
	/***
	 * 商品列表:查询商品,查询商品详细活动数据
	 * @param goodsId
	 * @param roundId 场次id
	 * @return
	 */
	List<RoundGood> getRoundGood(String goodId,int roundId);

	List<SearchGoodInActivityRoundInfo> searchGoodInRound(String goodId,int activityId);
}
