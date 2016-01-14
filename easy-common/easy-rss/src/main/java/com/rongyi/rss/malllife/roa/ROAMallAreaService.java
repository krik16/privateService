package com.rongyi.rss.malllife.roa;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 楼层服务类 类MallAreaService.java的实现描述：TODO 类实现描述
 * 
 * @author rongyi11 2014年10月23日 下午3:52:48
 */
public interface ROAMallAreaService {


    /**
     * 初始化楼层的信息
     * @return
     * @throws Exception
     */
    public String initMallArea() throws Exception ;

    /**
     * 获取商场楼层
     * @param mallId
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> getMallAreaByMallId(String mallId) throws Exception ;

}
