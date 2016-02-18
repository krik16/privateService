package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.entity.AdvertGroupEntity;
import com.rongyi.easy.ryoms.advert.param.AdvertGroupParam;
import com.rongyi.easy.ryoms.advert.vo.AdvertGroupVo;

public interface AdvertGroupService {
	public void save(AdvertGroupEntity entity);

	public List<AdvertGroupVo> searchGroups(AdvertGroupParam advertGroupParam);
	
	public AdvertGroupVo info(Integer iidd);
}
