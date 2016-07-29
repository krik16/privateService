package com.rongyi.rss.bsoms;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bsoms.vo.TaskVo;

import java.util.Map;

/**
 * 任务管理
 * Created by user on 2016/7/29.
 */
public interface ITaskService {
    /**
     * 查询任务列表
     * @param paramMap
     *              currentPage  不传默认1
     *              pageSize  不传默认10
     *              userId    用户ID （必传）
     *              type      任务状态 1进行中2已结束（必传）
     * @return
     */
    public ResponseVO getTaskAppList(Map paramMap);

    /**
     * 查询任务详情
     * @param id
     * @return
     */
    public TaskVo getTaskVoById(Integer id);

    /**
     * 查询用户未读的任务数量
     * @param userId
     * @return
     */
    public int getUnreadTaskNum(int userId);

    /**
     * 领取任务
     * @param userId 用户ID
     * @param taskId 任务ID
     * @return
     */
    public ResponseVO receiveTask(int userId,int taskId);
}
