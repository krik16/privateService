/**
 * Project Name:easy-entity <br/>
 * File Name:EMemberNotFoundException.java <br/>
 * Package Name:com.rongyi.easy.revc.exception <br/>
 * Date:2015年8月12日下午5:42:21 <br/>
 * Copyright (c) 2015, rongyi.com All Rights Reserved.
 * 
 */

package com.rongyi.easy.rmc.exception;

import com.rongyi.core.framework.exception.RYErrorCode;
import com.rongyi.core.framework.exception.RYServiceException;

/**
 * ClassName: EMemberNotFoundException <br/>
 * Function: 实体会员不存在<br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年8月12日 下午5:42:21 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class MallMemberNotFoundException extends RYServiceException {
  private static final long serialVersionUID = 8907744057273355670L;

  public MallMemberNotFoundException() {
    super(RYErrorCode.USER_NOT_FOUND);
  }
}
