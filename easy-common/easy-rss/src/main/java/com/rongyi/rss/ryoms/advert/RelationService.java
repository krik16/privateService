package com.rongyi.rss.ryoms.advert;

import java.util.List;

import com.rongyi.easy.ryoms.advert.entity.RelationEntity;
import com.rongyi.easy.ryoms.advert.param.RelationParam;
import com.rongyi.easy.ryoms.advert.vo.RelationVo;

public interface RelationService {

	int count(RelationParam relationParam);

	List<RelationVo> list(RelationParam relationParam);

	void save(RelationEntity entity);

	boolean existCode(RelationParam relationParam);

	RelationVo info(Integer id);

	void updateStatus(Integer id, Integer status) throws Exception;

	boolean verifyEnable(String relation_id);
	
}
