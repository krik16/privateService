package com.rongyi.rss.bdata;

import com.rongyi.easy.bdata.vo.BrandVO;
import com.rongyi.easy.roa.entity.BrandHaiXinEntity;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;


public interface BrandService {
	Map<String, Object>getBrands(Map params, int currentpage, int pagesize);
	BrandVO getBrandMoreInfo(String brandId);
	
	BrandVO getBrandByName(String name);
	
	public String saveBrandHaiXin(BrandHaiXinEntity brandHaiXin);
	
	public BrandHaiXinEntity getBrandHaiXinByCode(String code, String shopMid);
	
	public List<BrandHaiXinEntity> getBrandHaiXinListByCondition(String shopMid);

	void  importHaiXinData(String url, String shopMid) throws Exception;

	public BrandHaiXinEntity getBrandHaiXinById(ObjectId id);

}
