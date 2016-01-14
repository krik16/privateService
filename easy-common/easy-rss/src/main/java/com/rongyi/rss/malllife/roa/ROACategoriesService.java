package com.rongyi.rss.malllife.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.vo.ShopVO;
import com.rongyi.easy.roa.entity.CategoriesEntity;


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
    
    /**
     * 获取排序选项列表（优惠/找店）
     * 
     * @author ZhengYl
     * @date 2015年9月18日 下午1:57:22 
     * @return
     */
    public List<Map<String, Object>> getSortByList();
    /**
     * 根据父目录id和分类级别查询
     * @param type
     * @param parentId
     * @return
     */
    public List<CategoriesEntity> getSubByTypeOrParentId(Integer type,String parentId);
    
    public CategoriesEntity getCategoriesById(String id);
}
