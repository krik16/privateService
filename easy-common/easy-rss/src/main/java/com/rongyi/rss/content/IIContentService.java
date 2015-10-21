package com.rongyi.rss.content;

import com.rongyi.easy.content_v2.entity.ForumContent;
import com.rongyi.easy.content_v2.entity.ForumHomepage;
import com.rongyi.easy.content_v2.entity.ForumPosition;
import com.rongyi.easy.content_v2.param.ForumContentParam;
import com.rongyi.easy.content_v2.param.ForumContentStatusDelParam;
import com.rongyi.easy.content_v2.vo.ForumContentListVo;
import com.rongyi.easy.content_v2.vo.ForumHomeModelVo;
import com.rongyi.easy.content_v2.vo.ForumPostiomModelVo;

import java.util.List;

/**
 * 页面用的接口
 * @author lijing
 * @time 2015-09-07
 *
 */
public interface IIContentService {
	/**
	 * 查询内容管理首页的信息
	 * 
	 */
	public List<ForumHomeModelVo> findHomePage();
	/**
	 * 插入位置
	 * @param list
	 * @return
	 */
	public Boolean savePostions(List<ForumPosition> list);

	/**
	 * 通过id查询首页信息
	 * @param id
	 * @return
	 */
	public ForumHomepage findHomepageById(Integer id);
	/**
	 * 修改顺序位置
	 * @param fhp
	 * @return
	 */
	public Boolean updateHomeSortIdx(ForumHomepage fhp) throws Exception;
	
	/**
	 * 修改内容首页状态
	 * @param fhp
	 * @return
	 */
	public Boolean updateHomeStatus(ForumHomepage fhp) throws Exception;
	
	/**
	 * 查询总条数
	 * @return 
	 */
	public int findHomePageCount();
	
	/**
	 * 修改位置表的修改人
	 * @param fp
	 * @return
	 */
	public Boolean updatePositionUpdateUser(ForumPosition fp) throws Exception;
	
	/**
	 * 通过首页id查询每个模版的位置信息
	 * @param id
	 * @return
	 */
	public List<ForumPosition> findPositionAllByHomePId(Integer id);
	
	/**
	 * 通过查询条件 查询位置下的内容
	 * @param fcp
	 * @return
	 */
	public List<ForumContentListVo> findContentAllByParam(ForumContentParam fcp);
	
	/**
	 * 通过id删除内容信息
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean deleteContentById(ForumContentStatusDelParam fc) throws Exception;
	
	/**
	 * 通过id，status修改状态！
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean updateStatusContentByIdStatus(ForumContentStatusDelParam fc) throws Exception;
	
	/**
	 * 通过id查询内容详情
	 * @param id
	 * @return
	 */
	public ForumContent findContentOneById(Integer id);
	/**
	 * 通过位置id查询模版信息
	 * @param id
	 * @return
	 */
	public ForumPostiomModelVo findModelByPostionId(Integer id);
	/**
	 * 增加内容
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean saveContent(ForumContent fc)throws Exception;

	/**
	 * 新增类容
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean saveContents(List<ForumContent> fc)throws Exception;
	/**
	 * 删除内容
	 * @param fc
	 * @return
	 * @throws Exception
	 */
	public Boolean updateContent(ForumContent fc)throws Exception;
	
	/**
	 * 通过查询条件 查询位置下的内容 总数量
	 * @param fcp
	 * @return
	 */
	public Long findContentCountAllByParam(ForumContentParam fcp);

	/**
	 * 判断在同一位置、同一区域、同一发布时间段内是否有内容
	 * @param fc
	 * @return
	 */
	List<String> hasContent(ForumContent fc);
	/**
	 * 修改 位置时间
	 * @param fp
	 * @return
	 */
	public Boolean updateOptionById(ForumPosition fp);

	/**
	 * 判断买手id 是否在同一位置，同一区域有
	 */
	List<String> hasBuyerLive(ForumContent fc);
}
