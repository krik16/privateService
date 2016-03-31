package com.rongyi.easy.solr.retrival.result;

import com.rongyi.easy.solr.retrival.DBData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class PoiResult extends Result  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8662054517662388953L;
	private List<PoiData> result;
	private Info info;
	public List<PoiData> getResult() {
		return result;
	}
	public void setResult(List<PoiData> data) {
		this.result = data;
	}
	public Info getMeta() {
		return info;
	}
	public void setMeta(Info info) {
		this.info = info;
	}
	@Override
	public void setResults(List<DBData> res, boolean detail) {
		// TODO Auto-generated method stub
		if(null == result) {
			result = new ArrayList<PoiData>();
		}
		else {
			result.clear();
		}
		for(int i = 0; i < res.size(); i ++) {
			PoiData poiData = new PoiData();
			DBData record = res.get(i);
			poiData.setName(record.name);
			if(record.getTags() != null) {
				poiData.setLabel(record.getTags().toString().substring(1, record.getTags().toString().length() - 1));
			}
			if(record.getTags() != null && record.getTags().size() == 1)
				poiData.setTags(appendList(record.getTags()));
			else
				poiData.setTags(record.getTags());
			poiData.setRank(record.getRank());
			poiData.setAddr(record.addr);
			poiData.setCity_name(record.getCity());
			if(record.getPic_url() != null)
				poiData.setPic_url("http://rongyi.b0.upaiyun.com"+record.getPic_url());
			else {
				poiData.setPic_url("http://rongyi.b0.upaiyun.com");
			}
			if(record.getAppearance_pic()!=null){
				poiData.setAppearance_pic("http://rongyi.b0.upaiyun.com"+record.getAppearance_pic());
			}
			
			poiData.setLocation(record.getLocation());
			poiData.setCategories(record.getCategoryList());
			poiData.setZones(record.getZoneList());
			poiData.setAny_activity(record.isHasActivity());
			poiData.setAny_coupon(record.isHasCoupon());
			poiData.setDescription(record.getDescription());
			poiData.setBusiness_district(record.getBusinessDistrict());
			poiData.setRmmmShopStatus(record.getRmmmShopStatus());
			poiData.setBrandId(record.getBrandId());
			poiData.setCooperationShopId(record.getCooperationShopId());
			if(record.getTypeName().equals("mall"))
				poiData.setShop_own(record.getBusinessDistrict());
			else {
				if(record.getShop_type() != null && record.getShop_type().equals("2"))
					poiData.setShop_own(record.getBusinessDistrict());
				else
					poiData.setShop_own(record.getMall());
			}
			poiData.setType(record.getTypeName());
			if(record.getShop_nature() != null) {
				switch (record.getShop_nature()) {
				case "3":
					poiData.setShop_nature("http://rongyi.b0.upaiyun.com/images/zhekou.png");
					break;
				case "4":
					poiData.setShop_nature("http://rongyi.b0.upaiyun.com/images/qijiandian.png");
					break;
				}
			}
//			poiData.set_score(record.score);
//			poiData.set_explannation("null");
//			poiData.set_version("null");
//			poiData.setSort("null");
//			poiData.setHighlight("null");
			//shop或mall
			poiData.setId(record.id);
//			poiData.set_type("mall_shops");
//			poiData.set_index("mall_shop");
			result.add(poiData);
		}
		info = new Info();
		info.setHitCount(res.size());
		info.setStatus(0);
		if(result.size() > 0)
			info.setMsg("success");
		else
			info.setMsg("failure");
	}
	private ArrayList<String> appendList(ArrayList<String> list) {
		list.add("");
		return list;
	}
}
