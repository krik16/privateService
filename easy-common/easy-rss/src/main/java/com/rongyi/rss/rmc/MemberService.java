package com.rongyi.rss.rmc;

import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.domain.member.UserLog;
import com.rongyi.easy.roa.param.MemberInfoParam;

/**
 * ClassName: ISignInService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 签到服务. <br/>
 * date: 2015年5月10日 下午2:39:34 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public interface MemberService {
  /**
   * 
   * signIn:签到服务 <br/>
   * 
   * @author bin.zhang
   * @param memberInfoParam
   * @param methodName
   * @return
   * @since JDK 1.6
   */
  ResponseResult signIn(MemberInfoParam memberInfoParam, String methodName);

  void insertUserLog(UserLog userLog);

  /**
   * 
   * countUserSignIn:得到签到次数. <br/>
   * 
   * @author bin.zhang
   * @param map
   * @return
   * @since JDK 1.6
   */
  int countUserSignIn(Map map);

}
