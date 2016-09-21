package com.rongyi.rss.activitymanage;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activity.entity.QueryActivityGoods;
import com.rongyi.easy.activitymanage.entity.*;
import com.rongyi.easy.activitymanage.param.ActivityGoodsImportParam;
import com.rongyi.easy.activitymanage.param.ActivityGoodsParam;
import com.rongyi.easy.activitymanage.param.SearchActivityParam;
import com.rongyi.easy.activitymanage.vo.*;

/**
 * 活动后台管理接口
 * Created by Leon on 2016/1/20.
 */
public interface ActivityRoundService {

  
    boolean saveOrUpdateRound(ActivityRoundInfo activityRoundInfo);


    boolean delRound(ActivityRoundInfo activityRoundInfo);

    List<ActivityRoundInfo> getActivityRoundInfoList(int activityId ,int state,int currentPage,int pageSize);
    
    List<ActivityRoundInfo> getGoodInRound(String sku);
    

}
