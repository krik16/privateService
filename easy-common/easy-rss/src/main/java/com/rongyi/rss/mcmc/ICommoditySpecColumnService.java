package com.rongyi.rss.mcmc;

import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.mcmc.CommodityCategory;
import com.rongyi.easy.mcmc.CommoditySpecColumn;
import com.rongyi.easy.mcmc.param.commodity.CommoditySpecColumnParam;
import com.rongyi.easy.mcmc.param.commodity.SpecColumnParam;
import com.rongyi.easy.mcmc.vo.commodity.CommoditySpecColumnDetailVO;

public interface ICommoditySpecColumnService {
	 public CommoditySpecColumn selectColumnById(String id);

	 public CommoditySpecColumn selectColumnByName(String name);
	 /**
	  * 大运营后台规格列表
	  * @param param
	  * @return
	  */
	 public List<CommoditySpecColumn> selectSpecColumnByNameOrId(CommoditySpecColumnParam param);
	 /**
	  *
	  * @param name    规格名称
	  * @param desc    规格说明
	  * @param hasClassification  是否含有分类
	  */
	 public void insertCommoditySpecColumn(SpecColumnParam param);
	 /**
	  * 大运营后台获取商品规格详情
	  * @param commoditySpecId
	  */
	 public CommoditySpecColumnDetailVO getCommoditySpecColumnInfoById(String commoditySpecId);
	 /**
	  * 大运营后台编辑商品规格
	  * @param param
	  */
	 public void editCommoditySpecColumn(SpecColumnParam param) throws Exception;
	 /**
	  * 大运营后台删除商品规格
	  * @param commoditySpecId
	  */
	 public ResponseData delCommoditySpecColumn(String commoditySpecId,Integer updateBy);
	 /**
	  * 获取商品规格总数
	  * @param param
	  * @return
	  */
	 public Integer getTotalSpecColumnCount(CommoditySpecColumnParam param);

	 public List<CommodityCategory> findCategoryByColumnIds(List<ObjectId> columnIds);

	public List<CommoditySpecColumn> selectColumnByIds(List<ObjectId> ids);
}
