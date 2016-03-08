/** 
* @Title: SalesCommissionAuditLogServiceImpl.java 
* @Package com.rongyi.tms.service.impl 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月25日 下午3:04:05 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.tms.service.SalesCommissionAuditLogService;

/**
 * @author ZhengYl
 *
 */
@Service
public class SalesCommissionAuditLogServiceImpl extends BaseServiceImpl implements SalesCommissionAuditLogService {
	private static final String NAMESPACE_SALESCOMMISSION_LOG = "com.rongyi.tms.mapper.xml.SalesCommissionAuditLogMapper";

	private static final Logger LOGGER = Logger.getLogger(SalesCommissionServiceImpl.class);
	
	/* (non-Javadoc) 
	* @param orderNo
	* @return 
	* @see com.rongyi.tms.service.SalesCommissionAuditLogService#selectFailedByOrderNo(java.lang.String) 
	*/
	@Override
	public SalesCommissionAuditLog selectFailedLog(Integer commissionId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("salesCommissionId", commissionId);
    	return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION_LOG + ".selectFailedLog", map);
	}
   	
    /* (non-Javadoc) 
    * @param commissionAuditLog
    * @return 
    * @see com.rongyi.tms.service.SalesCommissionAuditLogService#createCommissionAuditLog(com.rongyi.easy.tms.entity.SalesCommissionAuditLog) 
    */
    @Override
    public int createCommissionAuditLog(SalesCommissionAuditLog commissionAuditLog) {
        // TODO Auto-generated method stub
        return this.getBaseDao().insertBySql(NAMESPACE_SALESCOMMISSION_LOG+".insert", commissionAuditLog);
    }

    /**
     * Description 
     * @param commissionId
     * @return 
     * @see com.rongyi.tms.service.SalesCommissionAuditLogService#selectByCommissionId(java.lang.Integer) 
     */ 
    	
    @Override
    public SalesCommissionAuditLog selectByCommissionId(Integer commissionId,Integer operate) {
        Map<String, Object> params=new HashMap<String, Object>();
        params.put("commissionId", commissionId);
        params.put("operate", operate);
        return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION_LOG+".selectByCommissionId", params);
    }

    /**
     * Description 
     * @param paramsMap
     * @return 
     * @see com.rongyi.tms.service.SalesCommissionAuditLogService#batachInsertCommissionAuditLog(java.util.Map) 
     */ 
    	
    @Override
    public int batachInsertCommissionAuditLog(Map<String, Object> paramsMap) {
        return this.getBaseDao().insertBySql(NAMESPACE_SALESCOMMISSION_LOG+".batchInsert", paramsMap);
    }

    @Override
    public SalesCommissionAuditLog selectLatestLogWithCommissionId(Integer commissionId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("salesCommissionId", commissionId);
        return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION_LOG + ".selectLatestLogWithCommissionId", map);
    }


}
