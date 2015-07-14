package com.rongyi.rss.revc;

import com.rongyi.core.framework.exception.IllegalParamterException;
import com.rongyi.easy.revc.entity.ElectronicMember;
import com.rongyi.easy.revc.param.ElectronicMemberParam;

/**
 * 电子会员接口
 * @author baodk
 */
public interface ElectronicMemberService {
  /**
   * 创建电子会员
   * 
   * @param electronicMember
   */
  public ElectronicMember createEleMember(ElectronicMemberParam electronicMemberParam);

  /**
   * 绑定vip号
   * 
   * @param memberNo 电子会员编号
   * @return
   */
  public ElectronicMember bindVipCode(ElectronicMemberParam electronicMemberParam)
      throws IllegalParamterException;

  /**
   * 更新电子会员基本信息
   * 
   * @param electronicMember
   * @return
   */
  public ElectronicMember updateEleMember(ElectronicMemberParam electronicMemberParam);

  /**
   * 获取电子会员信息（也可以用于会员登录）
   * 
   * @return
   */
  public ElectronicMember getEleMemberInfo(ElectronicMemberParam electronicMemberParam);

  /**
   * 更新电子会员积分
   * 
   * @param memberNo 会员编号
   * @param integrals 积分（增加为正数，减少为负数）
   * @return
   */
  public ElectronicMember updateEleMemberIntegrals(ElectronicMemberParam electronicMemberParam)
      throws Exception;
}
