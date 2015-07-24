/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年7月20日下午4:33:47
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;

import com.rongyi.easy.tms.entity.BussinessLog;

/**
 * @Author: 柯军
 * @Description: 业务日志接口
 * @datetime:2015年7月20日下午4:33:47
 * 
 **/

public interface BussinessLogService {

	/**
	 * @Description: 插入
	 * @param bussinessLog
	 * @Author: 柯军
	 * @datetime:2015年7月20日下午4:43:55
	 **/
	public abstract void insert(BussinessLog bussinessLog);

	/**
	 * @Description: 根据业务ID和业务类型查询对应日志记录
	 * @param bussinessId
	 * @param type
	 * @Author: 柯军
	 * @datetime:2015年7月20日下午4:44:07
	 **/
	public abstract BussinessLog selectByBussinessIdAndType(Integer bussinessId, Integer type);
}
