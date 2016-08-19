/** 
 * @Title: VirtualAccountService.java 
 * @Package com.rongyi.rss.va 
 * @Description: 虚拟账户综合访问接口
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月25日 下午4:49:05 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.rss.va;

import com.rongyi.easy.va.entity.VirtualAccountEntity;
import com.rongyi.easy.va.vo.VirtualAccountVO;

/**
 * @author ZhengYl
 * 
 */
public interface VirtualAccountGeneralService {

	/**
	 * 虚拟账户查询
	 * 
	 * @author ZhengYl
	 * @date 2015年5月25日 下午4:52:34
	 * @param userId
	 *            用户id
	 * @return
	 */
	public VirtualAccountVO queryVirtualAccount(String userId);

	/**
	 * 账号冻结/解冻
	 * 
	 * @author ZhengYl
	 * @date 2015年5月29日 下午5:47:09
	 * @param userId
	 *            用户Id
	 * @param isSuspended
	 *            true=冻结，false=解冻
	 * @return
	 */
	public boolean setAccountSuspend(String userId, boolean isSuspended, String stopReason);
	
	
	/**	
	 * @Description: 根据userId查找 
	 * @param userId
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月16日下午4:06:43
	 **/
	public VirtualAccountEntity selectByUserId(String userId);

	/**
	 * 保存提现密码
	 * @param userId
	 * @param password
	 * @return
	 */
	public int saveDrawPassword(String userId,String password)throws Exception;

}
