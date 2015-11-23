package com.rongyi.rss.activitymanage;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.activitymanage.entity.ActivityTemplate;
import com.rongyi.easy.activitymanage.param.ActivityTemplateParam;
import com.rongyi.easy.activitymanage.vo.ActivityTemplateVO;

import java.util.List;

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
     * 通过id得到 查询url
     * @param id
     * @return
     */
    ActivityTemplate getTemplateById(Integer id);

    /***
     * 查询活动模版列表
     * @param activityTemplateParam
     * @return  PagingVO<ActivityTemplateVO>
     */
    PagingVO<ActivityTemplateVO> selectTemplateListByParam(ActivityTemplateParam activityTemplateParam);


    /**
     * 通过Id得到活动模版详情
     * @param id
     * @return
     */
    ActivityTemplate getActivityDetailById(Integer id);


    /**
     * 修改活动模版
     *
     * @param activityTemplate
     * @return true  or false
     */
    boolean updateActivityTemplate(ActivityTemplate activityTemplate);

}
