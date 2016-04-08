/**   
* @Title: IMallService.java 
* @Package com.rongyi.rss.shop 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年11月28日 下午12:56:10 
* @version V1.0   
*/
package com.rongyi.rss.shop;

import org.bson.types.ObjectId;

import java.util.List;

/**
 * @ClassName: IMallService 
 * @Description: 合作商场查询
 * @author wzh
 * @date 2015年11月28日 下午12:56:10 
 *  
 */
public interface IMallService {
	
	public int selectMallIdByMongId(String mallMid);
}
