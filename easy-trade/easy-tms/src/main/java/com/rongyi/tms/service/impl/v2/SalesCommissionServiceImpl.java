package com.rongyi.tms.service.impl.v2;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.tms.entity.SalesCommissionAuditLog;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.rss.tradecenter.osm.IOrderQueryService;
import com.rongyi.tms.constants.ConstantEnum;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.service.v2.CommissionConfigService;
import com.rongyi.tms.service.v2.SalesCommissionService;
import com.rongyi.tms.web.controller.param.VerifyCommissionParam;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Autowired
    private SalesCommissionAuditLogService salesCommissionAuditLogService;

    @Autowired
    private CommissionConfigService commissionConfigService;

    /**
     * 通过主键id查询
     *
     * @param id
     * @return
     */
    @Override
    public SalesCommission selectById(Integer id) {
        SalesCommission salesCommission  = null;
        if (id != null){
            Map<String, Object> map = new HashMap<>();
            map.put("id", id);
            salesCommission = this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByPrimaryKey", map);
        }
        return salesCommission;
    }

    @Override
    public void insert(SalesCommission salesCommission) {

        this.getBaseDao().insertBySql(NAMESPACE + ".insertSelective", salesCommission);
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
        List<SalesCommissionVO> list = this.getBaseDao().selectListBySql(NAMESPACE + ".findCommissionList", map);
        List<SalesCommissionVO> reList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(list)) {
            for (SalesCommissionVO vo : list){
                reList.add(processCommissionVO(vo, map.get("type").toString()));
            }
        }
        logger.info("service findCommissionList start size={}", reList.size());
        return reList;
    }

    /**
     * 佣金详情
     *
     * @param id
     * @return
     */
    @Override
    public SalesCommissionVO getCommissionDetail(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        SalesCommissionVO vo = this.getBaseDao().selectOneBySql(NAMESPACE + ".getCommissionDetail", map);
        if (vo.getStatus()==-1 || vo.getStatus()==-2){
            SalesCommissionAuditLog log = salesCommissionAuditLogService.selectFailedLog(id);
            if (log!=null)
                vo.setReason(log.getMemo());
        }
        return vo;
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

    @Override
    public boolean verifyCommission(VerifyCommissionParam param) {
        Map<String, Object> paramsMap = new HashMap<>();
        List<String> ids = Arrays.asList(param.getIds().split(","));
        for (String idStr : ids)
        {
            int id = Integer.valueOf(idStr);
            SalesCommission commission = selectById(id);
            if (commission!=null)
            {
                CommissionConfig config = commissionConfigService.selectById(commission.getConfigId());
                if (config!=null)
                {
                    if (param.getStatus().intValue() == ConstantEnum.COMMISSION_STATUS_3.getCodeInt())
                    {
                        //二级审核获取当天已通过审核数
                        paramsMap.clear();
                        paramsMap.put("guideId", commission.getGuideId());
                        paramsMap.put("createAt", commission.getCreateAt());
                        paramsMap.put("status", param.getStatus());
                        paramsMap.put("type", config.getType());
                        Integer dailyCount = this.getBaseDao().count(NAMESPACE + ".selectDailyCount", paramsMap);
                    }
                }
            }


        }
//        addOperateLog(id, param.getDesc())
        return false;
    }


}
