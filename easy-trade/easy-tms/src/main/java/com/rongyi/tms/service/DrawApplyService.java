/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月11日下午3:25:49
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service;
import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.tms.entity.DrawApply;
import com.rongyi.easy.tms.vo.DrawApplyListVO;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.moudle.vo.DrawApplyInfoVO;

import java.util.List;
import java.util.Map;

/**	
 * @Author:  柯军
 * @Description: 提现申请service接口 
 * @datetime:2015年5月11日下午3:25:49
 *
 **/

public interface DrawApplyService {

    /**	
     * @Description: 插入 
     * @param drawApply
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月11日下午4:14:10
     **/
    public int insert(DrawApply drawApply);

    /**
     * 
     * @Description: 查找提现申请列表
     * @param params 参数键值map
     * @return	
     * @Author:  袁波
     * @datetime:2015年5月13日下午4:48:10
     */
    public PagingVO<DrawApply> findByPage(Map<String,Object> params);
    
    /**
     * @Description: 获取
     * @param id 
     * @return
     * @Author:  袁波
     * @datetime:2015年5月13日下午6:12:40
     */
    public DrawApply getOneById(int id);
    
    /**
     * @Description: 获取
     * @return
     * @Author:  袁波
     * @datetime:2015年5月22日下午5:32:40
     */
    public DrawApply getOneByDrawNo(String drawNo);
    
    /**
     * @Description: 批量更新状态
     * @return
     * @Author:  袁波
     * @datetime:2015年5月13日下午6:13:33
     */
    public int updateForCheckApplys(CheckParam params,String userName);
    
    /**
     * 
     * @Description 批量更新提现申请
     * @author 袁波
     * @param applies
     * @return
     */
    public int updateBatchDrawApplysByDrawNo(List<DrawApply> applies);
    
    
    
    /**	
     * @Description: 通过MQ消息增加提现记录
     * @param messageEvent
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午5:09:51
     **/
    public Map<String,Object> addDrawApplyByMQ(MessageEvent messageEvent);
    
    
    /**	
     * @Description: 支付成功后交易系统发出通知，修改提现记录状态及记录交易信息
     * @param messageEvent	
     * @Author:  柯军
     * @datetime:2015年5月22日下午3:10:47
     **/
    public void updateDrawApplyByMQ(MessageEvent messageEvent);
    
    /**
     * 获取提现统计数据
     * 
     * @author ZhengYl
     * @date 2015年5月26日 下午3:26:08 
     * @param userId 用户Id
     * @return
     */
    public DrawApplyInfoVO selectDrawApplyInfo(String userId);
    
    /**
     * 查询提现记录（明细列表）
     * 
     * @author ZhengYl
     * @date 2015年5月28日 上午11:45:15 
     * @param searchValueMap 参数
     * @return
     */
    public DrawApplyListVO selectDrawApplyList(Map<String, Object> searchValueMap);

}
