package com.rongyi.rpb.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.rpb.domain.WeixinMch;
import com.rongyi.rpb.service.WeixinMchService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信公众支付
 * Author kejun
 */
@Service
public class WeixinMchServiceImpl extends BaseServiceImpl implements WeixinMchService {

    private static final String NAMESPACE = "com.rongyi.easy.rpb.domain.WeixinMchMapper";

    @Override
    public void insert(WeixinMch weixinMch) {
        this.getBaseDao().insertBySql(NAMESPACE + ".insertSelective", weixinMch);
    }


    @Override
    public void update(WeixinMch weixinMch) {
        this.getBaseDao().updateBySql(NAMESPACE + ".updateByPrimaryKeySelective", weixinMch);
    }

    @Override
    public WeixinMch selectById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
    }

    @Override
    public WeixinMch selectByPublicCodeAndUserId(String publicCode, String userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("publicCode", publicCode);
        map.put("userId", userId);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPublicAndUserId", map);
    }

    @Override
    public WeixinMch selectByAppIdAndTradeType(String appId,Integer tradeType,String useId) {
        Map<String, Object> map = new HashMap<>();
        map.put("appId", appId);
        map.put("tradeType", tradeType);
        map.put("userId", useId);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByAppIdAndTradeType", map);
    }

    @Override
    public WeixinMch selectByMchIdAndUserId(String mchId, String userId) {
        Map<String, Object> map = new HashMap<>();
        //只需要根据商户ID查询
 //     map.put("mchId", mchId);
        map.put("userId", userId);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByMchIdAndUserId", map);
    }

    @Override
    public void deleteByUserId(String userId) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        this.getBaseDao().selectOneBySql(NAMESPACE + ".deleteByUserId", map);
    }
}
