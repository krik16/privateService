package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.vo.RefundReasonListVO;

public interface IRefundReasonService {
	
	/**
	 * 获得退款原因列表
	 * @return
	 * @throws Exception
	 */
	public RefundReasonListVO getRefundReasonList() throws Exception;

}
