/** 
* @Title: SalesCommissionAuditLogService.java 
* @Package com.rongyi.tms.service 
* @Description: 佣金审核记录
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月25日 下午3:01:09 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.service;

import java.util.Map;

import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;


/**
 * @author ZhengYl
 *
 */
public interface SalesCommissionAuditLogService {
	
	/**
	 * 通过订单号查找佣金审核不通过的记录（选取最新一条）
	 * 
	 * @author ZhengYl
	 * @date 2015年5月25日 下午3:01:53 
	 * @param orderNo 订单号
	 * @return
	 */
	public SalesCommissionAuditLog selectFailedLog(Integer commissionId);
	
	/**
     * 
     * @Description 插入一条审批记录
     * @author 袁波
     * @param verifyLog
     * @return
     */
    public int createCommissionAuditLog(SalesCommissionAuditLog commissionAuditLog);
    
    /**
     * 
     * @Description 根据返佣记录id 查找审核记录
     * @author 袁波
     * @param commissionId
     * @return
     */
    public SalesCommissionAuditLog selectByCommissionId(Integer commissionId,Integer operate);
    
    /**
     * 批量插入审核日志
     * @Description 
     * @author 袁波
     * @param paramsMap
     * @return
     */
    public int batachInsertCommissionAuditLog(Map<String, Object> paramsMap);

    public SalesCommissionAuditLog selectLatestLogWithCommissionId(Integer commissionId);
}
