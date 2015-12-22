package com.rongyi.rss.ryoms;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.ryoms.entity.WechatInfoVo;

/**
 * 微信服务号接口 
 * @author 苏娟
 *
 */
public interface IWechatInfoService {
	/**
	 * 查询微信公众号列表
	 * @param paramMap
	 *            userId  登录用户ID
	 *            name    微信名
	 *            type 分类  1容易内部&代运营 2容易外部
	 *            
	 * @param currpage 当前页 0表示第1页
	 * @return
	 */
	public List<WechatInfoVo> getWechatListByCondition(Map paramMap,int currpage);
	
	/**
	 * 查询微信服务号总记录数
	 * @param paramMap 参数与列表查询一致
	 * @return
	 */
	public int getWechatListCount(Map paramMap);
	
	/**
	 * 根据商场Id查询微信服务号
	 * @param mallId 
	 * @return
	 */
	public WechatInfoVo getWechatInfoByMallId(String mallId) throws Exception;
}
