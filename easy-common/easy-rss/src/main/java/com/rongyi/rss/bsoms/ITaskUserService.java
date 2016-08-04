package com.rongyi.rss.bsoms;

/**
 * Created by user on 2016/8/3.
 */

import com.rongyi.easy.bsoms.entity.TaskUser;

import java.util.List;
import java.util.Map;

/**
 * 任务报名信息
 */
public interface ITaskUserService {
    /**
     * 批量添加报名信息
     * @param list
     * @return  返回导致失败
     */
    public int insertList(List<TaskUser> list);

    /**
     * 查询报名人信息列表
     * @param paramMap
     *           taskId任务ID
     *           userId 用户ID
     *           userIds 用户list
     * @return
     */
    public List<TaskUser> getTaskUserList(Map paramMap);
}
