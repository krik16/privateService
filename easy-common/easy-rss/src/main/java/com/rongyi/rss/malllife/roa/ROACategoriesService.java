package com.rongyi.rss.malllife.roa;

import java.util.List;
import java.util.Map;


import com.rongyi.easy.malllife.vo.ShopVO;


/**
 * 类CategoriesService.java的实现描述：类别相关的业务方法
 * @author rongyi-13 2014年9月29日 下午3:07:59
 */
public interface ROACategoriesService {
	
	
	/**
     * 类别列表
     * @param parentId
     * @return category records
     */
    public List<Map<String, Object>> categoryListV5_1(String parentid,String version) ;
    
    public List<ShopVO> getSimilarShops(List<String> categoryIds, String mallId);
    

}
