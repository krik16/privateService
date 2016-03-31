package com.rongyi.rss.msob;

import com.rongyi.easy.rmmm.param.email.BasicMail;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  发送邮件服务
 * time:  2015/5/26
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/26              1.0            创建文件
 *
 */
public interface IMailService {

    /**
     * 发送邮件
     * @param basicMail
     */
    public void sendMail(BasicMail basicMail) throws Exception;

}
