package com.rongyi.rss.content;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content.entity.param.SpecialCellParam;

/**
 * 
* @ClassName: ISpecialSellService 
* @Description: 特卖列表查询接口
* @author shaozhou 
* @date 2015年11月18日 上午11:11:42 
*
 */
public interface ISpecialSellService {
	/**
	 * 
	* @Title: pagingContentForumList 
	* @Description: 查询list
	* @param @param param
	* @param @return
	* @param @throws Exception    设定文件 
	* @return ResponseVO    返回类型 
	* @author shaozhou 
	* @date 2015年11月18日 下午8:25:10
	* @throws
	 */
	public ResponseVO pagingContentForumList(SpecialCellParam param) throws Exception;
}
