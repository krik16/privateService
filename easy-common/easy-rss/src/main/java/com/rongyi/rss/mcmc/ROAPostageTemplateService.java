package com.rongyi.rss.mcmc;

import com.rongyi.easy.mcmc.entity.PostageTemplateEntity;

/**
 * Created by wangzehui on 2016/3/4.
 */
public interface ROAPostageTemplateService {

    /**
     * 查询商城下面的邮费模版
     * @param mallMid
     * @return
     */
    public PostageTemplateEntity searchPostageTemplateByMallMid(String mallMid);
}
