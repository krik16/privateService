/** 
 * @Title: CommissionService.java 
 * @Package com.rongyi.tms.service 
 * @Description: 佣金服务接口（CRUD/小票上传/佣金审核 等）
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月22日 下午3:33:04 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.tms.service;

import java.util.List;
import java.util.Map;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.SalesCommission;
import com.rongyi.easy.tms.vo.SalesCommissionParam;
import com.rongyi.easy.tms.vo.SalesCommissionVO;
import com.rongyi.tms.moudle.vo.BonusPageParam;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.CommissionAmountTotalVO;
import com.rongyi.tms.moudle.vo.CommissionInfoVO;

/**
 * @author ZhengYl
 * 
 */
public interface SalesCommissionService {

	/**
	 * 插入
	 * @author ZhengYl
	 * @date 2015年5月22日 下午3:45:55
	 * @param salesCommission
	 * @return
	 */
	public int insert(SalesCommission salesCommission);

	/**
	 * 通过订单号查找佣金数据
	 * 
	 * @author ZhengYl
	 * @date 2015年5月22日 下午3:45:55
	 * @param orderNo
	 * @return
	 */
	public SalesCommission selectByOrderNo(String orderNo);
	

	/**
	 * 通过MQ消息增加佣金记录
	 * @author ZhengYl
	 * @date 2015年5月22日 下午5:23:38 
	 * @param messageEvent
	 * @return
	 */
	public Map<String,Object> addCommissionByMQ(MessageEvent messageEvent);
	
	
    /**
     * 根据订单号更新佣金记录
     * 
     * @author ZhengYl
     * @date 2015年5月22日 下午6:39:40 
     * @param salesCommission
     * @return
     */
    public int updateByOrderNo(SalesCommission salesCommission);
    /**
     * 
     * @Description 分页获取数据 
     * @author 袁波
     * @param params
     * @return
     */
    public PagingVO<SalesCommissionVO> findByPage(SalesCommissionParam params);
    
    /**
     * 
     * @Description 根据id查找
     * @author 袁波
     * @param id
     * @return
     */
    public SalesCommissionVO selectOneById(int id);
    /**
     * 
     * @Description 批量更新， 审核，支持批量审核通过。同一个卖家在同一个买家的佣金，每天最多审核通过5笔，超过5笔的status 会更新为 5，前台依然会显示审核通过。
     *              
     * @author 袁波
     * @param commissions
     * @return
     */
    public int updateBatch(CheckParam param,String user);
    

    /**
     * 获取佣金统计数据
     * 
     * @author ZhengYl
     * @date 2015年5月26日 下午4:40:33 
     * @param userId
     * @return
     */
    public CommissionInfoVO selectCommissionInfo(String userId);
    
    
    /**	
     * @Description: 获取审核失败佣金（包含交易佣金和商品佣金） 
     * @param userId
     * @return	
     * @Author:  柯军
     * @datetime:2015年7月21日下午7:56:14
     **/
    public CommissionInfoVO selectFaleCommission(String userId);
    
    /**
     * 
     * @Description 统计用户佣金金额并通过MQ 发送到虚拟账户
     * @author 袁波
     */
    public void statisticsCommissionAmountTrigger(Integer guideType);
    /**
     * 
     * @Description 查询考核奖金
     * @author 袁波
     * @param param
     * @return
     */
    public SalesCommission findBonusByPage(BonusPageParam param);
    
    /**
     * 
     * @Description 更新一条考核奖金 
     * @author 袁波
     * @param commission
     */
    public int updateBonus(SalesCommission commission);
    
    /**
     * 
     * @Description 查询卖家账号
     * @author 袁波
     * @param id
     * @return
     */
    public String getUserAccountById(Integer id);
    /**
     * 
     * @Description 查询用户id根据账号
     * @author 袁波
     * @param Account
     * @return
     */
    public Integer getUserIdByUserAccount(String account);
    
    /**
     * 
     * @Description 统计过每个卖家在一定的时间内总的佣金，并发送到VA 的记录，需要把记录的status 更新为 6
     * @author 袁波
     * @param params (list 卖家id列表 ，status 状态 默认为6
     * @return
     */
    int updateBatchHadSendedVA(List<CommissionAmountTotalVO> ids,long version);

    /**
     *每日定时检查更新前一天生成的导购/买手的超限佣金
     */
    void statisticsCheckLimitTrigger();

    /**
     * 查询导购前一日所有的待返佣数据
     * @param guideId 导购id
     * @param guideType 导购类型
     * @return list
     */
    List<SalesCommissionVO> selectGuideYesterdayCommission(String guideId,Integer guideType);

    /**
     * 统计更新导购超出返佣规则的佣金记录
     * @param guideId 导购id
     * @param guideType 导购类型 1:导购 2:买手
     */
    void calcCommissioinLimit(String guideId,Integer guideType);

}