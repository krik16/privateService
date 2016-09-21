package com.rongyi.rss.shop;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.mcmc.Zones;
import com.rongyi.easy.solr.CityDocument;
import com.rongyi.easy.solr.MallsDocument;
import com.rongyi.easy.solr.PoiDocument;

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
     * @param  type 0加上状态过滤
     * @return
     */
    public long getMallCount(int type);

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

    /**
     * 分页获取商城文档对象
     * @param skip
     * @param pageSize
     * @return
     */
    public List<PoiDocument> getMallPoiDocumentList(int skip,int pageSize);

    /**
     * 获取商城文档对象
     * @param zoneMid
     * @return
     */
    public PoiDocument getMallPoiDocument(String zoneMid);

    /**
     * 查询zone表全部数据
     * @param skip
     * @param pageSize
     * @return
     */
    public List<Zones> getZones(int skip,int pageSize);

    /**
     * 查询zone表全部记录数
     * @return
     */
    public long getZonesCount();

    public List<String> getZonesByName(String mallName);

    /**
     * 根据城市名称获取城市id
     *
     * @param cityName
     * @return 返回对应城市的id，如果城市名称不存在，返回一个不存在的城市id
     */
    public ResponseVO getCityMidByName(String cityName);
}
