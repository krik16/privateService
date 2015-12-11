package com.rongyi.rss.content;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.content.entity.param.FlashPurchaseParam;

/**
 * 
* @ClassName: IFlashPurchaseService 
* @Description: 闪购list
* @author shaozhou 
* @date 2015年11月18日 下午8:26:35 
*
 */
public interface IFlashPurchaseService {
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
	public ResponseVO pagingContentForumList(FlashPurchaseParam param) throws Exception;
}
