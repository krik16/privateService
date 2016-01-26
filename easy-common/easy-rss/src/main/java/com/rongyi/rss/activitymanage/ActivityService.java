package com.rongyi.rss.activitymanage;

import java.util.List;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activity.entity.QueryActivityGoods;
import com.rongyi.easy.activitymanage.entity.ActivityCheckRecord;
import com.rongyi.easy.activitymanage.entity.ActivityGoods;
import com.rongyi.easy.activitymanage.entity.ActivityGoodsSpec;
import com.rongyi.easy.activitymanage.entity.ActivityInfo;
import com.rongyi.easy.activitymanage.param.SearchActivityParam;
import com.rongyi.easy.activitymanage.vo.ActivityInfoListVO;

/**
 * 活动后台管理接口
 * Created by Leon on 2016/1/20.
 */
public interface ActivityService {

    /**
     * 新建活动
     * @param activityInfo
     * @return boolean
     * @author Leon
     */
    boolean saveActivityInfo(ActivityInfo activityInfo);

    /**
     * 审核活动
     * @param activityCheckRecord
     * @return boolean
     * @author Leon
     */
    boolean checkActivityInfo(ActivityCheckRecord activityCheckRecord);
    /**
	 * 根据活动ID统计报名的商品卡券数量
	 * @param queryActivityGoods
	 * @return 
	 * @author wangzhiwen
	 */
     public ActivityGoods countActivityGoods(QueryActivityGoods queryActivityGoods);
     /**
 	 * 根据goodid，joinStartAt，joinEndAt查询商品卡券在同一时间是否参加其他活动
 	 * @param queryActivityGoods
 	 * @return 
	 * @author wangzhiwen
 	 */
     public List<ActivityGoods> getActivityGoodsInfo(QueryActivityGoods queryActivityGoods);
     
     /**
      * 批量新增ActivityGoods数据
      * @param ActivityGoods
      * @return 
	  * @author wangzhiwen
      */
     public int batchInsert(List<ActivityGoods> listActivityGoods);
     /**
      * 新增ActivityGoods数据返回Id
      * @param activityGoods
      * @return 
	  * @author wangzhiwen
      */
     public ActivityGoods insertActivityGoodsReturnId(ActivityGoods activityGoods);
     /**
      * 新增操作记录
      * @param activityCheckRecord
      * @return 
	  * @author wangzhiwen
      */
     public int insertActivityCheckRecord(ActivityCheckRecord activityCheckRecord);
     /**
      * 新增商品规格
      * @param activityGoodsSpec
      * @return 
	  * @author wangzhiwen
      */
     public int insertActivityGoodsSpec(ActivityGoodsSpec activityGoodsSpec);

    /**
     * 查询活动列表
     * @param searchActivityParam
     * @return
     */
    public PagingVO<ActivityInfoListVO> getActivityList(SearchActivityParam searchActivityParam);

}
