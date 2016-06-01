package com.rongyi.rss.ryoms.advert;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.bdata.vo.AdvertNewVo;
import com.rongyi.easy.ryoms.advert.entity.AdvertEntity;
import com.rongyi.easy.ryoms.advert.param.AdvertParam;
import com.rongyi.easy.ryoms.advert.vo.AdvertVo;

public interface AdvertService {
	
	public List<AdvertVo> list(AdvertParam advertParam);

	public int count(AdvertParam advertParam);

	public void save(AdvertEntity entity, String mallIds, String string);

	public AdvertVo info(Integer id);
	
	public int updateAdStatus(Integer id, String string, int userId);

	public List<AdvertNewVo> getAdsByMallId(String mall_id);

	public AdvertNewVo getAdById(int ad_id);

	List<Integer> getValidAdIdsByMallId(String mall_id);

	void deleteAdToPhp(Map<String, Object> param);
}
