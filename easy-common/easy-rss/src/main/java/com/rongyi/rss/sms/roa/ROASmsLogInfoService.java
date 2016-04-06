package com.rongyi.rss.sms.roa;

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
public interface ROASmsLogInfoService {



    /**
     * 保存短信记录数
     * @param smsLogInfoDto
     * @throws Exception
     */
    public void save(SmsLogInfoDto smsLogInfoDto)throws Exception;


    /**
     * 查询当前手机，当前模块 当天发送的短信记录数
     * @param phone
     * @param prodectType 发送产品类型
     * @param module 发送模块
     * @return
     * @throws Exception
     */
    public Integer getCount(String phone,int prodectType,int module)throws Exception;



}
