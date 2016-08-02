package com.rongyi.rss.bsoms;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bsoms.entity.TaskCheck;
import com.rongyi.easy.bsoms.entity.TaskInfo;
import com.rongyi.easy.bsoms.entity.TaskInfoWithBLOBs;
import com.rongyi.easy.bsoms.vo.TaskVo;
import com.rongyi.easy.ryoms.entity.RyUserInfo;

import java.util.List;
import java.util.Map;

/**
 * 任务管理接口
 * Created by user on 2016/8/1.
 */
public interface ITaskInfoService {
    /**
     * 新建 修改任务
     * @param record 任务实体
     * @return !=0成功
     */
    public int saveOrUpdate(TaskInfoWithBLOBs record);

    /**
     * 通过查询条件查询列表
     * @param paramMap
     *           name 任务名称
     *           status  任务状态
     *           currpage  当前页
     *           pageSize  每页显示行数
     * @return
     */
    public List<TaskInfo> getListByMap(Map paramMap);

    /**
     * 查询任务详情
     * @param id 任务id
     * @return
     */
    public TaskInfoWithBLOBs getTaskById(Integer id);

    /**
     * 查询列表统计数量
     * @param paramMap
     * @return
     */
    public Map getStatusCount(Map paramMap);

    /**
     * 终止任务
     * @param id 任务ID
     * @param stopReason 终止理由
     * @return
     */
    public int stopTaskById(Integer id,String stopReason);

    /**
     * 删除任务（逻辑）
     * @param id
     * @return
     */
    public int deleteTaskById(Integer id);

    /**
     * 审核任务
     * @param paramMap
     *            id 任务ID
     *            status 0通过  1不通过
     *            stopReason  不通过理由
     * @return  !=0成功
     */
    public int checkTask(Map paramMap,RyUserInfo user);

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
     * 查询任务详情 (app)
     * @param id 任务Id
     * am userId 用户ID
     * @return
     */
    public TaskVo getTaskVoById(Integer id,Integer userId);

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

    /**
     * 查询任务审核失败列表
     * @param taskId 任务ID
     * @return
     */
    public List<TaskCheck> selectFailList(Integer taskId);
}
