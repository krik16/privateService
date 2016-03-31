/** 
* @Title: BonusSearchService.java 
* @Package com.rongyi.rss.tms 
* @Description: 奖金查询接口
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月5日 下午3:12:18 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.va;

import com.rongyi.easy.tms.vo.BonusListVO;
import com.rongyi.easy.tms.vo.DrawApplySearchParam;

/**
 * @author ZhengYl
 *
 */
public interface BonusSearchService {
	
	/** 奖励佣金列表查询
	 * 
	 * @author ZhengYl
	 * @date 2015年6月5日 下午3:12:54 
	 * @param param
	 * @return
	 */
	public BonusListVO bonusListSearch(DrawApplySearchParam param);
}
