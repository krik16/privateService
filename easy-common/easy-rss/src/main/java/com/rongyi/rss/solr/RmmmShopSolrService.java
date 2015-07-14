package com.rongyi.rss.solr;

import com.rongyi.easy.solr.retrival.PoiInput;
import com.rongyi.easy.solr.retrival.result.Result;

public interface RmmmShopSolrService {



	public Result poiSearch(PoiInput input);

	public boolean updatePoiStatus(String id, String mid, int status);

}
