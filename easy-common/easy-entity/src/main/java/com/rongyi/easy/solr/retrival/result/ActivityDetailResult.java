package com.rongyi.easy.solr.retrival.result;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.rongyi.easy.solr.retrival.DBData;



public class ActivityDetailResult extends Result  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -410018920446825362L;
	private static int count = 0;
	private ActivityData result;
	private List<ActivityData> applyShop;
	private List<ActivityData> otherActivity;
	private Info info;

	public ActivityData getResult() {
		return result;
	}

	public void setResult(ActivityData data) {
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
		if (res.size() > 0) {
			String type = "";
			if (null == result) {
				result = new ActivityData();
				applyShop = new ArrayList<ActivityData>();
				otherActivity = new ArrayList<ActivityData>();
			} else {
				applyShop.clear();
				otherActivity.clear();
			}
			for (int i = 0; i < res.size(); i++) {

				ActivityData poiData = new ActivityData();
				DBData record = res.get(i);
				if (i == 1 && detail == true) {
					count = record.getNum();
					continue;
				}

				poiData.setAddr(record.addr);
//				poiData.set_score(record.score);
				if (record.getPic_url() != null)
					poiData.setPic_url("http://rongyi.b0.upaiyun.com"
							+ record.getPic_url());
				poiData.setLocation(record.getLocation());
				poiData.setCategories(record.getCategoryList());
				poiData.setZones(record.getZoneList());
				if(record.getDescription()!=null){
					poiData.setDescription(record.getDescription());
				}

//				poiData.set_type("activity");
//				poiData.set_index("activities");
//				poiData.set_explannation("null");
//				poiData.set_version("null");
//				poiData.setSort("null");
//				poiData.setHighlight("null");

				poiData.set_id(record.id);
				poiData.setId(record.id);
				poiData.setShop_ids(record.getShopId());
				poiData.setMall_ids(record.getMallId());
				poiData.setHolder_id(record.getHolderId());
				if (i == 0) {
					type = record.getHolderType();
					if (type.equalsIgnoreCase("Brand")) {
						type = "Shop";
					}
				}
				poiData.setHolder_type(record.getHolderType());
				poiData.setType(type.toLowerCase());
				
				poiData.setStart_time(record.getStart_time());
				poiData.setEnd_time(record.getEnd_time());
				poiData.setCreated_at(record.getCreated_at());
				
				poiData.setTitle(record.getTitle());
				poiData.setLabel(record.getLabel()); // label
				poiData.setName(record.name);// name
				poiData.setCity_name(record.getCity());
				if(record.getRank()!=null){
					poiData.setRank(record.getRank());
				}else{
					poiData.setRank("");
				}
				if (record.getThumbnail() != null) {
					poiData.setThumbnail("http://rongyi.b0.upaiyun.com"
							+ record.getThumbnail());
				}
				if (record.getCarouselImg() != null
						&& record.getCarouselImg().size() > 0) {
					List<String> tempList = new ArrayList<String>();
					for (String tempImg : record.getCarouselImg()) {
						tempList.add("http://rongyi.b0.upaiyun.com" + tempImg);
					}
					poiData.setCarouselImg((ArrayList<String>) tempList);
				}

				poiData.setVistedNum(record.getVistedNum());
				poiData.setBuyedAmount(record.getBuyedAmount());
				poiData.setRestAmount(record.getRestAmount());
				poiData.setUseRestriction(record.getUseRestriction());
				poiData.setUserQuota(record.getUserQuota());
				poiData.setGrouponNum(record.getGrouponNum());
				poiData.setGrouponOriginal(record.getGrouponOriginal());
				poiData.setGrouponPrice(record.getGrouponPrice());
				poiData.setGrouponStyle(record.getGrouponStyle());
				poiData.setUseMode(record.getUseMode());
				if (record.tel != null) {
					poiData.setTelephone(record.tel);
				} else {
					poiData.setTelephone("");
				}
				if (record.getHolderType() != null
						&& record.getHolderType().equals("Mall"))
					poiData.setShop_own(record.getBusinessDistrict());
				else
					poiData.setShop_own(record.getMall());
				if (detail) {
					if (i == 0)
						result = poiData;
					else if (i < count + 2) {
						otherActivity.add(poiData);
					} else {
						applyShop.add(poiData);
					}
				}
			}
			info = new Info();
			info.setHitCount(res.size());
			if (result != null) {
				info.setStatus(0);
				info.setMsg("success");

			} else {
				info.setStatus(1);
				info.setMsg("failure");
			}
		}else{
			info = new Info();
			info.setHitCount(res.size());
			info.setStatus(1);
			info.setMsg("failure");
		}
	}

	public void setApply_shops(List<ActivityData> data) {
		this.applyShop = data;
	}

	public List<ActivityData> getApply_shops() {
		return applyShop;
	}

	public void setOther_activities(List<ActivityData> data) {
		this.otherActivity = data;
	}

	public List<ActivityData> getOther_activities() {
		return otherActivity;
	}
}
