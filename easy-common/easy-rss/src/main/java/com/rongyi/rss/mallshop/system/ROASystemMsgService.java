package com.rongyi.rss.mallshop.system;

import com.rongyi.easy.rmmm.param.system.SystemMsgParam;
import com.rongyi.easy.rmmm.vo.system.SystemMsgListVo;

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
     * @param userId
     * @return
     * @throws Exception
     */
    public SystemMsgListVo findsellerMsgList(SystemMsgParam param,Integer userId) throws Exception;

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
     *
     * @return
     */
    public Integer getsellMsgCount(Integer userId)throws Exception ;

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




}
