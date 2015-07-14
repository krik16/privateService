/** 
* @Title: DrawApplyRules.java 
* @Package com.rongyi.va.constants 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月25日 上午11:38:28 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rongyi.rss.gcc.RmmmSettingsService;

/**
 * @author ZhengYl
 *
 */
@Component
public class DrawApplyRules {
	private int drawApplyTimesLimit = 2;//default draw times limit

	@Autowired
	private RmmmSettingsService rmmmSettingsService;

	public int getDrawApplyTimesLimit() {
		return drawApplyTimesLimit;
	}

	public void setDrawApplyTimesLimit(int drawApplyTimesLimit) {
		this.drawApplyTimesLimit = drawApplyTimesLimit;
	}
}
