package com.rongyi.rss.malllife.service.welfare;

/*
 * Description:  
 * time:  2016/10/9
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * yuzhijian             2016/10/9              1.0            创建文件
 * Author   yuzhijian@rongyi.com || yuxia2217@163.com
 * Copyright (C),上海容易网电子商务有限公司
 */

import com.rongyi.easy.malllife.exception.MallLifeException;
import com.rongyi.easy.malllife.param.WelfareParam;
import com.rongyi.easy.usercenter.entity.MalllifeWelfareEntity;

public interface IWelfareService {

    /**
     * 保存记录
     * @param e
     * @return
     * @throws MallLifeException
     */
    public int saveEntity(MalllifeWelfareEntity e)throws MallLifeException;

    /**
     * 根据用户ID查询
     * @param userId
     * @return
     * @throws MallLifeException
     */
    public MalllifeWelfareEntity findByUserId(String userId)throws MallLifeException;

    /**
     * 根据openId 查询
     * @param openId
     * @return
     * @throws MallLifeException
     */
    public MalllifeWelfareEntity findByOpenId(String openId)throws MallLifeException;

    /**
     * 支付完成后通知更新状态
     * @param wp
     * @throws Exception
     */
    public void updateOrderStatus(WelfareParam wp)throws Exception;



}
