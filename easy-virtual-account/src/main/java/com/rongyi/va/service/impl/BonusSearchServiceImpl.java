/** 
* @Title: BonusSearchServiceImpl.java 
* @Package com.rongyi.va.service.impl 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月18日 上午10:48:04 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.constant.Constants;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.vo.BonusListVO;
import com.rongyi.easy.tms.vo.DrawApplySearchParam;
import com.rongyi.rss.va.BonusSearchService;
import com.rongyi.va.constants.VirtualAccountDetailTypes;
import com.rongyi.va.service.VirtualAccountDetailService;

/**
 * @author ZhengYl
 *
 */
@Service
public class BonusSearchServiceImpl extends BaseServiceImpl implements BonusSearchService {

	@Autowired
	private VirtualAccountDetailService virtualAccountDetailService;

	/* (non-Javadoc) 
	* @param param
	* @return 
	* @see com.rongyi.rss.va.BonusSearchService#bonusListSearch(com.rongyi.easy.tms.vo.DrawApplySearchParam) 
	*/
	public BonusListVO bonusListSearch(DrawApplySearchParam param) {
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("userId", param.getUserId());
		searchMap.put("currentPage", param.getCurrentPage());
		searchMap.put("pageStart", param.getCurrentPage() * param.getPageSize());
		searchMap.put("pageSize", param.getPageSize());
		searchMap.put("detailType", VirtualAccountDetailTypes.BONUS);

		if (param.getTimeRange() != null) {
			if (param.getTimeRange() == Constants.TMSTimeRangeType.DAY) {
				searchMap.put("dayRange", 1);
			} else if (param.getTimeRange() == Constants.TMSTimeRangeType.WEEK) {
				searchMap.put("weekRange", 1);
			} else if (param.getTimeRange() == Constants.TMSTimeRangeType.MONTH) {
				searchMap.put("monthRange", 1);
			}
		}

		return virtualAccountDetailService.selectBonusByUserId(searchMap);
	}

}
