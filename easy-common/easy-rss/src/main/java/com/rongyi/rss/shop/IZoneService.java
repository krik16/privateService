package com.rongyi.rss.shop;

import com.rongyi.easy.solr.CityDocument;
import com.rongyi.easy.solr.MallsDocument;

import java.util.List;

/**
 * Created by wangzehui on 2016/1/22.
 */
public interface IZoneService {

    /**
     * 获取需要索引的数据总数
     * @return
     */
    public long getZoneCount();

    /**
     * 分页创建索引对象
     * @param skip
     * @param pageSize
     * @return
     */
    public List<CityDocument> getCityDocumentList(int skip,int pageSize)  ;

    /**
     * 创建索引对象
     * @param zoneMid
     * @return
     * @throws Exception
     */
    public CityDocument getCityDocument(String zoneMid) throws Exception;

    /**
     * 获取商城数量
     * @return
     */
    public long getMallCount();

    /**
     * mall索引 分页
     * @param skip
     * @param pageSize
     * @return
     */
    public List<MallsDocument> getMallDocumentList(int skip,int pageSize);

    /**
     * mall索引
     * @param zoneMid
     * @return
     * @throws Exception
     */
    public MallsDocument getMallDocument(String zoneMid) ;
}
