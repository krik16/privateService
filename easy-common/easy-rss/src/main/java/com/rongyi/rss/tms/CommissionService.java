package com.rongyi.rss.tms;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.tms.vo.v2.*;

import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/26 10:22
 **/
public interface CommissionService {

    /**
     * 返佣
     *
     * @param commissionVO 请求参数对象
     * @return ResponseData
     */
    ResponseData addCommission(CommissionVO commissionVO);

    /**
     * 摩店返佣列表查询（推广/首单）
     *
     * @param params 请求参数对象
     * @return ResponseData
     */
    SalesCommissionListVO getCommissionList(Map<String, Object> params) throws Exception;

    /**
     * 摩店返佣详情查询（推广/首单）
     *
     * @param id 佣金id
     * @return ResponseData
     */
    SalesCommissionVO getCommissionInfo(Integer id) throws Exception;

    /**
     * 摩店针对登录用户类型查询返佣规则（推广）
     * @param identity 用户登录类型 （4、5 查询导购数据  6查询买手数据）
     * @return
     */
    ResponseVO getCommissAppVo(Integer identity);

    /**
     * 判断是否有返佣任务
     * @param identity 用户类型
     * @return 1只有容易逛返佣任务 2只有摩店返佣任务 3都有  0没有返佣任务
     */
    int hasCommissConfigApp(Integer identity);

    /**
     * 根据身份和被邀请人对象 查询返佣结果
     * @param inviteType  （4、5 查询导购数据  6查询买手数据）
     * @param registerType 被邀请人类型 1:容易逛,2:摩店买手,3:摩店导购,4:摩店全部
     * @return
     */
    List<CommissionConfigAppVo> getCommissConfigList(Integer inviteType ,Integer registerType);
}
