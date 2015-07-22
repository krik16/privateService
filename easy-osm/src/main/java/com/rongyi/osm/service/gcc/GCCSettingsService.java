package com.rongyi.osm.service.gcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.easy.gcc.Configurations;
import com.rongyi.rss.gcc.RmmmSettingsService;

@Service
public class GCCSettingsService {

	@Autowired
	RmmmSettingsService rmmmSettingsService;

	public Configurations getLatestConfigurations() throws Exception {
		Configurations conf = null;
		try {
			conf = rmmmSettingsService.getLatestConfigurations();
			if (conf == null) {
				throw new Exception("无法获取配置中心数据，配置数据为空");
			}
		} catch (Exception e) {
			throw e;
		}
		return conf;
	}

}
