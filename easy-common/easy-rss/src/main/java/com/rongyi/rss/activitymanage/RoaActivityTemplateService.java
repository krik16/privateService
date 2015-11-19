package com.rongyi.rss.activitymanage;

import com.rongyi.easy.activitymanage.entity.ActivityTemplate;

/**
 * 活动模版接口
 * Created by lijing on 2015/11/18.
 */
public interface RoaActivityTemplateService {
    /**
     * 新建活动模版
     *
     * @param activityTemplate
     * @return true  or false
     */
    boolean saveActivityTemplate(ActivityTemplate activityTemplate);


    /***
     * 通过id得到
     * @param id
     * @return
     */
    ActivityTemplate getTemplateById(Integer id);

    
}
