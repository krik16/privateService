package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.param.AdvertParam;
import com.rongyi.easy.ryoms.advert.vo.AdvertVo;

public interface AdvertService {
	
	public List<AdvertVo> list(AdvertParam advertParam);
}
