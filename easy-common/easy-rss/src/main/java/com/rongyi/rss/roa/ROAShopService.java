package com.rongyi.rss.roa;

import java.util.Map;

import com.rongyi.easy.roa.vo.ShopVO;

/**
 * 类ROAShopService.java的描述：TODO 类实现描述
 * 
 * @author PingKang 2015年1月8日 下午2:49:20
 */
public interface ROAShopService {

    /**
     * 根据搜索参数查询店铺数据
     * 
     * @param params
     * @param currentpage
     * @param pagesize
     * @return	Map<String,Object>
     * 			"success"   	成功：true;失败：false
     * 			"list"			shop列表
     * 			"totalCount"	总数
     * @throws Exception
     */
    public Map getShops(Map params, int currentpage, int pagesize) throws Exception;
    
    /**
     * 根据店铺id查询出店铺信息
     * @param id
     * @return
     * @throws Exception
     */
    public ShopVO getShopsVOById(String id)throws Exception;
    
}
