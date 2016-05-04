/**
 * 
 */
package com.rongyi.rss.usercenter.malllife;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.rmmm.entity.MalllifeUserOperateEntity;
 
public interface IMalllifeUserBrandService {

	public void batchUserBrand( List<String> list,String userId );
	public void delUserBrand(String userId);
	public List<String> getUserBrand(String userId);

}
