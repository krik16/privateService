/**
 * @Title: DrawApplySearchServiceImpl.java
 * @Package com.rongyi.tms.service.impl
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月28日 下午1:13:02
 * @version V1.0
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.constant.Constants;
import com.rongyi.easy.tms.vo.DrawApplyListVO;
import com.rongyi.easy.tms.vo.DrawApplySearchParam;
import com.rongyi.rss.tms.DrawApplySearchService;
import com.rongyi.tms.service.DrawApplyService;

/**
 * @author ZhengYl
 *
 */
@Service
public class DrawApplySearchServiceImpl implements DrawApplySearchService {
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private DrawApplyService drawApplyService;

	/* (non-Javadoc)
	* @param param
	* @return
	* @see com.rongyi.rss.tms.DrawApplySearchService#drawApplySearch(com.rongyi.easy.tms.vo.DrawApplySearchParam)
	*/
	@Override
	public DrawApplyListVO drawApplySearch(DrawApplySearchParam param) {
		DrawApplyListVO result = new DrawApplyListVO();
		Map<String, Object> searchMap = new HashMap<String, Object>();
		searchMap.put("userId", param.getUserId());
		searchMap.put("currentPage", param.getCurrentPage());
		searchMap.put("pageSize", param.getPageSize());

		Integer progress[] = { 0, 1, 2 };
		Integer done[] = { 3 };
		Integer failed[] = { -1, -2 };

		if (param.getStatus() == Constants.DrawApplyStatus.PROCESSING) {
			searchMap.put("status", progress);
		} else if (param.getStatus() == Constants.DrawApplyStatus.SEND) {
			searchMap.put("status", done);
		} else if (param.getStatus() == Constants.DrawApplyStatus.FAIL) {
			searchMap.put("status", failed);
		}

		if (param.getTimeRange() == Constants.TMSTimeRangeType.DAY) {
			searchMap.put("dayRange", 1);
		} else if (param.getTimeRange() == Constants.TMSTimeRangeType.WEEK) {
			searchMap.put("weekRange", 1);
		} else if (param.getTimeRange() == Constants.TMSTimeRangeType.MONTH) {
			searchMap.put("monthRange", 1);
		}
		try {
			result = drawApplyService.selectDrawApplyList(searchMap);

		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}

}
