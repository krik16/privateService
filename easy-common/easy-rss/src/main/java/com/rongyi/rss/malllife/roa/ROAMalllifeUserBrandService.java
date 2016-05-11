/**
 * 
 */
package com.rongyi.rss.malllife.roa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.entity.UserBrand;
import com.rongyi.easy.rmmm.entity.MalllifeUserOperateEntity;
 
public interface ROAMalllifeUserBrandService {

	public void batchUserBrand( List<Map> list,String userId );
	public void delUserBrand(String userId);
	public List<String> getUserBrand(String userId);
	public List<UserBrand> getUserBrandDetailList(String userId);
	public void updateByBrandId(String brandId);
}
