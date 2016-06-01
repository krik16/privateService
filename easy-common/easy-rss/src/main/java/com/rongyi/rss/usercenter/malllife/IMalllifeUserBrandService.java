/**
 * 
 */
package com.rongyi.rss.usercenter.malllife;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.malllife.entity.UserBrand;
import com.rongyi.easy.rmmm.entity.MalllifeUserOperateEntity;
 
public interface IMalllifeUserBrandService {

	public void batchUserBrand( List<Map> list,String userId );
	public void delUserBrand(String userId);
	public List<String> getUserBrand(String userId);
	public List<UserBrand> getUserBrandDetailList(String userId);
	public void updateByBrandId(String brandId);
	public List<String> getUserBrandAndLove(String userId);
}
