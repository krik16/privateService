package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.roa.vo.MallGroupVO;

/**
 * 
  * @Title: ROAMallGroupService.java 
  * @Package com.rongyi.rss.roa 
  * @Description: TODO
  * @author 平康  pingkang@rongyi.com
  * @date 2015年7月27日 上午11:20:50 
  * @version V1.0   
  * Copyright (C),上海容易网电子商务有限公司
 */
public interface ROAMallGroupService {
	
    /**
     * 查询集团信息
     */
    public MallGroupVO getMallGroupVOById(String id) throws Exception;
    
    /**
     * 查询集团列表
     * @param params
     * @param currentpage
     * @param pagesize
     * @return
     * @throws Exception
     */
    public List<MallGroupVO> getMallGroups(Map params) throws Exception;
    
    /**
     * 通过商场获得集团
     * @param mallMid
     * @return
     * @throws Exception
     */
    public MallGroupVO getMallGroupsByMallMid(String mallMid) throws Exception;
}
