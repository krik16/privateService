package com.rongyi.rss.ryoms.advert;

import com.rongyi.easy.ryoms.advert.entity.MaterialEntity;

public interface MaterialService {

	Integer insert(MaterialEntity materialEntity);

	MaterialEntity selectById(Integer material_id);
}
