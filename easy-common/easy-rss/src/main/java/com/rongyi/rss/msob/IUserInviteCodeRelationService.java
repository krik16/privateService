package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.UserInviteCodeRelationEntity;

public interface IUserInviteCodeRelationService {
	
	/**
	 * 根据手机号和注册的类型来查邀请码信息
	 * @param phone
	 * @param registerType
	 * @return
	 * @throws Exception
	 */
	public UserInviteCodeRelationEntity getUserInviteCodeRelationInfo(String phone,Integer registerType) throws Exception;
	/**
	 * 将手机号与邀请码关联起来
	 * @param phone
	 * @param inviteCode
	 * @param registerType
	 * @return
	 * @throws Exception
	 */
	public int insertUserInviteCodeRelation(String phone,String inviteCode,Integer registerType) throws Exception;
	/**
	 * 修改手机号和邀请码关联信息
	 * @param inviteCode
	 * @return
	 * @throws Exception
	 */
	public int updateUserInviteCodeRelation(String inviteCode,Integer id) throws Exception;
	/**
     * 将用户关联的邀请码设置为禁用状态
     * @param phone
     */
	public void updateUserInviteCodeRelation(String phone) throws Exception;
}
