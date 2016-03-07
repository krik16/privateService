package com.rongyi.rss.mcmc;

import com.rongyi.easy.mcmc.entity.PostageTemplateEntity;
import com.rongyi.easy.mcmc.param.PostageTemplateParam;

import java.util.List;

/**
 * Created by wangzehui on 2016/3/4.
 */
public interface PostageTemplateService {

    /**
     * 根据id查询运费模版
     * @param templateId
     * @return
     */
    public PostageTemplateEntity searchPostageTemplateById(int templateId);

    /**
     * 查询商城下面的邮费模版
     * @param mallMid
     * @return
     */
    public PostageTemplateEntity searchPostageTemplateByMallMid(String mallMid);

    /**
     * 根据商城名查询模版运费
     * @param mallName
     * @param skip
     * @param pageSize
     * @return
     */
    public List<PostageTemplateEntity> searchPostageTemplateByMallName(String mallName,int skip,int pageSize);

    /**
     * 根据商城名查询模版总数
     * @param mallName
     * @return
     */
    public  int searchPostageTemplateCountByMallName(String mallName);

    /**
     * 新增或者修改邮费模版
     * @param param
     * @return
     */
    public boolean insertOrUpdatePostageTemplate(PostageTemplateParam param);
}
