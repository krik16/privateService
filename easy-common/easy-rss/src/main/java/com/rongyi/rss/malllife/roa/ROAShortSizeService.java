package com.rongyi.rss.malllife.roa;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content_v2.entity.ActivityModuleEntity;
import com.rongyi.easy.content_v2.param.ShortSizeParam;
import com.rongyi.easy.content_v2.entity.ContentParam;
import com.rongyi.easy.content_v2.param.ForumContentOperateParam;

/**
 * Created by WUH
 * on 2016/12/30.
 */
public interface ROAShortSizeService {
    /**
     * 保存、更新content
     * @param param 断码好货对象
     * @return 统一模型
     */
    ResponseVO saveOrUpdate(ShortSizeParam param);

    /**
     * 修改状态操作
     * @param operateParam 修改状态模型
     * @return 统一模型
     */
    ResponseVO operateContent(ForumContentOperateParam operateParam);

    /**
     * 根据条件查询
     * @param param 条件
     * @return 统一模型
     */
    ResponseVO contentList(ContentParam param);

    /**
     * 根据id查询详情
     * @param  id contentId
     * @return 统一模型
     */
    ResponseVO getDetailById(Integer id);

    /**
     * 保存活动
     * @param entity id不为0，修改。id为0，新建
     * @return 统一模型
     */
    ResponseVO  saveActivity(ActivityModuleEntity entity);
}
