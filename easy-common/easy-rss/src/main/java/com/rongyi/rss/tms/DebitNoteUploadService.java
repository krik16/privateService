/** 
* @Title: DebitNoteUploadService.java 
* @Package com.rongyi.rss.tms 
* @Description: 订单小票接口（C2C返佣相关）
* @since C2C version
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月22日 下午3:20:56 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.rss.tms;

import com.rongyi.core.bean.ResponseResult;

/**
 * @author ZhengYl
 *
 */
public interface DebitNoteUploadService {
	/**
	* 卖家上传交易票据(可以反复上传，覆盖之前的上传url)
	* @param pic_urls 交易票据图片URL
	* @param orderNo 订单号
	* @param userId 卖家(导购)Id
	* @return
	*/
	public ResponseResult uploadDebitNote(String pic_urls, String orderNo, String userId);
	
	/**
	 * 小票查询 返回结果DebitNoteVO在ResponseResult的info中
	 * @param orderNo 订单号
	 * @return
	 */
	public ResponseResult queryDebitNote(String orderNo);
}
