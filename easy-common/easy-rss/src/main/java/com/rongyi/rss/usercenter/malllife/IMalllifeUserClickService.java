package com.rongyi.rss.usercenter.malllife;

import com.rongyi.easy.usercenter.entity.MalllifeUserClickEntity;

public interface IMalllifeUserClickService {
	
	/**
	 * 添加用户点赞记录
	 * @param type    类型，0: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param userId  用户id
	 * @param devId   设备号
	 * @param status  0:点赞 1:取消点赞 
	 * @return
	 * @throws Exception
	 */
	public int insert(Integer type,String clickId,String devId,Integer status,String userId) throws Exception;
	
	/**
	 * 查询用户点赞记录
	 * @param type    类型，0: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param devId   设备号
	 * @return
	 * @throws Exception
	 */
	public MalllifeUserClickEntity selectClickByDevId(Integer type,String clickId,String devId) throws Exception;
	
	/**
	 * 修改用户点赞记录状态
	 * @param type    类型，0: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param userId  用户id
	 * @param devId   设备号
	 * @param status  0:点赞 1:取消点赞 
	 * @return
	 * @throws Exception
	 */
	public int updateClickByDevId(Integer type,String clickId,String devId,Integer status,String userId) throws Exception;
	
	/**
	 * 查询活动点赞数量
	 * @param type    类型，0: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param status  0:点赞 1:取消点赞 
	 * @return
	 * @throws Exception
	 */
	public int selectCountByClickId(Integer type,String clickId,Integer status) throws Exception;

}
