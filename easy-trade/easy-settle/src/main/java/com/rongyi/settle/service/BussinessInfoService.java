/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月22日下午4:45:45
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service;

import com.rongyi.easy.settle.entity.BussinessInfo;

/**	
 * @Author:  柯军
 * @Description: 商家信息表 
 * @datetime:2015年9月22日下午4:45:45
 *
 **/

public interface BussinessInfoService {
	
	/**	
	 * @Description: 插入 
	 * @param bussinessInfo
	 * @Author:  柯军
	 * @datetime:2015年9月22日下午4:47:29
	 **/
	void insert(BussinessInfo bussinessInfo);
	
	/**	
	 * @Description: 更新 
	 * @param bussinessInfo
	 * @Author:  柯军
	 * @datetime:2015年9月22日下午4:48:09
	 **/
	void update(BussinessInfo bussinessInfo);
	
	/**	
	 * @Description: 根据对账配置ID查询 
	 * @param configId	
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月22日下午4:48:50
	 **/
	BussinessInfo selectByConfigId(Integer configId);

	void updateByConfigId(BussinessInfo bussinessInfo);
}
