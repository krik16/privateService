/**
 * 
 */
package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.entity.AppVersionInfoEntity;
import com.rongyi.easy.rmmm.param.AppVersionParam;
import com.rongyi.easy.rmmm.vo.AppVersionVO;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年6月8日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年6月8日               1.0              创建文件
 */
public interface IAppVersionService {
	
	/**
	 * 通过deviceType和appName查找
	 * @param deviceType
	 * @param appName
	 * @return
	 */
	public AppVersionInfoEntity getAppVersionByApp(String deviceType, String appName) throws Exception;
	
	/**
	 * 判断app是否需要更新
	 * @return
	 * @throws Exception
	 */
	public AppVersionVO judgeAppIfUpdate(AppVersionParam param) throws Exception;

}
