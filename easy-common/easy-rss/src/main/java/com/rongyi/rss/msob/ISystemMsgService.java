package com.rongyi.rss.msob;

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
   public Integer getsellMsgCount(Integer userId)throws Exception;
   
   public Integer getbuyMsgCount(String mallid)throws Exception;
   
   /**
    * 推送系统消息
    * @return
    * @throws Exception
    */
   public int pushSystemMsg(Integer status) throws Exception;

}
