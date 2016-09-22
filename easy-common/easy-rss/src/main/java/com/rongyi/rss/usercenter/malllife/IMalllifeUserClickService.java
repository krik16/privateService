package com.rongyi.rss.usercenter.malllife;

import com.rongyi.easy.usercenter.entity.MalllifeUserClickEntity;

public interface IMalllifeUserClickService {
	
	/**
	 * 添加用户点赞记录
	 * @param type    类型，如article/activity/sameCity: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param devId   设备号
	 * @param status  0:点赞 1:取消点赞 
	 * @return
	 * @throws Exception
	 */
	public int insert(String type,String clickId,String devId,Integer status) throws Exception;
	
	/**
	 * 查询用户点赞记录
	 * @param type    类型，如article/activity/sameCity: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param devId   设备号
	 * @return
	 * @throws Exception
	 */
	public MalllifeUserClickEntity selectClickByDevId(String type,String clickId,String devId) throws Exception;
	
	/**
	 * 修改用户点赞记录状态
	 * @param type    类型，如article/activity/sameCity: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param devId   设备号
	 * @param status  0:点赞 1:取消点赞 
	 * @return
	 * @throws Exception
	 */
	public int updateClickByDevId(String type,String clickId,String devId,Integer status) throws Exception;
	
	/**
	 * 查询活动点赞数量
	 * @param type    类型，如article/activity/sameCity: 文章/活动/同城
	 * @param clickId 点赞活动id，如 文章/活动/同城的id
	 * @param status  0:点赞 1:取消点赞 
	 * @return
	 * @throws Exception
	 */
	public int selectCountByClickId(String type,String clickId,Integer status) throws Exception;

}
