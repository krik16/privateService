package com.rongyi.rss.rvc;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.rongyi.easy.mcmc.vo.YunFilePropVO;



public interface RVCCommonService {
	 public String getCode4VerifyPhone(String phone);
	 
	 public String confirmVerifyCode(String phone, String verifyCode, String delayTime);

	 public String confirmVerifyCodeStr(String phone, String verifyCode, String delayTime);

	 public YunFilePropVO getYunFileKey();
	 
	 /**
		 * 20150113 lim 验证手机和验证码
		 * 
		 * @param phone
		 * @param verifyCode
		 * @param delayTime
		 *            验证码时效,默认三十分钟
		 * @param session
		 * @return
		 * @throws Exception
		 */
		public Map<String, Object> checkPhoneSms(String phone, String verifyCode, String delayTime, HttpSession session) throws Exception;

}
