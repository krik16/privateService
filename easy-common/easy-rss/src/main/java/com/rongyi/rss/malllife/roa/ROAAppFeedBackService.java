/** 
* @Title: MallLifeAppFeedBackService.java 
* @Package com.rongyi.rss.malllife 
* @Description: TODO
* @author 朱泽 zhuze@rongyi.com
* @date 2015年6月4日 下午3:20:52 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.malllife.roa;

import com.rongyi.easy.malllife.domain.AppFeedBack;

/** 
 * 
 */
public interface  ROAAppFeedBackService {

	/**
	 * @param feedBack
	 * @return
	 */
	public String addFeedBack(AppFeedBack feedBack);

}
