package com.rongyi.rss.coupon;

import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
/**
 * 
 * @author lijing
 *
 */
public interface RoaCouponTemplateService {
	/**
	 * 这个是保存优惠卷模版表的
	 * @param content
	 * @param shopId
	 * @return
	 */
	public ResponseResult saveCouponTemplate(String content,String shopId,String type);
	/**
	 * 删除
	 * @param shopId
	 * @param id
	 * @return
	 */
	public ResponseResult deleteCouponTemplate(String shopId,String id,String type);
	/**
	 * 修改
	 * @param id
	 * @param content
	 * @return
	 */
	public ResponseResult updateCouponTemplate(String id,String content,String type);
	
	/**
	 * 得到模版集合
	 * @param shopId
	 * @param offer
	 * @param pagesize
	 * @return
	 */
	public Map<String,Object> getCouponTemplateList(String shopId,Integer offer,Integer pagesize,String type);
	/**
	 * 设置为默认
	 * @param id
	 *
	 * @param isDefault     true设置为默认  false  取消默认状态
	 * @return
	 */
	public ResponseResult setDefaultTemplate(String id,boolean isDefault,String type);
}
