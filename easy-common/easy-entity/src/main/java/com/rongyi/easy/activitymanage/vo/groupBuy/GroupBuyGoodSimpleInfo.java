package com.rongyi.easy.activitymanage.vo.groupBuy;

/***
 * 拼团活动  H5页面商品简要信息
 * @author caohongjiang
 *
 */
public class GroupBuyGoodSimpleInfo {
	
	/***
	 * 商品名
	 */
	private String goodId;
	
	
	/***
	 * 商品名
	 */
	private String goodName;
	
	/***
	 * 拼团价格
	 */
	private int goodActivityPrice;
	
	/***
	 * 成团人数  :3人团   5 人团
	 */
	private int  groupLimit;
	

	/***
	 * 排序
	 */
	private int  level;
	
	
	
	/***
	 * 开团限制次数
	 */
	private int  openGroupLimit;
	
	
	/***
	 * 参团限制次数
	 */
	private int  joinGroupLimit;
	
	/***
	 * 活动总剩余库存
	 */
	private int  totalRemainCount;
	
	
	/***
	 * 活动总参加库存
	 */
	private int  totalCount;
	
	
	
	
	
}
