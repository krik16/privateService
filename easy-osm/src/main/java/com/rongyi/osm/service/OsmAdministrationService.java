/** 
* @Title: OsmAdministrationService.java 
* @Package com.rongyi.osm.service 
* @Description: 订单状态机管理员维护/监控服务
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月6日 下午2:19:49 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.service;

import javax.annotation.Resource;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.springframework.stereotype.Service;

import com.rongyi.easy.osm.entity.OrderFormEntity;

/**
 * @author ZhengYl
 *
 */
@Service
public class OsmAdministrationService {
	@Resource(name = "ksession")
	private KieSession kSession;
	
	public OrderFormEntity queryGetOrder(String orderNum) {
		QueryResults results = kSession.getQueryResults("getOrder", orderNum);

		for (QueryResultsRow row : results) {
			return (OrderFormEntity) row.get("order");
		}

		return null;
	}

}
