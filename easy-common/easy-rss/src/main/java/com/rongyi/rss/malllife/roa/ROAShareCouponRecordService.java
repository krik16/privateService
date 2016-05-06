package com.rongyi.rss.malllife.roa;

import java.util.List;

import com.rongyi.easy.rmmm.param.ShareCouponParam;
import com.rongyi.easy.usercenter.entity.ShareCouponRecordEntity;

public interface ROAShareCouponRecordService {
	
	/**
	 * 
	 * @param couponCode、shareId、orderNum、orderType、price 
	 * @return
	 * @throws Exception
	 */
	public int insertShareCouponRecord(ShareCouponParam param) throws Exception;
	
	/**
	 * 
	 * @param userOpenidId、nickName、headImg、couponCode、orderNum、shareId
	 * @return
	 * @throws Exception
	 */
    public int updateShareCouponRecord(ShareCouponParam param) throws Exception;
	
	/**
	 * 根据分享红包id获取已领取的记录列表
	 * @return
	 * @throws Exception
	 */
	public List<ShareCouponRecordEntity> selectShareCouponByShareId(String shareId,String orderNo) throws Exception;
	
	/**
	 * 查询用户已领取的记录
	 * @param shareId、orderNo、openId、type
	 * @return
	 * @throws Exception
	 */
	public ShareCouponRecordEntity selectShareCouponByOpenId(ShareCouponParam param)  throws Exception;
	
	/**
	 * 剩余未领取红包数量
	 * @param orderNum
	 * @param shareId
	 * @return
	 * @throws Exception
	 */
	public int getRemainCouponByOrderNum(String orderNum, String shareId)  throws Exception;

}
