package com.rongyi.rss.tradecenter;

import java.util.Map;

import com.rongyi.core.bean.ResponseResult;

/**
 * @author yujisun
 * @version 2015/9/2
 */
public interface ICodeValidService {

	/**
     * 优惠券验证
     * @param couponCode
     * @param mallId
     * @param shopId
     * @param useMode
     * @param couponId
     * @param sellerId
     * @return
     */
	public ResponseResult validateCouponCode(String couponCode, String mallId, String shopId, Long useMode, String couponId, Integer sellerId);
    
    /**
     * 优惠券验证
     * @param couponCode
     * @param mallId
     * @param shopId
     * @param useMode
     * @param couponId
     * @param couponId
     * @param checkNum
     * @return
     */
    public ResponseResult validateCouponCodeMutli(String couponCode, String mallId, String shopId, Long useMode, String couponId, Integer sellerId,Integer checkNum);
    /**
     * 提供给手机端 查询未使用券码的接口
     */
    public Map<String,Object> unusedCodeNum(String couponCode, Integer codeNum,String shopId,String mallId);
    /**
     * 根据couponCode查用户手机号码
     * @param couponCode
     * @return
     */
    public String getUserMobile(String couponCode);
    
    /**
     * 哈格达斯优惠券验证
     * @param couponCode
     * @param status
     * @return
     */
    public boolean validateHagenCoupon(String couponCodeMd5, byte status);
}
