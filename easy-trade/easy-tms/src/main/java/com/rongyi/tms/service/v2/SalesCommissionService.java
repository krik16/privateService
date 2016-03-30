package com.rongyi.tms.service.v2;

import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;
import com.rongyi.easy.tms.vo.v2.VerifyCommissionParam;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:47
 **/
public interface SalesCommissionService {

    /**
     * 通过主键id查询
     * @param id
     * @return
     */
    SalesCommission selectById(Integer id);

    void insert(SalesCommission salesCommission);

    /**
     * 佣金列表
     * @param map
     * @return
     */
    List<SalesCommissionVO> findCommissionList(Map<String, Object> map);

    /**
     * 摩店佣金列表
     * @param map
     * @return
     */
    List<SalesCommissionVO> findCommissionListForMallShop(Map<String, Object> map);

    /**
     * 佣金详情
     * @param id
     * @return
     */
    SalesCommissionVO getCommissionDetail(Integer id);

    /**
     * 佣金总条数
     * @param map
     * @return
     */
    int countCommission(Map<String, Object> map);


    boolean verifyCommission(VerifyCommissionParam param, String user);

    public void sendVerifyMessage(String guideId,BigDecimal commission,Byte status,Byte type,Byte registerType);
    /**
     *验证是否允许返佣
     * @param guideId
     * @param registerId
     * @param type
     * @return
     */
    boolean validateIsAllow(Integer guideId,String registerId,Integer type);

    Integer getGuideDayLimit(String guideId,Date createAt,Byte status,Byte type,Byte registerType);

    void sendCommissionToVa(Integer id,BigDecimal amount,String guideId,CommissionConfig config);

    /**
     * 佣金总条数(摩店)
     *
     * @param map
     * @return
     */
    int countCommissionForMallShop(Map<String, Object> map);

    /**
     * 摩店佣金详情
     *
     * @param id
     * @return
     */
    SalesCommissionVO getCommissionDetailForMallShop(Integer id);
}
