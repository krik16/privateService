/**   
* @Title: ShopVO.java 
* @Package com.rongyi.easy.mcmc 
* @Description: TODO(用一句话描述该文件做什么) 
* @author wzh   
* @date 2015年10月19日 下午2:18:34 
* @version V1.0   
*/
package com.rongyi.easy.mcmc;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.rongyi.easy.roa.vo.ShopVO;

/** 
 * @ClassName: ShopVO 
 * @Description: TODO
 * @author wzh
 * @date 2015年10月19日 下午2:18:34 
 *  
 */
public class ShopVOList {
	
	private List<ShopVO> shops;//街边店
	
	private List<FilialeVO> filiales;//分公司和店铺
	
	
	/** 
	* <p>Title: </p> 
	* <p>Description: </p>  
	*/
	public ShopVOList() {
		super();
		shops=new ArrayList<ShopVO>();
		filiales=new ArrayList<FilialeVO>();
	}

	public List<ShopVO> getShops() {
		return shops;
	}

	public void setShops(List<ShopVO> shops) {
		this.shops = shops;
	}

	public List<FilialeVO> getFiliales() {
		return filiales;
	}

	public void setFiliales(List<FilialeVO> filiales) {
		this.filiales = filiales;
	}
	
	public FilialeVO getFilialeById(String filialeMid){
		if(CollectionUtils.isNotEmpty(filiales)){
			for(FilialeVO filialeVO:filiales){
				if(filialeVO.getId().equals(filialeMid)){
					return filialeVO;
				}
			}
		}
		return null;
	}
	
}
