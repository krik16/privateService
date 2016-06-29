/** 
* @Title: VirtualAccountAdminServiceImpl.java 
* @Package com.rongyi.va.service.impl 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月27日 上午10:45:44 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.service.impl;

import com.rongyi.easy.va.entity.VirtualAccountEntity;
import com.rongyi.rss.va.VirtualAccountAdminService;
import com.rongyi.va.service.VirtualAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 *
 */
public class VirtualAccountAdminServiceImpl implements VirtualAccountAdminService{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
    @Autowired
    VirtualAccountService virtualAccountService;
	
	/* (non-Javadoc) 
	* @param account
	* @return 
	* @see com.rongyi.rss.va.VirtualAccountAdminService#virtualAccountCreate(com.rongyi.easy.va.entity.VirtualAccountEntity) 
	*/
	@Override
	public boolean virtualAccountCreate(VirtualAccountEntity account) {
		logger.info(">>>>>>>>>虚拟账号创建开始:account={}",account);
		boolean result = false;
		try {
			account.setBalance(new BigDecimal(0));
			if(account.getIsAuthenticated() == null){
				account.setIsAuthenticated(true);
			}
			
			logger.info("创建账号，用户Id: " + account.getUserId());
			int id = virtualAccountService.insertAndGetId(account);
			if (id > 0) {
				result = true;
			} else {
				logger.info("账号未创建成功，用户Id: " + account.getUserId());
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		logger.info(">>>>>>>>>虚拟账号创建结束");
		return result;
	}
}
