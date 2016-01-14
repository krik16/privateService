package com.rongyi.rss.rob;

import java.util.Map;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;

public interface ISafeguardService {
	
	/**
	 * 申请维权API
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult requestSafeguard(ApplicationFormEntity applicationForm) throws Exception;
	
	/**
	 * 取消维权API
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult cancelSafeguard(Map<String,Object> map) throws Exception;

}
