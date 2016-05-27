package com.rongyi.rss.bdata;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.bdata.entity.Shop;

import java.util.List;
import java.util.Map;


public interface BrandService {
	Map<String, Object>getBrands(Map params, int currentpage, int pagesize);
}
