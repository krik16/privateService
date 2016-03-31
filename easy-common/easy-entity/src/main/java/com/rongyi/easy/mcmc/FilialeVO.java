/**   
* @Title: FilialeVO.java 
* @Package com.rongyi.easy.mcmc 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年10月19日 下午2:17:10 
* @version V1.0   
*/
package com.rongyi.easy.mcmc;

import java.util.List;

import com.rongyi.easy.roa.vo.ShopVO;

/** 
 * @ClassName: FilialeVO 
 * @Description: TODO
 * @author wzh
 * @date 2015年10月19日 下午2:17:10 
 *  
 */
public class FilialeVO {
	
	private String id;//分公司id
	private String name;//分公司名字
	
	private List<ShopVO> shopVOs;//店铺信息

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ShopVO> getShopVOs() {
		return shopVOs;
	}

	public void setShopVOs(List<ShopVO> shopVOs) {
		this.shopVOs = shopVOs;
	}
	
	
}
