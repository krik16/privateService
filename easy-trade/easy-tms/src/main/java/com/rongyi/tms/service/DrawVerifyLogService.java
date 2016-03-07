/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月11日下午3:28:20
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import com.rongyi.easy.tms.entity.DrawVerifyLog;

/**
 * @Author:  柯军
 * @Description: 提现申请审核日志service接口
 * @datetime:2015年5月11日下午3:28:20
 *
 **/

public interface DrawVerifyLogService {
    /**
     * 
     * @Description 插入一条审批记录
     * @author 袁波
     * @param verifyLog
     * @return
     */
    public int createDrawVerifyLog(DrawVerifyLog verifyLog);
    
    /**
     * 
     * @Description 获取某个提现申请的审核不通过的审核记录 
     * @author 袁波
     * @param applyId 提现申请id
     * @return
     */
    public DrawVerifyLog getLogByApplyId(Integer applyId);

    /**
     *
     * @Description 获取某个提现申请最新一条审核记录
     * @author 袁波
     * @param applyId 提现申请id
     * @return
     */
    public DrawVerifyLog getLatestLogByApplyId(Integer applyId);
}
