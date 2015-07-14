package com.rongyi.rss.rmc;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.entity.AdapterEntity;

/**
 * 商场-接口映射 service
 * 
 * @author bin.zhang
 */
public interface AdapterService {


  /**
   * 
   * selectByCondition:读取适配. <br/>
   * ownerId与mallId 不能同时为空,优先适配ownerId当ownerId为空的时候 ,再配置mallId .<br/>
   * 
   * @author bin.zhang
   * @param ownerId
   * @param mallId
   * @param methodName
   * @return
   * @since JDK 1.6
   */
  public AdapterEntity selectByCondition(String ownerId, String mallId, String methodName)
      throws RYServiceException;
}
