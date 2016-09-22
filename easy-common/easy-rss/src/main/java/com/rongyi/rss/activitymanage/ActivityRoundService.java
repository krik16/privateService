package com.rongyi.rss.activitymanage;

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

	/**
	 * 添加场次商品
	 */
	boolean addRoundGoods(List<RoundGood> roundGoods);

	/**
	 * 容易逛:根据spu查出所有的sku信息:场次 库存 价格,提报库存什么的
	 */
	List<SearchGoodInActivityRoundInfo> searchGoodInActivityRoundInfo(String spu);
	
	
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

}
