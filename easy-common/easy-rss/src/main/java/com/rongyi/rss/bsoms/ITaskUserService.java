package com.rongyi.rss.bsoms;

/**
 * Created by user on 2016/8/3.
 */

import com.rongyi.easy.bsoms.entity.TaskUser;
import com.rongyi.easy.bsoms.vo.TaskUserVo;

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

    /**
     * 查询报名人详细信息列表
     * @param paramMap
     *           userPhone  联系电话
     *           mallName   商场名称
     *           shopName   店铺名称
     *           status     领取状态
     *           receiveStartAt
     *           receiveStartEnd
     *           userType   用户类型
     *           currpage
     *           pageSize
     * @return
     */
    public List<TaskUserVo> getTaskUserVoList(Map paramMap);

    /**
     * 查询列表数量统计
     * @param paramMap
     * @return
     */
    public int getTaskUserCount(Map paramMap);
}
