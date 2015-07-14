/** 
* @Title: OrderIsCommentEvent.java 
* @Package com.rongyi.osm.knowledge 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月12日 下午4:04:23 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.knowledge;

import net.sf.json.JSONObject;

/**
 * @author ZhengYl
 *
 */
public class OrderIsCommentEvent extends UserEvent {
	/**  */
	private static final long serialVersionUID = 2642910362226941668L;

	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);
				
		@SuppressWarnings("unused")
		JSONObject param = getBody();
		
	}
	
	@Override
	public String getName() {
		return "买家评价";
	}

}
