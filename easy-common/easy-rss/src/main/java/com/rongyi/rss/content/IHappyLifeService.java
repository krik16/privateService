package com.rongyi.rss.content;

import com.rongyi.easy.content_v2.vo.AdverBannerVo;

/**
 * 乐生活APP相关接口
 * @author sj
 *
 */
public interface IHappyLifeService {
	/**
	 * 查询APP 乐生活广告banner图
	 * @return
	 */
	public AdverBannerVo getAppAdverBanner();
}
