package com.rongyi.rss.roa;

import com.rongyi.easy.mcmc.vo.YunFilePropVO;



public interface ROACommonService {
	 public String getCode4VerifyPhone(String phone);
	 
	 public String confirmVerifyCode(String phone, String verifyCode, String delayTime);

	 public String confirmVerifyCodeStr(String phone, String verifyCode, String delayTime);

	 public YunFilePropVO getYunFileKey();

}
