/** 
* @Title: AccountInfoService.java 
* @Package com.rongyi.rss.tms 
* @Description: 收入管理-账号信息接口
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月26日 下午2:45:25 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.tms;

import com.rongyi.easy.va.vo.VirtualAccountVO;

/**
 * @author ZhengYl
 *
 */
public interface AccountInfoService {

	/**
	 * 账号信息查询（审核中佣金，提现中金额,失败佣金（本月））
	 * 
	 * @author ZhengYl
	 * @date 2015年5月26日 下午2:47:35 
	 * @param userId 
	 * @return
	 */
	public VirtualAccountVO queryAccountInfo(String userId);
}