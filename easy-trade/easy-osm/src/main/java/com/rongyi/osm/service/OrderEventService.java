package com.rongyi.osm.service;

import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.osm.entity.OrderEventEntity;

/**
 * 订单事件service
 * @author baodk
 */
@Service
public class OrderEventService extends BaseServiceImpl{

    private static final String MAPPER_NAMESPACE = "com.rongyi.easy.osm.entity.OrderEventMapper";
    
    /**
     * 添加订单事件
     * @param orderEventEntity
     */
    public int insertAndGetId(OrderEventEntity orderEventEntity){
        this.getBaseDao().insertBySql(MAPPER_NAMESPACE + ".insertAndGetId", orderEventEntity);
        return orderEventEntity.getId();
    }
    
    public static void main(String[] args) {
    	System.out.println(null + "hello");
    }
}
