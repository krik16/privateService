package com.rongyi.rss.solr;

import java.util.List;

import com.rongyi.easy.solr.MallsDocument;

/**
 * 商场索引 service
 * @author baodkd
 */
public interface MallService {
	/**
	 * 20150126 lim
     * 查询商场索引
     * @param name:商场名称
     * @return
     */
    public List<MallsDocument> selectMallsIndex(String name);
    
    /**
	 * 20150126 lim
     * 查询商场索引
     * @param mallId:商场ID
     * @return
     */
    public MallsDocument selectMallIndexById(String mallId);
}
