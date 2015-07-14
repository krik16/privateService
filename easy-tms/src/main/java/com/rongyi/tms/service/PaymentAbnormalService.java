/** 
* @Title: PaymentAbnormalService.java 
* @Package com.rongyi.tms.service 
* @Description: 异常支付数据接口
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月17日 下午1:07:00 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.service;

import com.rongyi.core.common.PagingVO;
import com.rongyi.tms.moudle.vo.AbnormalParam;
import com.rongyi.tms.moudle.vo.AbnormalVO;

import java.util.Map;

/**
 * @author ZhengYl
 *
 */
public interface PaymentAbnormalService {
	
	/**
	 * 列表查询
	 * 
	 * @author ZhengYl
	 * @date 2015年6月17日 下午1:08:26 
	 * @param params
	 * @return
	 */
	public PagingVO<AbnormalVO> findByPage(Map<String,Object> params);
	
	/**
	 * 更新
	 * 
	 * @author ZhengYl
	 * @date 2015年6月17日 下午1:13:58 
	 * @param abnormalParam
	 */
	public int update(AbnormalParam abnormalParam);
	

	/**
	 * 更新审核状态，可批量审核通过
	 * 
	 * @author ZhengYl
	 * @date 2015年6月23日 下午5:39:35 
	 * @param params
	 */
	public int updateCheckedStatus(Map<String, Object> params);

	/**
	 * 更新删除状态
	 * 
	 * @author ZhengYl
	 * @date 2015年6月17日 下午1:26:40 
	 * @param params
	 */
	public int updateDeletedFlag(Map<String, Object> params);
	
	/**
	 * 查询一条数据 根据ID
	 * 
	 * @author ZhengYl
	 * @date 2015年6月23日 上午9:55:42 
	 * @param id
	 * @return
	 */
	public AbnormalVO selectOneById(int id);
	
}
