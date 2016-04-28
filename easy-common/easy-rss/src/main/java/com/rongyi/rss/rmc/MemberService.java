package com.rongyi.rss.rmc;

import java.util.Map;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.domain.member.CarInfoVo;
import com.rongyi.easy.domain.member.MallMember;
import com.rongyi.easy.domain.member.UserLog;
import com.rongyi.easy.revc.param.ElectronicMemberParam;
import com.rongyi.easy.rmc.param.ActivityLimitParam;
import com.rongyi.easy.rmc.param.CarInfoParam;
import com.rongyi.easy.rmc.param.LoginWithSmsParam;
import com.rongyi.easy.rmc.param.MemberInfoParam;

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
  Integer signIn(MemberInfoParam memberInfoParam) throws RYServiceException;

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

  /**
   * 
   * pullMember:会员查询. <br/>
   * 
   * @author bin.zhang
   * @param memberInfoParam
   * @param methodName
   * @return
   * @since JDK 1.6
   */

  MallMember pullMember(MemberInfoParam memberInfoParam) throws RYServiceException;

  /**
   * 
   * register:注册. <br/>
   * 
   * @author bin.zhang
   * @param electronicMemberParam
   * @throws RYServiceException
   * @since JDK 1.6
   */
  void register(ElectronicMemberParam electronicMemberParam) throws RYServiceException;

  CarInfoVo getCarInfoByCode(CarInfoParam carInfoParam);

  Map<String, Object> memberLoginWithSms(LoginWithSmsParam param);

Map<String, Object> memberActivityLimit(ActivityLimitParam param);

}
