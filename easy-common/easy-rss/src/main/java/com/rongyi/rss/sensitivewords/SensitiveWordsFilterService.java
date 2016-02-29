package com.rongyi.rss.sensitivewords;

/**
 * Created by xgq on 2016/1/21.
 */
public interface SensitiveWordsFilterService {
    /**
     * 检查是否包含敏感词
     *
     * @param content
     * @param type    1为评论 2昵称 3为商品名称 4商品描述 5商品规格 6卡券名称 7卡券使用限制 8卡券使用方式 9店铺公告 10直播名称 11买手介绍
     * @return true表示包含敏感词；false表示不包含敏感词
     */
    public boolean checkSensitiveWords(String content, SensitiveWordsType type);
    
    /**
     * 关键词过滤类型
     * @author liulei
     */
    public enum SensitiveWordsType {
    	/** 评论 **/
    	COMMENTS(1, 				"评论"),
    	/** 昵称 **/
    	NICK_NAME(2, 				"昵称"),
    	/** 商品名称 **/
    	COMMODITY_NAME(3, 			"商品名称"),
    	/** 商品描述 **/
    	COMMODITY_DESCRIPTION(4, 	"商品描述"),
    	/** 商品规格 **/
    	COMMODITY_SPEC(5, 			"商品规格"),
    	/** 卡券名称 **/
    	COUPON_NAME(6, 				"卡券名称"),
    	/** 卡券使用限制 **/
    	COUPON_USE_LIMIT(7, 		"卡券使用限制"),
    	/** 卡券使用方式 **/
    	COUPON_USEAGE(8, 			"卡券使用方式"),
    	/** 店铺公告 **/
    	SHOP_NOTICE(9, 				"店铺公告"),
    	/** 直播名称 **/
    	LIVE_NAME(10, 				"直播名称"),
    	/** 买手简介 **/
    	BUYER_INTRO(11, 			"买手简介");
    	
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
    }
}
