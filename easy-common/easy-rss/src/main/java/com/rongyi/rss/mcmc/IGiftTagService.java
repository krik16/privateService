package com.rongyi.rss.mcmc;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.vo.GiftTagVO;

/**
 * 礼品标签Service
 *
 * @author yaoyiwei
 * @date 2016-11-22
 * @version 1.0
 * 
 */
public interface IGiftTagService {

    ResponseVO createTag(final GiftTagVO tag);

    ResponseVO editTag(String id, String name);

    ResponseVO removeTag(String id);

    ResponseVO getTagsByMappingId(String mappingId);
}
