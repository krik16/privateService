package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.roa.vo.FilialeVo;

/**
 * 分公司 
 * @author user
 *
 */
public interface ROAFilialeService {
	/**
	 * 查询分公司列表 
	 * @param paramMap
	 *             id  分公司ID
	 *             brandId  集团ID
	 *             name  集团名称
	 * @param currpage 
	 * @param pageSize
	 * @return
	 */
	public List<FilialeVo> getFilialeList(Map paramMap,int currpage,int pageSize);
	
	public FilialeVo getFilialeById(String id);
}
