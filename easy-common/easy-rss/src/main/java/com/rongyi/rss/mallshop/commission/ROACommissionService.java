/**
 * 
 */
package com.rongyi.rss.mallshop.commission;

import java.util.Map;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.tms.vo.v2.CommissionVO;
import com.rongyi.easy.tms.vo.v2.SalesCommissionListVO;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：推广佣金接口
 * time ：2016年3月8日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2016年3月8日               1.0              创建文件
 */
public interface ROACommissionService {
	
	/**
     * 返佣
     * @param commissionVO 请求参数对象
     * @return ResponseData
     */
    ResponseData addCommission(CommissionVO commissionVO);

    /**
     * 摩店返佣列表查询（推广/首单）
     * @param params 请求参数对象
     * @return ResponseData
     */
    SalesCommissionListVO getCommissionList(Map<String, Object> params) throws Exception;

    /**
     * 摩店返佣详情查询（推广/首单）
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
     * @return
     */
    boolean hasCommissConfigApp(Integer identity);

}
