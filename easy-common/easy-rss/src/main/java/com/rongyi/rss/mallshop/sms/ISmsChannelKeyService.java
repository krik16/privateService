package com.rongyi.rss.mallshop.sms;

import com.rongyi.core.common.third.param.sms.SmsChannelDto;
import com.rongyi.core.common.third.param.sms.SmsCommonParam;
import com.rongyi.core.common.third.param.sms.SmsDto;

import java.util.List;

/**
 * Created by WUH on 2017/4/6.
 * 短信渠道接口
 */
public interface ISmsChannelKeyService {
    int addSmsChannel(SmsCommonParam param) throws Exception;

    int delSmsChannel(SmsCommonParam param) throws Exception;

    SmsChannelDto getSmsChannelById(int id) throws Exception;

    List<SmsChannelDto> smsChannelList(SmsCommonParam param) throws Exception;

    int getCount() throws Exception;

    int updateSmsChannel(SmsCommonParam param) throws Exception;

    SmsChannelDto getSmsChannelByChannel(String channel) throws Exception;
}
