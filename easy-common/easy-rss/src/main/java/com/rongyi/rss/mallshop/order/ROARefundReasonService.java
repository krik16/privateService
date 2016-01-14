package com.rongyi.rss.mallshop.order;

import com.rongyi.easy.rmmm.vo.RefundReasonListVO;

public interface ROARefundReasonService {
	
	/**
	 * 获得退款原因列表
	 * @return
	 * @throws Exception
	 */
	public RefundReasonListVO getRefundReasonList() throws Exception;

}
