package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.vo.RefundTypeListVO;

public interface IRefundService {
	
	/**
	 * 退款类型列表
	 * @return
	 */
	public RefundTypeListVO getRefundType() throws Exception;

}
