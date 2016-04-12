package com.rongyi.rss.sms;

import com.rongyi.easy.rmmm.dto.sms.SmsLogInfoDto;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/7/28
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/7/28              1.0            创建文件
 *
 */
public interface ISmsLogInfoService {


    /**
     * 保存短信记录数
     * @param smsLogInfoDto
     * @throws Exception
     */
  public void save(SmsLogInfoDto smsLogInfoDto)throws Exception;


    /**
     * 查询当前手机，当前模块 当天发送的短信记录数
      * @param phone
     * @param prodectType
     * @param module
     * @return
     * @throws Exception
     */
  public Integer getCount(String phone,int prodectType,int module)throws Exception;

    /**
     * @param smsLogInfoDto
      *  taskID 发送任务ID
     *  finalResult 反馈最终状态 success faild
     *   channel  发送渠道 1创世华信,2建周 3未来
     *   receiveTime 时间
     *   phone 发送手机号码
     * @throws Exception
     */
  public void updateFinalResult(SmsLogInfoDto smsLogInfoDto) throws Exception;


}
