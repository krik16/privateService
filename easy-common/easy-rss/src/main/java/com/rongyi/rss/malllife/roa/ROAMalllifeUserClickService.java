package com.rongyi.rss.malllife.roa;

public interface ROAMalllifeUserClickService {
	
	/**
	 * 修改点击记录
	 * @param type 1订单详情进入物流详情 2订单列表进入物流详情 3物流详情进入IM
	 */
	public void updateUserClick(Integer type) throws Exception;

}
