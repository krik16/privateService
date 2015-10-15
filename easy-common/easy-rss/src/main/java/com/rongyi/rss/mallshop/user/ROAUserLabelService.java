package com.rongyi.rss.mallshop.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/10/15
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/15              1.0            创建文件
 *
 */

import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.userlabel.UserLabelDto;

import java.util.List;

public interface ROAUserLabelService {

    /**
     * 根据用户ID返回 用户标签
     * @param userId
     * @return
     */
    public List<UserLabelDto> getLabelByUserId(Integer userId);


    /**
     * 保存用户标签
     * @param userLabelDtoList 用户列表信息
     * @param userId 用户Id
     * @param userType 用户类型 1导购，2买手
     * @throws com.rongyi.easy.mallshop.MallShopException
     */
    public void saveUserLabel(List<UserLabelDto> userLabelDtoList,Integer userId,Integer userType)throws MallShopException;

}
