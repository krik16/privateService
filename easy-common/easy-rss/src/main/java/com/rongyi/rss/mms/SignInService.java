package com.rongyi.rss.mms;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.domain.member.SignInModel;


/**
 * 
 * ClassName: SignInService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 签到服务<br/>
 * date: 2015年4月29日 下午7:40:23 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public interface SignInService {
  /**
   * 
   * insert:(这里用一句话描述这个方法的作用). <br/>
   * 插入签到规则.<br/>
   * 
   * @author bin.zhang
   * @param signInModel
   * @return
   * @since JDK 1.6
   */
  void insertOrUpdate(SignInModel signInModel);

  /**
   * 
   * update:审核<br/>
   * 
   * @author bin.zhang
   * @param sinInModel
   * @since JDK 1.6
   */
  void check(SignInModel signInModel) throws RYServiceException;

  /**
   * 
   * queryByMallId:根据mallId找. <br/>
   * 
   * @author bin.zhang
   * @param sinInModel
   * @throws RYServiceException
   * @since JDK 1.6
   */
  SignInModel queryByMallId(String mallId) throws RYServiceException;

  /**
   * 
   * queryByMap:多纬度查询. <br/>
   * 
   * @author bin.zhang
   * @param map
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  SignInModel queryMallIdAndStatus(String mallId, int status) throws RYServiceException;

  SignInModel queryMallIdAndStatusToCheck(String mallId, int status) throws RYServiceException;

}
