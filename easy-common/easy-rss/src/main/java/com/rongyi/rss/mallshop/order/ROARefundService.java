package com.rongyi.rss.mallshop.order;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.JudgeParam;
import com.rongyi.easy.rmmm.param.RefundParam;
import com.rongyi.easy.rmmm.vo.RefundTypeListVO;

public interface ROARefundService {
	
	/**
	 * 同意退款
	 * @param refundParam
	 * @return
	 * @throws Exception
	 */
	public ResponseResult passRefund(RefundParam refundParam) throws Exception;
	
	/**
	 * 拒绝退款
	 * @param refundParam
	 * @return
	 * @throws Exception
	 */
	public ResponseResult refuseRefund(RefundParam refundParam) throws Exception;
	
	/**
	 * 客服判定退款
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult judgeRefund(JudgeParam param) throws Exception;
	
	/**
	 * 客服判定不退款
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult judgeNoRefund(JudgeParam param) throws Exception;
	
	/**
	 * 退款类型列表
	 * @return
	 */
	public RefundTypeListVO getRefundType() throws Exception;

}
