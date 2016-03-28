package com.rongyi.rss.roa;

import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.MallVO;

import java.util.List;
import java.util.Map;

/**
 * 类商场信息对外服务
 * 
 * @author limeng 2015年3月3日16:21:58
 */
public interface ROAMallService {
	
    /**
     * 查询商场信息
     */
    public MallVO getMallVOById(String id) throws Exception;
    
    /**
     * 查询商场列表
     * @param params
     * @param currentpage
     * @param pagesize
     * @return
     * @throws Exception
     */
    public Map<String,Object> getMalls(Map params, int currentpage, int pagesize) throws Exception;

    /**
     * 查询集团下所属的商场
     * @param groupId
     * @return
     */
    public List<MallEntity> getMallEntitysByGroupId(String groupId) throws Exception;

    /**
     * 查询商场信息
     * @param id
     * @return
     * @throws Exception
     */
    public MallEntity getMallEntityById(String id) throws Exception;
    
	public void updateMallLevel(Map<String, Object> paramsMap);
}
