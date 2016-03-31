package com.rongyi.rss.malllife.roa.fac;

/**
 * 优惠是否被收藏
 * 类GrouponInfoService.java的实现描述：TODO 类实现描述 
 * @author rongyi11 2014年8月25日 下午6:24:31
 */

public interface RoaGrouponInfoService {
	
	
	 public boolean getFav(String grouponId, String userId) throws Exception;
}
