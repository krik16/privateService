package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.entity.ActivityCheckRecord;
import com.rongyi.easy.activitymanage.entity.ActivityInfo;

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
}
