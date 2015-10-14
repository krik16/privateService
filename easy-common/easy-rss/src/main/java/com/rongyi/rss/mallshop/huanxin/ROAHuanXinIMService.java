/**
 * 
 */
package com.rongyi.rss.mallshop.huanxin;

import java.util.List;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface ROAHuanXinIMService {
	
	/**
     * 通过用户Id 获取 ImId
     * @param userid
     * @return
     */
    public String selectImIdByUserId(Integer userid);
    
    /**
     * 通过商店id获得IM账号
     * @param shopId
     * @return
     * @throws Exception
     */
    public List<String> getUserCount(Integer shopId) throws Exception;

}
