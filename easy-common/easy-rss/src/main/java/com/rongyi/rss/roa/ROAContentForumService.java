package com.rongyi.rss.roa;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.content.entity.ContentForum;
import com.rongyi.easy.content.entity.UserEntity;
import com.rongyi.easy.content.entity.param.ContentForumParam;
import com.rongyi.easy.content.entity.vo.ContentInfo1ListVO;
/**
 * 推荐版块根据版块代码查询版块内容接口
 * @author WZH
 *
 */

public interface ROAContentForumService extends Serializable{
	
	public static final long serialVersionUID = 1L;
	
	public ContentInfo1ListVO getContentForumByForumCode(ContentForumParam param) throws Exception;
	
	public Integer getTotalRecord(Map<String, Object> paraMap) throws Exception;

	public List<ContentForum> pagingContentForumList(Map<String, Object> paraMap) throws Exception;
	
	public void updateContentForumById(ContentForum contentForum,UserEntity user) throws Exception;
	
	public ContentForum getContentForumById(Integer contentForumId) throws Exception;
}
