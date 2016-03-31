package com.rongyi.rss.malllife.service;

import net.sf.json.JSONObject;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.malllife.entity.Activity;

public interface IKanjiaService {

	/**
	 * 砍价
	 * @param activity
	 * @return
	 */
	public ResponseVO discountPrice(Activity activity);


	/**
	 * 是否砍价成功
	 * @param activity
	 * @return
	 */
	public ResponseVO isKanJia(Activity activity);
	/**
	 * 砍价记录
	 * @param activity
	 * @return
	 */
	public ResponseVO selectRecord(Activity activity);
	/**
	 * 发送红包
	 * @param activity
	 * @return
	 */
	public ResponseVO sendEnvelope( Activity activity);
	
	/**
	 * 优惠信息
	 * @param activity
	 * @return
	 */
	public JSONObject discountInfo(Activity activity);
	
	/**
	 * 好友帮
	 * @param activity
	 * @return
	 */
	ResponseVO helpFriend(Activity activity);
 /**
  * 查询活动信息id
  * @param activity
  * @return
  */
	public Activity selectActivityId(Activity activity);
	
	public ResponseVO getRecordList(Activity activity);

}
