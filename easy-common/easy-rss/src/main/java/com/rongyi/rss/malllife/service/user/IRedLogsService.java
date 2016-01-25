package com.rongyi.rss.malllife.service.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/9/23
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/23              1.0            创建文件
 *
 */

import com.rongyi.easy.malllife.exception.MallLifeException;
import com.rongyi.easy.malllife.param.RedLogs;

public interface IRedLogsService {


    public void saveRedLogs(RedLogs redLogs)throws MallLifeException;


}
