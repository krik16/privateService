package com.rongyi.easy.rmc.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.domain.member.ChannelType;
import com.rongyi.easy.domain.member.SignInType;

/**
 * 
* @ClassName: CarInfoParam 
* @Description: 查询车位信息参数实体
* @author shaozhou 
* @date 2015年12月28日 下午4:40:21
 */
public class CarInfoParam extends BaseParam implements Serializable {
  private static final long serialVersionUID = -4630417774498735207L;
  private String carCode;
  private String mallId;
	public String getCarCode() {
		return carCode;
	}
	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
}
