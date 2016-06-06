package com.rongyi.rss.sensitivewords;

import java.util.HashMap;

/**
 * Created by xgq on 2016/1/21.
 */
public interface SensitiveWordsFilterService {

	/**
	 * 检查是否包含敏感词【不建议使用，建议使用checkSensitiveWords(String content, SensitiveWordsType type)】
	 * @param content
	 * @param type    1为评论  2为商品名称 3昵称
	 * @return true表示包含敏感词；false表示不包含敏感词
	 */
	@Deprecated
	public boolean checkSensitiveWords(String content, int type);

    /**
     * 检查是否包含敏感词
     * @param content
     * @param type    1为评论 2为商品名称 3昵称 4商品描述 5商品规格 6卡券名称 7卡券使用限制 8卡券使用方式 9店铺公告 10直播名称 11买手介绍
     * @return true表示包含敏感词；false表示不包含敏感词
     */
    public boolean checkSensitiveWords(String content, SensitiveWordsType type);

    
    /**
     * 关键词过滤类型
     * @author liulei
     */
    public enum SensitiveWordsType {
    	/** 关键词过滤类型：未知类型 **/
    	DEFAULT(0, 					"未知类型"),
    	/** 关键词过滤类型：评论 **/
    	COMMENTS(1, 				"评论"),
    	/** 关键词过滤类型：昵称 **/
    	NICK_NAME(3, 				"昵称"),
    	/** 关键词过滤类型：商品名称 **/
    	COMMODITY_NAME(2, 			"商品名称"),
    	/** 关键词过滤类型：商品描述 **/
    	COMMODITY_DESCRIPTION(4, 	"商品描述"),
    	/** 关键词过滤类型：商品规格 **/
    	COMMODITY_SPEC(5, 			"商品规格"),
    	/** 关键词过滤类型：卡券名称 **/
    	COUPON_NAME(6, 				"卡券名称"),
    	/** 关键词过滤类型：卡券使用限制 **/
    	COUPON_USE_LIMIT(7, 		"卡券使用限制"),
    	/** 关键词过滤类型：卡券使用方式 **/
    	COUPON_USEAGE(8, 			"卡券使用方式"),
    	/** 关键词过滤类型：店铺公告 **/
    	SHOP_NOTICE(9, 				"店铺公告"),
    	/** 关键词过滤类型：直播名称 **/
    	LIVE_NAME(10, 				"直播名称"),
    	/** 关键词过滤类型：买手简介 **/
    	BUYER_INTRO(11, 			"买手简介"),
		/** 关键词过滤类型：买手简介 **/
		SMS_INTRO(12, 			"手机短信");
    	
    	private int id;
		private String name;
    	private SensitiveWordsType(int id, String name) {
    		this.id = id;
    		this.name = name;
    	}
    	public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "{id=" + id + ", name=" + name() + "}";
		}
		
		/**
		 * SensitiveWordsType枚举字典
		 */
		private static HashMap<Integer, SensitiveWordsType> wordsTypeDic = new HashMap<Integer, SensitiveWordsType>();
		static {
			for (SensitiveWordsType swt : SensitiveWordsType.values()) {
				wordsTypeDic.put(swt.getId(), swt);
			}
		}
		
		/**
		 * 根据ID获取SensitiveWordsType对象
		 * @param id	ID
		 * @return
		 */
		public static SensitiveWordsType getSensitiveWordsType(Integer id) {
			return wordsTypeDic.get(id);
		}
    }
}
