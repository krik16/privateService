package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.entity.AdvertEntity;
import com.rongyi.easy.ryoms.advert.param.AdvertParam;
import com.rongyi.easy.ryoms.advert.vo.AdvertVo;

public interface AdvertService {
	
	public List<AdvertVo> list(AdvertParam advertParam);

	public int count(AdvertParam advertParam);

	public void save(AdvertEntity entity, String mallIds);

	public AdvertVo info(Integer id);
	
	public void updateAdStatus(Integer id, String string, int userId);
}
