/** 
* @Title: DrawApplySearchService.java 
* @Package com.rongyi.rss.tms 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月28日 下午1:55:41 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.tms;

import com.rongyi.easy.tms.vo.DrawApplyDetailVO;
import com.rongyi.easy.tms.vo.DrawApplyListVO;
import com.rongyi.easy.tms.vo.DrawApplySearchParam;

/**
 * @author ZhengYl
 *
 */
public interface DrawApplySearchService {
	
	/**
	 * 查询提现列表
	 * 
	 * @author ZhengYl
	 * @date 2015年5月28日 下午1:56:02 
	 * @param param
	 * @return
	 */
	public DrawApplyListVO drawApplySearch(DrawApplySearchParam param);

	/**
	 * 提现记录详情
	 *
	 * @author ZhengYl
	 * @date 2016年3月7日
	 *
	 * @param id 提现记录id
	 * @return
	 */
	public DrawApplyDetailVO drawApplyInfo(Integer id);
}
