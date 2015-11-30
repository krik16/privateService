package com.rongyi.rss.content;

import java.util.List;

import com.rongyi.easy.content.entity.param.SpecialCellParam;
import com.rongyi.easy.content_v2.entity.ForumContent;
import com.rongyi.easy.content_v2.entity.ForumHomepage;
import com.rongyi.easy.content_v2.entity.ForumPosition;
import com.rongyi.easy.content_v2.entity.ForumStick;
import com.rongyi.easy.content_v2.param.FlashSellParam;
import com.rongyi.easy.content_v2.param.ForumContentParam;
import com.rongyi.easy.content_v2.param.ForumContentStatusDelParam;
import com.rongyi.easy.content_v2.param.SpecailParam;
import com.rongyi.easy.content_v2.vo.ForumContentListVo;
import com.rongyi.easy.content_v2.vo.ForumHomeModelVo;
import com.rongyi.easy.content_v2.vo.ForumPostiomModelVo;

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
	public List<ForumHomeModelVo> findHomePage(int type);

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
	public int findHomePageCount(int type);
	
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
	 * 批量插入内容
	 * @param fcs
	 * @return
	 */
	public Boolean saveContents(List<ForumContent> fcs);
	
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
	 * 判断在同一位置、同一区域是否有内容 买手直播
	 * @param fc
	 * @return
	 */
	public List<String> hasBuyerLive(ForumContent fc);
	/**
	 * 修改是否置顶
	 * @param fc
	 * @return
	 */
	public Boolean updateStickById(ForumStick fs);
	/**
	 * 
	* @Title: findHomePageApp 
	* @Description: 根据type类型和code查询唯一的homePage
	* @param @param i
	* @param @param string
	* @param @return    设定文件 
	* @return ForumHomeModelVo    返回类型 
	* @author shaozhou 
	* @date 2015年11月30日 下午12:36:05
	* @throws
	 */
	public ForumHomeModelVo findHomePageApp(int i, String string);
	/**
	 * 
	* @Title: findContentCountAllBySpecail 
	* @Description: 查询特卖列表count
	* @param @param param
	* @param @return    设定文件 
	* @return Long    返回类型 
	* @author shaozhou 
	* @date 2015年11月30日 下午4:33:46
	* @throws
	 */
	public Long findContentCountAllBySpecail(SpecailParam par);
	/**
	 * 
	* @Title: findContentAllBySpecail 
	* @Description: 查询特卖列表list
	* @param @param param
	* @param @return    设定文件 
	* @return List<ForumContentListVo>    返回类型 
	* @author shaozhou 
	* @date 2015年11月30日 下午4:42:24
	* @throws
	 */
	public List<ForumContentListVo> findContentAllBySpecail(SpecailParam par);
	/**
	 * 
	* @Title: findContentCountAllByParamFlush 
	* @Description: app查询闪购推荐列表count
	* @param @param par
	* @param @return    设定文件 
	* @return Long    返回类型 
	* @author shaozhou 
	* @date 2015年11月30日 下午5:10:55
	* @throws
	 */
	public Long findContentCountAllByParamFlush(FlashSellParam par);
	/**
	 * 
	* @Title: findContentAllByParamFlush 
	* @Description: app查询闪购推荐列表list
	* @param @param par
	* @param @return    设定文件 
	* @return List<ForumContentListVo>    返回类型 
	* @author shaozhou 
	* @date 2015年11月30日 下午5:11:14
	* @throws
	 */
	public List<ForumContentListVo> findContentAllByParamFlush(FlashSellParam par);
	
}
