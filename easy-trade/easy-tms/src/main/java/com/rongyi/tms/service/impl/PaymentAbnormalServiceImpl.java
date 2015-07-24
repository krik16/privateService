/** 
* @Title: PaymentAbnormalServiceImpl.java 
* @Package com.rongyi.tms.service.impl 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月17日 下午1:34:29 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.rongyi.core.common.PagingVO;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.AbnormalParam;
import com.rongyi.tms.moudle.vo.AbnormalVO;
import com.rongyi.tms.service.PaymentAbnormalService;

/**
 * @author ZhengYl
 *
 */
@Service
public class PaymentAbnormalServiceImpl extends BaseServiceImpl implements PaymentAbnormalService {

	private static final String INTEGRAL_COMM_NAMESPACE = "com.rongyi.tms.mapper.xml.PaymentAbnormalMapper";

	private static final Logger LOGGER = Logger.getLogger(DrawApplyServiceImpl.class);

	/* (non-Javadoc) 
	* @param params
	* @return 
	* @see com.rongyi.tms.service.PaymentAbnormalService#findByPage(java.util.Map) 
	*/
	@Override
	public PagingVO<AbnormalVO> findByPage(Map<String, Object> params) {
		PagingVO<AbnormalVO> paging = new PagingVO<AbnormalVO>(Constant.PAGE.PAGESIZE,
				Constant.PAGE.CURRENTPAGE);
		if (params.get("pageNo") != null) {
			paging.setCurrentPage((int) params.get("pageNo"));
		}
		if (params.get("pageSize") != null) {
			paging.setPageSize((int) params.get("pageSize"));
		}
		int totalSize = this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE + ".countAll", params);
		paging.setRowCnt(totalSize);
		paging.setTotalPage(totalSize % paging.getPageSize() == 0 ? totalSize / paging.getPageSize() : (totalSize
				/ paging.getPageSize() + 1));
		List<AbnormalVO> abnormals = this.getBaseDao().selectListBySql(INTEGRAL_COMM_NAMESPACE + ".selectByPage",
				params);
		paging.setDataList(abnormals);
		return paging;
	}

	@Override
	public int update(AbnormalParam abnormalParam) {
		if (abnormalParam.getId() != 0) {
			return this.getBaseDao().updateBySql(INTEGRAL_COMM_NAMESPACE + ".updateByPrimaryKeySelective", abnormalParam);
		} else {
			return this.getBaseDao().insertBySql(INTEGRAL_COMM_NAMESPACE + ".insert", abnormalParam);
		}

	}

	/* (non-Javadoc) 
	* @param paymentAbnormalService 
	* @see com.rongyi.tms.service.PaymentAbnormalService#updateCheckedStatus(com.rongyi.tms.service.PaymentAbnormalService) 
	*/
	@Override
	public int updateCheckedStatus(Map<String, Object> params) {
		return this.getBaseDao().updateBySql(INTEGRAL_COMM_NAMESPACE + ".checkAbnormalPayment", params);

	}

	/* (non-Javadoc) 
	* @param paymentAbnormalService 
	* @see com.rongyi.tms.service.PaymentAbnormalService#updateDeletedFlag(com.rongyi.tms.service.PaymentAbnormalService) 
	*/
	@Override
	public int updateDeletedFlag(Map<String, Object> params) {
		return this.getBaseDao().updateBySql(INTEGRAL_COMM_NAMESPACE + ".abnormalPaymentLogicalDelete", params);
		// TODO Auto-generated method stub

	}

	public AbnormalVO selectOneById(int id) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		return this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE + ".selectOneById", paramMap);
	}
}
