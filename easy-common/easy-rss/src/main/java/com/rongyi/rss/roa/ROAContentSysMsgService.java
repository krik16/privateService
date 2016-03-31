package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.content.entity.ContentSysMsg;

public interface ROAContentSysMsgService {
	
	/**
	 * 根据id查系统消息信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ContentSysMsg getMsgInfoById(Integer id) throws Exception;
	/**
	 * 获取所有的系统消息信息
	 * @return
	 * @throws Exception
	 */
	public List<ContentSysMsg> getAllMsgInfo(Map<String, Object> map) throws Exception;
	/**
	 * 获取所有系统消息列表数量
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecord() throws Exception;
	/**
	 * 根据标题和状态模糊查询获取系统消息列表
	 * @return
	 * @throws Exception
	 */
	public List<ContentSysMsg> getMsgInfoByName(Map<String, Object> paraMap) throws Exception;
	/**
	 * 根据标题和状态模糊查询获取列表总数量
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecordByName(Map<String, Object> paraMap) throws Exception;
	/**
	 * 根据标题和状态模糊查询获取系统消息列表
	 * @return
	 * @throws Exception
	 */
	public List<ContentSysMsg> getMsgInfoByNameAndStatus(Map<String, Object> paraMap) throws Exception;
	/**
	 * 根据标题和状态模糊查询获取列表总数量
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecordByNameAndStatus(Map<String, Object> paraMap) throws Exception;
	/**
	 * 修改帮助中心信息
	 * @throws Exception
	 */
	public void updateMsgInfoById(Map<String, Object> resultMap) throws Exception;
	/**
	 * 新建帮助中心信息
	 * @param user
	 * @throws Exception
	 */
	public void insertMsgInfo(ContentSysMsg entity) throws Exception;
	/**
	 * 删除该条信息（根据id将对应的信息变成禁用态）
	 * @param id
	 * @throws Exception
	 */
	public void deleteMsgInfo(Integer id) throws Exception;
}
