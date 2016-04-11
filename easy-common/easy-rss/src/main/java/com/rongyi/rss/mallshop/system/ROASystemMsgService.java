package com.rongyi.rss.mallshop.system;

import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.system.SystemMsgDto;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.param.system.SystemMsgParam;
import com.rongyi.easy.rmmm.vo.system.SystemMsgListVo;

import java.util.List;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/8
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/8              1.0            创建文件
 *
 */
public interface ROASystemMsgService {

    /**
     * 返回卖家系统消息
     * @param user
     * @return
     * @throws Exception
     */
    public SystemMsgListVo findsellerMsgList(SystemMsgParam param,RmmmUserInfoEntity user) throws Exception;

    /**
     * 返回买家系统消息
     * @param param
     * @return
     * @throws Exception
     */
    public SystemMsgListVo findbuyerMsgList(SystemMsgParam param) throws Exception;



    /**
     * 删除买家系统消息
     * @param param
     * @return
     * @throws Exception
     */
    public int delBuyerMsg(SystemMsgParam param) throws Exception ;

    /**
     * 删除卖家系统消息
     * @param param
     * @param userId
     * @return
     * @throws Exception
     */
    public int delSellerMsg(SystemMsgParam param,Integer userId) throws Exception ;

    /**
     * @param entity 用户信息
     * @return
     */
    public Integer getsellMsgCount(RmmmUserInfoEntity entity)throws Exception ;

    /**
     * 获取信息数量
     * @param mallid
     * @return
     * @throws Exception
     */
    public Integer getbuyMsgCount(String mallid)throws Exception ;

    /**
     * 推送系统消息
     * @return
     * @throws Exception
     */
    public int pushSystemMsg(Integer status) throws Exception ;


    /**
     * 买家 批量操作（已读）
     * @param param param.getMsgStatus();//删除 -1 阅读 0 收藏 1
     * @return
     * @throws com.rongyi.easy.mallshop.MallShopException
     */
    public int setSellerRead(SystemMsgParam param) throws MallShopException;

    /**
     * 卖家 批量操作（已读）
     * @param param param.getMsgStatus();//删除 -1 阅读 0 收藏 1
     * @return
     * @throws MallShopException
     */
    public int setBuyerRead(SystemMsgParam param) throws MallShopException;
    /**
     * 保存推送消息
     * @param systemMsgDtoList 推送消息内容
     * @throws MallShopException
     */
    public void savePushMsg(List<SystemMsgDto> systemMsgDtoList)throws MallShopException;

}
