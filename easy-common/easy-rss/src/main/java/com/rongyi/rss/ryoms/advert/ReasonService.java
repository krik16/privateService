/**   
* @Title: ConfigService.java 
* @Package com.rongyi.rss.ryoms.advert 
* @Description: 参数配置管理接口
* @author wangjh
* @date 2016年2月15日 下午4:38:09 
* @version V1.0   
*/
package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.vo.ReasonVO;

/**
 * @Description: 理由管理接口
 * @author wangjh
 * @date 2016年2月19日
 */
public interface ReasonService {

	/**
	 * 添加
	 * 
	 * @param srcId
	 *            来源Id
	 * @param srcType
	 *            来源类型
	 * @param content
	 *            内容
	 * @param userId
	 *            用户ID
	 * @return
	 */
	public int add(int srcId, int srcType, String content, int userId);

	/**
	 * TOP列表(最新5条)
	 * 
	 * @param srcId
	 *            来源Id
	 * @param srcType
	 *            来源类型
	 * @return
	 */
	public List<ReasonVO> topList(int srcId, int srcType);
}