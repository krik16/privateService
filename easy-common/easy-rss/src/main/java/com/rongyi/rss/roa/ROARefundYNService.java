package com.rongyi.rss.roa;

import java.math.BigDecimal;
import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.rmmm.param.RefundParam;
import com.rongyi.easy.rmmm.param.RequestRefundParam;

public interface ROARefundYNService {
	
	/**
	 * 同意退款API
	 * @param refundParam
	 * @return
	 * @throws Exception
	 */
	public ResponseResult passRefund(Map<String,Object> map) throws Exception;
	/**
	 * 拒绝退款API
	 * @param refundParam
	 * @return
	 * @throws Exception
	 */
	public ResponseResult refuseRefund(Map<String,Object> map) throws Exception;
	
	/**
	 * 申请退款
	 * @return
	 * @throws Exception
	 */
	public ResponseResult requestRefund(ApplicationFormEntity applicationForm,BigDecimal refundMoney) throws Exception;
	
	/**
	 * 取消退款
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult cancelRefund(Map<String,Object> map) throws Exception;
}
