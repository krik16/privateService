package com.rongyi.rss.usercenter.malllife.system;

import com.rongyi.easy.malllife.param.UninstallParam;
import com.rongyi.easy.rmmm.entity.MalllifeUninstallRecordEntity;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/6/30    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public interface IMallLifeUninstallService {


    /**
     * 保存卸载记录
     * @param uninstall
     * @return 1
     * @throws Exception
     */
    public int saveRecord(UninstallParam uninstall) throws Exception;

}
