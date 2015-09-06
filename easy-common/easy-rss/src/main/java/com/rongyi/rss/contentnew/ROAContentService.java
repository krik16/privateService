package com.rongyi.rss.contentnew;

import java.util.List;

import com.rongyi.easy.contentnew.entity.ForumHomepage;
import com.rongyi.easy.contentnew.entity.vo.ForumHomeModelVo;

/**
 * 内容管理的接口
 * @author lijing
 * @time 2015-09-01
 *
 */
public interface ROAContentService {
	
	/**
	 * 查询内容管理首页的信息
	 * 
	 */
	public List<ForumHomeModelVo> findHomePage();
	
	/**
	 * 修改顺序位置
	 * @param fhp
	 * @return
	 */
	public Boolean updateHomeSortIdx(ForumHomepage fhp);
	
	/**
	 * 修改内容首页状态
	 * @param fhp
	 * @return
	 */
	public Boolean updateHomeStatus(ForumHomepage fhp);
	
	
	
}
