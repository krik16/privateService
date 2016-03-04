package com.rongyi.rss.mcmc;

import com.rongyi.easy.mcmc.entity.FreightTemplateEntity;

import java.util.List;

/**
 * Created by wangzehui on 2016/3/4.
 */
public interface FreightTemplateService {

    /**
     * 查询商城下面的邮费模版
     * @param mallMid
     * @return
     */
    public FreightTemplateEntity searchFreightTemplateByMallMid(String mallMid);
}
