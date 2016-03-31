package com.rongyi.rss.rmc;

import com.rongyi.core.framework.exception.RYServiceException;
import com.rongyi.easy.domain.member.MallMember;
import com.rongyi.easy.rmc.exception.MallMemberNotFoundException;

/**
 * 
 * ClassName: MallMemberService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 商场会员服务. <br/>
 * date: 2015年8月4日 上午11:45:45 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public interface MallMemberService {

  /**
   * 
   * saveOrUpdate:保存或更新. <br/>
   * 
   * @author bin.zhang
   * @param mallMember
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */

  int saveOrUpdate(MallMember mallMember) throws RYServiceException;

  /**
   * 
   * insert:新增数据 <br/>
   * 
   * @author bin.zhang
   * @param mallMember
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  int insert(MallMember mallMember) throws RYServiceException;

  /**
   * 
   * update:更新服务. <br/>
   * 
   * @author bin.zhang
   * @param mallMember
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  void update(MallMember mallMember) throws RYServiceException;

  /**
   * 
   * query:根据mallId与memberNo来查询. <br/>
   * 
   * @author bin.zhang
   * @param mallId
   * @param memberNo
   * @return
   * @throws RYServiceException
   * @since JDK 1.6
   */
  MallMember query(MallMember mallMember) throws RYServiceException, MallMemberNotFoundException;

  /**
   * 
   * queryById:查询通过主键 <br/>
   * 
   * @author bin.zhang
   * @param id
   * @return
   * @throws RYServiceException
   * @throws MallMemberNotFoundException
   * @since JDK 1.6
   */
  MallMember queryById(Integer id) throws RYServiceException, MallMemberNotFoundException;

  /**
   * 
   * registerEMemberAndBindMallMember:注册电子会员同时与实体会员绑定 <br/>
   * 
   * @author bin.zhang
   * @param mallMember
   * @return
   * @throws RYServiceException
   * @throws MallMemberNotFoundException
   * @since JDK 1.6
   */
  void registerEMemberAndBindMallMember(MallMember mallMember) throws RYServiceException,
      MallMemberNotFoundException;
  /**
   * 
  * @Title: queryMemberByNo 
  * @Description: 通过会员编码查询会员信息
  * @param @param memberNo
  * @param @return    设定文件 
  * @return MallMember    返回类型 
  * @author shaozhou 
  * @date 2015年10月21日 上午10:27:23
  * @throws
   */
  MallMember queryMemberByNo(MallMember mallMember);

}
