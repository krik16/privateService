package com.rongyi.rss.roa;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.content.entity.ContentHelp;
import com.rongyi.easy.content.entity.ContentHelpCategory;
import com.rongyi.easy.content.entity.param.ContentHelpParam;

import java.util.List;
import java.util.Map;

public interface ROAContentHelpService {
	
	public ResponseResult getContentHelpInfoDetail(Integer helpId) throws Exception;
	
	public ResponseResult getHelpCateInfo(Integer type) throws Exception;
	
	public ResponseResult getContentHelpList(ContentHelpParam param,Integer categoryId) throws Exception;
	/**
	 * 根据id查帮助中心信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ContentHelp getHelpInfoById(Integer id) throws Exception;
	/**
	 * 根据帮助标题查找帮助信息
	 * @return
	 * @throws Exception
	 */
    public ContentHelp getContentHelpInfoDetail(String helpTitle) throws Exception;
    /**
	 * 获取所有的帮助中心信息
	 * @return
	 * @throws Exception
	 */
	public List<ContentHelp> getAll(Map<String, Object> map) throws Exception;
	/**
	 * 获取所有帮助中心列表数量
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecord() throws Exception;
	/**
	 * 根据标题模糊查询获取帮助中心列表
	 * @return
	 * @throws Exception
	 */
	public List<ContentHelp> getHelpInfoByName(Map<String, Object> paraMap) throws Exception;
	/**
	 * 根据标题模糊查询获取列表总数量
	 * @return
	 * @throws Exception
	 */
	public Integer getTotalRecordByName(Map<String, Object> paraMap) throws Exception;
	/**
	 * 修改帮助中心信息
	 * @param map
	 * @throws Exception
	 */
	public void updateHelpInfoById(Map<String,Object> map) throws Exception;
	/**
	 * 新建帮助中心信息
	 * @throws Exception
	 */
	public void insertHelpInfo(ContentHelp entity) throws Exception;
	/**
	 * 删除该条信息（根据id将对应的信息变成禁用态）
	 * @param id
	 * @throws Exception
	 */
	public void deleteHelpInfo(Integer id) throws Exception;
	/**
	 * 根据分类id获取帮助信息
	 * @param paraMap
	 * @return
	 */
	public List<ContentHelp> getHelps(Map<String, Object> paraMap) throws Exception;
	/**
	 * 根据id查帮助中心分类信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ContentHelpCategory getHelpCategoryInfo(Integer id) throws Exception;
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ContentHelpCategory> selectByStatus() throws Exception;
}
