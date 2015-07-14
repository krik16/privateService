/** 
 * @Title: SessionUtil.java 
 * @Package com.rongyi.osm.knowledge 
 * @Description: drools CURD
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年6月9日 下午2:46:58 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.osm.knowledge;

import javax.annotation.Resource;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rongyi.osm.constant.DroolsOperateType;
import com.rongyi.osm.mq.OSMFactSender;
import com.rongyi.osm.mq.SpringAmqpSender;

/**
 * @author ZhengYl
 * 
 */
@Component
public class SessionUtil {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "ksession")
	private KieSession kSession;

	@Autowired
	private OSMFactSender factSender;

	@Autowired
	private SpringAmqpSender mSender;

	/**
	 * drools 插入事实
	 * 
	 * @author ZhengYl
	 * @date 2015年6月10日 上午11:05:56
	 * @param object
	 */
	public void insert(Object object) {
		try {
			kSession.insert(object);
			factSender.sendFact(object, DroolsOperateType.INSERT);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	/**
	 * drools 更新事实
	 * 
	 * @author ZhengYl
	 * @date 2015年6月10日 上午11:05:53
	 * @param object
	 */
	public void update(Object object) {
		try {
			FactHandle handle = kSession.getFactHandle(object);
			kSession.update(handle, object);
			factSender.sendFact(object, DroolsOperateType.UPDATE);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	/**
	 * drools 删除事实
	 * 
	 * @author ZhengYl
	 * @date 2015年6月10日 上午11:05:59
	 * @param object
	 */
	public void delete(Object object) {
		try {
			FactHandle handle = kSession.getFactHandle(object);
			kSession.delete(handle);
			factSender.sendFact(object, DroolsOperateType.DELETE);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
}
