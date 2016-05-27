package com.rongyi.rss.malllife.roa.user;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.pojo.InvitationUserInfoPojo;
import com.rongyi.easy.usercenter.dto.malllife.MalllifeUserInfoDto;
import com.rongyi.easy.usercenter.entity.MalllifeUserInfoEntity;
import com.rongyi.easy.malllife.param.MalllifeUser;
import com.rongyi.easy.malllife.pojo.BuyerInfoPojo;
import com.rongyi.easy.malllife.vo.UserInfoVO;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/6/1
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/1              1.0            创建文件
 *
 */
public interface ROAMalllifeUserService {

	public MalllifeUserInfoEntity getEntityByUid(String userId) throws Exception;

	/**
	 * 注册用户
	 * 
	 * @param malllifeUser
	 * @throws Exception
	 */
	public String registUser(MalllifeUser malllifeUser) throws Exception;

	/**
	 *
	 * @param malllifeUser 注册信息
	 * @return 0失败 >0成功
	 * @throws Exception
	 */
	public String registMaillLifeUser(MalllifeUser malllifeUser) throws Exception;

	/**
	 * 根据用户Id查询 uuid
	 * 
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public UserInfoVO getByUid(String uid) throws Exception;

	/**
	 * 根据用户手机号查询
	 * 
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public UserInfoVO getByPhone(String phone) throws Exception;


	/**
	 * 返回部分数据
	 * @param IdorPhone 用户Id 和手机号
	 * @param type 0用户ID 1手机号
	 * @param flag 0不返回收藏商品编号 1返回 兼容老接口
	 * @return
	 * @throws Exception
	 */
	public MalllifeUserInfoDto getByIdorPhone(String IdorPhone,int type,int flag) throws Exception;

	/**
	 * 根据im_id查询摩生活用户
	 *
	 * @param imId
	 * @return
	 * @throws Exception
	 */
	public MalllifeUserInfoEntity getUserByIMId(String imId) throws Exception;

	/**
	 * 更新用户信息
	 * 
	 * @param malllifeUser
	 * @throws Exception
	 */
	public void update(MalllifeUser malllifeUser) throws Exception;

	/**
	 * 注册IM账号
	 * 
	 * @param userId
	 * @param imUser
	 * @throws Exception
	 */
	public void updateImUser(String userId, String imUser) throws Exception;

	/**
	 * 第三方登录，若openId不存在，则新建一个用户
	 * 
	 * @param malllifeUser
	 * @return
	 * @throws Exception
	 */
	public UserInfoVO thirdLogin(MalllifeUser malllifeUser) throws Exception;

	/**
	 * 用户名是：phone和name 密码：encrypted_password
	 * 
	 * @param openId
	 * @return
	 * @throws Exception
	 */
	public UserInfoVO getByOpenId(String openId) throws Exception;

	/**
	 * 判断当前设备号是否可以注册
	 * 
	 * @param devuuid 设备uuid
	 *@param      idfa
	 * @return true 可以注册 false不能注册
	 * @throws Exception
	 */
	public Boolean isExistBydevUuid(String devuuid,String idfa) throws Exception;

/*	*//**
	 * @param collectCommoditys
	 * @param userId
	 * @throws Exception
	 *//*
	public void collectCommodity(Set<String> collectCommoditys, ObjectId userId) throws Exception;*/

	/**
	 * 根据买家姓名模糊查询买家信息
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<UserInfoVO> getUserDetailByName(String name) throws Exception;
	/**
	 * 根据昵称模糊查询买家信息
	 * 
	 * @param nickname
	 * @return
	 * @throws Exception
	 */
	public List<UserInfoVO> getUserDetailByNickname(String nickname);

	/**
	 * 通过昵称或者用户名查询用户列表
	 * @param nickname
	 * @param username
	 * @return
	 */
	public List<UserInfoVO> getUsersByNicknameUsername(String nickname, String username);


	/**
	 * 登录后修改相关信息 (登录时间，登录)
	 * @param malllifeUser
	 * @throws Exception
	 */
	public void updatelogin(MalllifeUser malllifeUser) throws Exception;


	/**
	 * 根据id列表批量取出用户信息
	 * @param idList
	 * @return
	 */
	public Map<String,UserInfoVO> getUserListByIdList(List<String> idList);
	
	/**
	 * 判断容易逛用户是否被邀请来的
	 * @param userId
	 * @return
	 */

	/**
	 * type = 1  是容易逛， type = 2 是摩店
	 * 判断容易逛用户是否被邀请来的
	 * @return 如果没有 返回
	 */
	public InvitationUserInfoPojo getUserIsByShare(String userId,int type);


	/**
	 * 分享红包 判断返回 用户ID
	 * @param phone 手机
	 * @param channel  来源渠道  ShareRed 分享红包
	 * @return  正常返回 userId  禁用返回 disable
     */
	public String genUserId(String phone,String channel)throws Exception ;

	/**
	 * 查询所有状态的用户信息 包含预注册
	 * @param phone
	 * @return
	 * @throws Exception
	 */
	public UserInfoVO findAllStateUserByPhone(String phone) throws Exception;
}
