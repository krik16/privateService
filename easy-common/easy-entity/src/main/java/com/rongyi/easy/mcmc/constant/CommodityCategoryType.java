package com.rongyi.easy.mcmc.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品类目级别常量定义
 * 当前还不能做到两个常量定义个字典内容完全兼容 因为之前定义的 就是不一样的 整合在一起时为了方便
 * Created by liulei on 2016/2/29.
 */
public interface CommodityCategoryType {
	/** 商品类目级别：一级分类 **/
	public static final int TYPE_0 = 0;
	/** 商品类目级别：二级分类 **/
	public static final int TYPE_1 = 1;
	/** 商品类目级别：三级分类 **/
	public static final int TYPE_2 = 2;
	/** 商品类目级别：四级分类 **/
	public static final int TYPE_3 = 3;
	/**
	 * 类目级别字典
	 */
	Map<Integer,String> typeDict = new HashMap<Integer,String>(){
		private static final long serialVersionUID = 1814009433158338529L;
		{
			put(TYPE_0 + 1,"一级类目");
			put(TYPE_1 + 1,"二级类目");
			put(TYPE_2 + 1,"三级类目");
			put(TYPE_3 + 1,"四级类目");
		}
	};
}
