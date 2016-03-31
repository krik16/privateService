package com.rongyi.rss.mallshop.content;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.content.entity.ContentInfo;
import com.rongyi.easy.content.entity.UserEntity;
import com.rongyi.easy.content.entity.vo.ContentInfoVO;

public interface ROAContentInfoService {
	
	/**
	 * 通过板块代码，获取商品编号集合
	 * @param forumCode
	 * @return
	 * @throws Exception
	 */
	public List<String> selectcontentTypeIdListByForumCode(String forumCode) throws Exception;
	
	public Integer getTotalRecord(Map<String, Object> paraMap) throws Exception;
	
	public List<ContentInfoVO> pagingContentInfoList(Map<String, Object> paraMap) throws Exception;
	
	public List<ContentInfoVO> getContentInfoByContentForumId(Integer contentForumId) throws Exception;
	
	public ContentInfo updateContentInfoById(ContentInfo contentInfo,UserEntity user);
	
	public  ContentInfo getContentInfoById(Integer id);
	
	public void updateSysDocPic(ContentInfo contentInfo, String[] sysDocPics,UserEntity user) throws Exception;
}
