package com.rongyi.rss.revc;

import java.util.Map;

import com.rongyi.core.common.Page;
import com.rongyi.core.common.PageList;
import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.revc.entity.EMember;
import com.rongyi.easy.revc.exception.EMemberIntegralNotEnoughException;
import com.rongyi.easy.revc.exception.EMemberNotFoundException;
import com.rongyi.easy.revc.param.ElectronicMemberParam;
import com.rongyi.easy.rmc.exception.MallMemberNotFoundException;

/**
 * 
 * ClassName: EleMemberService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 电子会员服务. <br/>
 * date: 2015年8月3日 下午5:08:23 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public interface EleMemberService {

  /**
   * 
   * bindVipCode:绑定实体会员. <br/>
   * 
   * @author bin.zhang
   * @param memberId
   * @param mallMemberId
   * @throws RYServiceException
   * @since JDK 1.6
   */
  void bindMallMember(ElectronicMemberParam electronicMemberParam) throws RYServiceException,
      MallMemberNotFoundException;


  /**
   * 
   * update:更新会员信息 <br/>
   * 
   * @author bin.zhang
   * @param eMember
   * @throws RYServiceException
   * @since JDK 1.6
   */
  void update(EMember eMember) throws RYServiceException;

  /**
   * 获取电子会员信息
   * 
   * @return
   */
  public EMember getEMemberInfo(EMember eMember) throws EMemberNotFoundException;

  /**
   * 
   * getEMemberInfo:获取电子会员. <br/>
   * 
   * @author bin.zhang
   * @param electronicMemberParam
   * @return
   * @throws EMemberNotFoundException
   * @since JDK 1.6
   */
  public EMember getEMemberInfo(ElectronicMemberParam electronicMemberParam)
      throws EMemberNotFoundException;

  /**
   * 
   * getEMemberInfoByMallId:商场会员查询. <br/>
   * 
   * @author bin.zhang
   * @param mallId
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  public PageList<EMember> getEMemberInfoByCondtion(Map query, Page page) throws RYServiceException;

  /**
   * 
   * updateEMemberIntegrals:积分变动. <br/>
   * 
   * @author bin.zhang
   * @param eMember
   * @param integral
   * @throws RYServiceException
   * @since JDK 1.6
   */
  void updateEMemberIntegrals(EMember eMember, Integer integral) throws RYServiceException,
      EMemberIntegralNotEnoughException;

  /**
   * 
   * firstInsert:注册电子会员. <br/>
   * 
   * @author bin.zhang
   * @param eMember
   * @throws RYServiceException
   * @since JDK 1.6
   */
  EMember registerEmember(EMember eMember) throws RYServiceException;

  /**
   * 
   * registerEmember:用户注册. <br/>
   * 
   * @author bin.zhang
   * @param electronicMemberParam
   * @throws RYServiceException
   * @since JDK 1.6
   */
  EMember registerEmember(ElectronicMemberParam electronicMemberParam) throws RYServiceException;

  /**
   * 
   * insert:数据插入. <br/>
   * 
   * @author bin.zhang
   * @param eMember
   * @throws RYServiceException
   * @since JDK 1.6
   */
  EMember insert(EMember eMember) throws RYServiceException;


  /**
   * bind:(这里用一句话描述这个方法的作用). <br/>
   * TODO(这里描述这个方法适用条件 – 可选).<br/>
   * TODO(这里描述这个方法的执行流程 – 可选).<br/>
   * TODO(这里描述这个方法的使用方法 – 可选).<br/>
   * TODO(这里描述这个方法的注意事项 – 可选).<br/>
   * 
   * @author zeuskingzb
   * @param memberId
   * @param mallMemberId
   * @throws RYServiceException
   * @since JDK 1.6
   */
  void bind(String memberId, Integer mallMemberId) throws RYServiceException;
}
