package com.rongyi.rss.smms;

import java.util.Map;

import com.rongyi.easy.smms.vo.CommodityVO;

/**
 * smms(商超管理系统) 商品获取接口 类ISuperMarketCommodityService.java的实现描述：TODO 类实现描述
 * @author rongyi11 2015年1月22日 上午10:44:11
 */
public interface ISuperMarketCommodityService {

    /**
     * 根据参数查询
     * groupId
     * mallId 暂时没有
     * channel 商品类型 1 标超 2大卖场 3便利店
     * firtCateId 一级分类id
     * secondCateId 二级分类id
     * status 发布状态 -1全部 0发布，1 关闭  2 删除
     * name 产品名称
     * @param params
     * @return
     * @throws Exception
     */
    public Map searchSuperMarketCommodityList(Map params) throws Exception;
    
    /**
     * 根据参数查询
     * commodityId 商品id
     * @param commodityId
     * @return
     * @throws Exception
     */
    public CommodityVO searchCommodityVOById(String commodityId) throws Exception;
}
