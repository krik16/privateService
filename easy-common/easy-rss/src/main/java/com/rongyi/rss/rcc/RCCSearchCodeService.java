package com.rongyi.rss.rcc;

import java.util.Map;

/**
 * Created by rongyi11 on 2015/3/5.
 */
public interface RCCSearchCodeService {

    /**
     * 根据条件搜索codelist
     * @param paramMap
     * @return
     * @throws Exception
     */
    public Map searchCodeByMap(Map paramMap) throws Exception;
}
