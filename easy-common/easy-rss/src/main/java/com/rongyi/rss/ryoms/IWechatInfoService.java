package com.rongyi.rss.ryoms;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.bsoms.entity.SessionUserInfo;
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
	 WechatInfoVo getWechatInfoByMallId(String mallId) throws Exception;

	/**
	 * 根据商户ID查询对应的微信服务号
	 * @param merId 商户ID
	 * @param type 0集团 1商场 2店铺
	 * @return 服务服务号
	 */
	WechatInfoVo getWechatInfoMerId(String merId,Integer type);

	/**
	 * 根据登录用户信息查询绑定的微信服务号列表
	 * @param userInfo 登录用户信息
	 * @return 服务号列表
	 */
	List<WechatInfoVo> getWechatInfoListByLoginUser(SessionUserInfo userInfo);


}
