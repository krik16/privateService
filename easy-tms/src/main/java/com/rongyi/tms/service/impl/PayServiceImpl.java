/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日上午10:26:18
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.vo.TradeVO;
import com.rongyi.rss.malllife.roa.user.ROAMalllifeUserService;
import com.rongyi.tms.service.PayService;

/**	
 * @Author:  柯军
 * @Description: 付款实现
 * @datetime:2015年5月19日上午10:26:18
 *
 **/
@Service
public class PayServiceImpl extends BaseServiceImpl implements PayService{

    private static final String PAYMENTENTITY_NAMESPACE = "com.rongyi.tms.mapper.xml.PayMapper";
    
    @Autowired
    ROAMalllifeUserService rOAMallLifeUserService;
    
    @Override
    public List<TradeVO> selectPayPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", pageSize);
        return this.getBaseDao().selectListBySql(PAYMENTENTITY_NAMESPACE+".selectPayPageList", map);
    }

    @Override
    public Integer selectPayPageListCount(Map<String, Object> map) {
        return this.getBaseDao().selectOneBySql(PAYMENTENTITY_NAMESPACE+".selectPayPageListCount", map);
    }

}
