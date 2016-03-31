package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.osm.entity.OrderCartFormEntity;
import com.rongyi.easy.osm.vo.OrderCartFormVO;

import java.util.Map;

/**
 * Created by hebo on 2015/12/28.
 * 购物车订单
 */
public interface IOrderCartService {

    /**
     * 分页条件查询购物车订单
     *
     * @param paramsMap
     * @throws Exception
     */
    PagingVO<OrderCartFormVO> searchListByMap(Map<String, Object> paramsMap) throws Exception;

}
