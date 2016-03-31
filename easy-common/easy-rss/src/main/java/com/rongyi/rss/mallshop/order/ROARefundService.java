package com.rongyi.rss.mallshop.order;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.JudgeParam;
import com.rongyi.easy.rmmm.param.RefundParam;
import com.rongyi.easy.rmmm.vo.RefundTypeListVO;

public interface ROARefundService {
	
	
	/**
	 * 退款类型列表
	 * @return
	 */
	public RefundTypeListVO getRefundType() throws Exception;

}
