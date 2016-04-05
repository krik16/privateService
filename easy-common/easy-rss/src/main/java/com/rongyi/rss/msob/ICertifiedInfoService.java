package com.rongyi.rss.msob;

import com.rongyi.easy.bsoms.vo.CertifiedInfoVo;
import com.rongyi.easy.rmmm.param.user.CertifiedParam;

/**
 * 摩购用户认证信息
 * @author sj
 *
 */
public interface ICertifiedInfoService {
	
	/**
	 * 保存用户认证信息
	 * @param certifiedParam
	 * @return  返回认证信息的ID
	 */
	public Integer saveOrUpdate(CertifiedParam certifiedParam) throws Exception;
	
	/**
	 * 根据ID获取用户认证信息
	 * @param id
	 * @return
	 */
	public CertifiedInfoVo getCertifiedInfoVoById(Integer id);
	
	/**
	 * 根据用户ID获取用户认证信息
	 * @param userId 用户Id
	 * @return
	 */
	public CertifiedInfoVo getCertifiedInfoVoByUserId(Integer userId);
}
