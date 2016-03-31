package com.rongyi.rss.mallshop.huanxin;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.huanxin.HuanxinParam;
import com.rongyi.easy.huanxin.IMResultVO;
import com.rongyi.easy.malllife.exception.HuanXinException;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  环信接口
 * time:  2015/5/8
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/8              1.0            创建文件
 *
 */
public interface HuanXinIMService {


    /**
     * 注册环信
     * @param userID
     * @return
     * @throws Exception
     */
    public ResponseResult registeID(String userID) throws Exception ;


    /**
     * 重置密码
     * @param user
     * @param newpassword
     * @return
     * @throws Exception
     */
    public IMResultVO resetPassword(RmmmUserInfoEntity user, String newpassword) throws Exception;

    /**
     * 重置呢称
     * @param user
     * @param newNickname
     * @return
     * @throws Exception
     */
    public IMResultVO resetNickname(RmmmUserInfoEntity user, String newNickname) throws Exception;

    /**
     * 通过用户Id 获取 ImId
     * @param userid
     * @return
     */
    public String selectImIdByUserId(Integer userid);

    /**
     * 通过商店id获得IM账号
     * @param shopId
     * @return
     * @throws Exception
     */
    public List<String> getUserCount(Integer shopId) throws Exception;

    /**
     * 发送IM交易信息
     * @throws Exception
     */
    public void sendMessageToIMUser(String[] IMIds, Map<String, String> body) throws Exception;

    /**
	 * 主要作用是在与IM后台通信出错时再进行五次通讯
	 * 
	 * @param user
	 *            修改密码时是原用户实体
	 * @param type
	 *            注册请求为1， 修改密码请求为2
	 * @param huanXinIMID
	 *            注册环信的新账户名
	 * @param newpanewpassword
	 *            修改密码时为新密码
	 * @return
	 * @throws Exception
	 */
	/**
	 *
	 * @param huanxinParam
	 * @return
	 * @throws Exception
	 */
	public ResponseResult faultTolerantIM(HuanxinParam huanxinParam) throws Exception;


    /**
     * 注册用户时注册IM
     * @param usersEntity
     * @param huanXinIMID
     * @return
     * @throws Exception
     */
    public ResponseResult registeIm(RmmmUserInfoEntity usersEntity,String huanXinIMID) throws Exception ;


	/** 
	* @Title: trackUsersStatus 
	* @Description: 查看用户在线状态 
	* @param @param user
	* @param @return
	* @param @throws Exception    设定文件 
	* @return IMResultVO    返回类型 
	* @throws 
	*/
    public String trackUsersStatus(RmmmUserInfoEntity user) throws Exception;

    /**
     * 生成环信账号
     * @return
     * @throws com.rongyi.easy.malllife.exception.HuanXinException
     */
    public String generationIMid()throws HuanXinException;

    public List<String> selectImIdByGuideId(Integer guideId);
    
    /**
	 * 根据不同的事件，发送不同的数据（订单）
	 * 
	 * @param buyerNum
	 * @param orderNum
	 * @param orderEventType
	 * @return
	 * @throws Exception
	 */
	public void sendBodyByOrderEventType(final String buyerNum, final String orderNum, final String orderEventType);
	
	/**
	 * 根据不同的事件，发送不同的数据（退款维权）
	 */
	public void sendBodyByOrderEventType(final Integer applicationId, final String buyerNum, final String orderEventType);
	
	/**
	 * 根据不同的事件，发送不同的数据（购物车订单）
	 * @param orderShopNum 中订单号
	 * @param buyerNum 
	 * @param orderNum 购物车订单号
	 * @param orderEventType
	 * @return
	 * @throws Exception
	 */
	public void sendBodyByShoppingCartOrder(Map<String,Object> map);

}
