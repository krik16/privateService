package com.rongyi.rss.msgcenter;


import com.rongyi.easy.msgcenter.TriggerActivityParam;

public interface TriggerActivityService {
	 /**
     * 交易2
     *  Timestamp nowTime,Integer pushCondition,Integer tradeAmount,Integer tradeRange,String userId,String shopId
     * @param StartAt ,
     * pushCondition:'1:注册，2交易，3邀请，4激活',
     * TradeStartAmount : 交易金额,
     * tradeRange:交易范围：1全部，2品牌，3商城，4店铺',
     * tradeRange为1，shopId为空，
     * shopId: 
     * 
     * ============
     * 邀请
     * String userId,Timestamp invityTime,Integer pushCondition,Integer invity,Integer fruitful,Integer fruitfulRange
     *  @param userId
	 * @param invityTime 邀请时间
	 * @param pushCondition  '1:注册，2交易，3邀请，4激活',
	 * @param invity  '邀请人：1不限，2导购，3买手，4容易逛用户',
	 * @param fruitful '获益人：1邀请人，2被邀请人',
	 * @param fruitfulRange  '获益场景 1:注册，2注册并交易',
     * @throws 0,失败，1成功 
     */
    public int triggerMessage(TriggerActivityParam param) ;



    /**
     * 判断后台是否配置了注册红包，并给相应用户发送配置的红包
     * @param param
     * @return
     */
    int getRegisteCoupons(TriggerActivityParam param);
}
