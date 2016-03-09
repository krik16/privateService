package com.rongyi.rss.msob;

import com.rongyi.easy.mallshop.MallShopException;
import com.rongyi.easy.rmmm.dto.system.SystemMsgDto;
import com.rongyi.easy.rmmm.entity.RmmmUserInfoEntity;
import com.rongyi.easy.rmmm.param.system.SystemMsgParam;
import com.rongyi.easy.rmmm.vo.system.SystemMsgListVo;

public interface ISystemMsgService {
	
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
    public int delBuyerMsg(SystemMsgParam param) throws Exception;
    
    /**
     * 删除卖家系统消息
     * @param param
     * @param userId
     * @return
     * @throws Exception
     */
    public int delSellerMsg(SystemMsgParam param,Integer userId) throws Exception;
    
    /**
    *
    * @return
    */
   public Integer getsellMsgCount(RmmmUserInfoEntity entity)throws Exception;
   
   public Integer getbuyMsgCount(String mallid)throws Exception;
   
   /**
    * 推送系统消息
    * @return
    * @throws Exception
    */
   public int pushSystemMsg(Integer status) throws Exception;


    /**
     * 买家 批量操作（已读）
     * @param param param.getMsgStatus();//删除 -1 阅读 0 收藏 1
     * @return
     * @throws MallShopException
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
     * @param systemMsgDto 推送消息内容
     * @throws MallShopException
     */
    public void savePushMsg(SystemMsgDto systemMsgDto)throws MallShopException;

}
