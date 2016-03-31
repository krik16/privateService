package com.rongyi.rss.msob;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  买手关注（粉丝）
 * time:  2015/10/19
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/19              1.0            创建文件
 *
 */

import com.rongyi.easy.malllife.pojo.BuyerInfoPojo;
import com.rongyi.easy.malllife.pojo.FansBuyerListPojo;
import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.user.UserFansDto;
import com.rongyi.easy.rmmm.entity.UserFansEntity;

import java.util.List;

public interface IUserFansService {


    /**
     * 保存关注
     * @param userFansDto
     * @return
     * @throws MallShopException
     */
    public UserFansEntity saveUserFans(UserFansDto userFansDto)throws MallShopException;


    /**
     * 返回关注粉丝人数
     * @param userId
     * @return
     * @throws MallShopException
     */
    public Integer getFansCount(int userId) throws MallShopException;


    /**
     * 判断是否被关注
     * @param userId 卖家ID
     * @param buyerId 买家ID
     * @return true 存在 false 不存在
     * @throws MallShopException
     */
    public Boolean isExist(int userId,String buyerId) throws MallShopException;

    /**
     * 取消关注
     * @param userId 卖家ID
     * @param buyerId 买家ID
     * @return
     * @throws MallShopException
     */
    public Integer deleteByBuyerId(int userId,String buyerId)throws MallShopException;


    /**
     * 买手首页信息
     * @param userId 用户信息Id
     * @param buyerId 买家（容易逛用户ID）可为空
     * @return buyerInfoPojo
     * @throws MallShopException
     */
    public BuyerInfoPojo selectByBuyerId(int userId,String buyerId)throws MallShopException;


    /**
     * 卖家关注买手总记录数
     * @param buyerId 买家（容易逛用户ID）
     * @return
     * @throws MallShopException
     */
    public Integer getTotalRecord(String buyerId)throws MallShopException;
    /**
     * 买手列表信息
     * @param buyerId 买家（容易逛用户ID）
     * @param currentPage 当前页码
     * @param pageSize 每页页码
     * @return
     * @throws MallShopException
     */
    public List<FansBuyerListPojo> selectFansBuyerByBuyerId(String buyerId,Integer currentPage,Integer pageSize)throws MallShopException;


    /**
     * 获取我的粉丝列表---买手
     * @param userId 买手Id
     * @param currentPage 当前页
     * @param pageSize 当前页码
     * @return
     * @throws MallShopException
     */
    public List<String> selectFansByuserId(Integer userId,Integer currentPage,Integer pageSize)throws MallShopException;


}
