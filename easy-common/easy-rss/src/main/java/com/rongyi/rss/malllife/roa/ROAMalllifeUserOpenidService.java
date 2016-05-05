package com.rongyi.rss.malllife.roa;

import java.util.List;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.usercenter.entity.MalllifeUserOpenidEntity;

public interface ROAMalllifeUserOpenidService {
	
	/**
	 * 绑定手机号
	 * @param openId
	 * @param type 1:微信，2:新浪微博
	 * @param phone
	 * @return  
	 * @throws Exception
	 */
	public ResponseVO bindPhone(String openId,Integer type,String phone) throws Exception;
	
	/**
	 * 根据openId和type查询所有相关绑定记录
	 * @param type1:微信，2:新浪微博
	 * @param openId
	 * @return
	 * @throws Exception
	 */
	public List<MalllifeUserOpenidEntity> selectUserOpenListByOpenId(Integer type,String openId) throws Exception;



}
