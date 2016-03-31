package com.rongyi.rss.msob;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  用户标签信息关系表
 * time:  2015/10/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/13              1.0            创建文件
 *
 */

import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.userlabel.UserLabelDto;

import java.util.List;

public interface IUserLabelService {


    /**
     * 根据用户ID返回 用户标签
     * @param userId
     * @return
     */
    public List<UserLabelDto> getLabelByUserId(Integer userId);


    /**
     * 保存用户标签
     * @param userLabelNameList 用户列表信息
     * @param userId 用户Id
     * @param userType 用户类型 1导购，2买手
     * @throws MallShopException
     */
    public void saveUserLabel(List<String> userLabelNameList,Integer userId,Integer userType)throws MallShopException;


    /**
     * 删除用户对应的标签
     * @param userId 用户id
     * @param labelId 标签Id
     * @return
     * @throws MallShopException
     */
    public Integer deleteByUserId(Integer userId,Integer labelId)throws MallShopException;

}
