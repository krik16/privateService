/**
 * Project Name:easy-entity <br/>
 * File Name:EMemberNotFoundException.java <br/>
 * Package Name:com.rongyi.easy.revc.exception <br/>
 * Date:2015年8月12日下午5:42:21 <br/>
 * Copyright (c) 2015, rongyi.com All Rights Reserved.
 * 
 */

package com.rongyi.easy.revc.exception;

import com.rongyi.core.framework.exception.RYErrorCode;
import com.rongyi.core.framework.exception.RYServiceException;

/**
 * ClassName: EMemberNotFoundException <br/>
 * Function: 电子会员未注册<br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年8月12日 下午5:42:21 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class EMemberNotFoundException extends RYServiceException {
  private static final long serialVersionUID = 8907744057273355670L;

  public EMemberNotFoundException() {
    super(RYErrorCode.EM_NOT_EXIST);
  }
}
