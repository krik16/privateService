package com.rongyi.rss.bdata;

import java.util.List;

import com.rongyi.easy.bdata.vo.MallShopVO;

public interface MerchantService {

	public List<MallShopVO> getMallShopVO(Integer type,String id);
}
