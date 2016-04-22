package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.param.AdvertReleaseParam;
import com.rongyi.easy.ryoms.advert.vo.AdvertReleaseVo;

public interface AdvertReleaseService {
	
	public List<AdvertReleaseVo> list(AdvertReleaseParam advertReleaseParam);

	public int count(AdvertReleaseParam advertReleaseParam);

	public String publish(AdvertReleaseParam param) throws Exception;
}
