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

  /**
   * 
   * selectByMallId:根据mallId来选择适配内容. <br/>
   * 终端3.3.0只有mallId,现在是根据mallId来取数据的
   * 
   * @author bin.zhang
   * @param mallId 商场id
   * @param methodName 方法名
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  public AdapterEntity selectByMallId(String mallId, String methodName) throws RYServiceException;
}
