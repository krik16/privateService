package com.rongyi.rss.malllife.roa;

import com.rongyi.easy.usercenter.entity.MalllifeUserOpenidEntity;

public interface ROAMalllifeUserOpenidService {
	
	/**
	 * 绑定手机号
	 * @param openId
	 * @param type 1:微信，2:新浪微博
	 * @param phone
	 * @return  主键
	 * @throws Exception
	 */
	public int bindPhone(String openId,Integer type,String phone) throws Exception;
	
	/**
	 * 根据手机号和类型查询openId
	 * @param type1:微信，2:新浪微博
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public MalllifeUserOpenidEntity selectOpenIdByPhone(Integer type,String phone) throws Exception;
	
	/**
	 * 根据openId和type
	 * @param type1:微信，2:新浪微博
	 * @param openId
	 * @return
	 * @throws Exception
	 */
	public MalllifeUserOpenidEntity selectUserOpenByOpenId(Integer type,String openId) throws Exception;
	
	/**
	 * 删除已绑定的手机号
	 * @param type
	 * @param openId
	 * @return
	 * @throws Exception
	 */
	public int deleteUserOpenByOpenId(Integer type,String openId) throws Exception;



}
