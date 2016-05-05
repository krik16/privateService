package com.rongyi.rss.usercenter.malllife;

import java.util.List;

import com.rongyi.easy.rmmm.param.ShareCouponParam;
import com.rongyi.easy.usercenter.entity.ShareCouponRecordEntity;

public interface IShareCouponRecordService {
	
	/**
	 * 
	 * @param couponCode、shareId、orderNum、orderType、couponType、price 
	 * @return
	 * @throws Exception
	 */
	public int insertShareCouponRecord(ShareCouponParam param) throws Exception;
	
	public int updateShareCouponRecord(ShareCouponParam param) throws Exception;
	
	/**
	 * 根据分享红包id获取已领取的记录列表
	 * @return
	 * @throws Exception
	 */
	public List<ShareCouponRecordEntity> selectShareCouponByShareId(String shareId) throws Exception;

}
