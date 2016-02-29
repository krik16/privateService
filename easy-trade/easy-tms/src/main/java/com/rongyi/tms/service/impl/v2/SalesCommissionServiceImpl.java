package com.rongyi.tms.service.impl.v2;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:53
 **/
@Service("salesCommissionService")
public class SalesCommissionServiceImpl extends BaseServiceImpl implements SalesCommissionService{

    Logger logger = LoggerFactory.getLogger(SalesCommissionServiceImpl.class);

    private  static final String NAMESPACE ="com.rongyi.tms.mapper.xml.v2.SalesCommissionMapper";

    @Autowired
    private IOrderQueryService iOrderQueryService;

    @Override
    public void insert(SalesCommission salesCommission) {

        this.getBaseDao().insertBySql(NAMESPACE+".insertSelective",salesCommission);
    }

    /**
     * 佣金列表
     *
     * @param map
     * @return
     */
    @Override
    public List<SalesCommissionVO> findCommissionList(Map<String, Object> map) {
        logger.info("service findCommissionList start map={}", map);
        List<SalesCommissionVO> list = this.getBaseDao().selectListBySql(NAMESPACE+".findCommissionList",map);
        List<SalesCommissionVO> reList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(list)) {
            for (SalesCommissionVO vo : list){
                reList.add(processCommissionVO(vo, map.get("type").toString()));
            }
        }
        logger.info("service findCommissionList start size={}",reList.size());
        return reList;
    }

    private SalesCommissionVO processCommissionVO(SalesCommissionVO commissionVO, String  type) {
        try {
            if (ConstantEnum.COMMISSION_TYPE_1.getCodeStr().equals(type)){
                OrderFormEntity orderForm = iOrderQueryService.getOrderFormByOrderNum(commissionVO.getOrderNo());
                commissionVO.setOrderCreateAt(DateTool.date2String(orderForm.getCreateAt(), DateTool.FORMAT_DATETIME));
                commissionVO.setOrderAmount(orderForm.getTotalAmount());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return commissionVO;
    }

    /**
     * 佣金总条数
     *
     * @param map
     * @return
     */
    @Override
    public int countCommission(Map<String, Object> map) {
        return this.getBaseDao().count(NAMESPACE+".countSalesCommission",map);
    }
}
