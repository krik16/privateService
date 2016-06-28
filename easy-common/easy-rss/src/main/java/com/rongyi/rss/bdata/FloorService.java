package com.rongyi.rss.bdata;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.bdata.entity.BdataFloor;
import com.rongyi.easy.bdata.entity.CommunalFacilityType;
import com.rongyi.easy.bdata.entity.Floor;
import com.rongyi.easy.bdata.vo.BdataFloorVO;
import com.rongyi.easy.bdata.vo.CommunalFacilityVO;
import com.rongyi.easy.shop.entity.FloorEntity;

public interface FloorService {
	/**
	 * 根据名字和所在商场查找楼层
	 * @param name
	 * @param mallId
	 * @return
	 */
	public List<Floor> findFloorByNameAndMallId(String name,String mallId);
	
	/**
	 * 根据id查询楼层
	 * @param id
	 * @return
	 */
	public Floor getFloorById(String id);
	
	public BdataFloorVO getBdataFloorById(String id);

	

	
	public List<BdataFloorVO> getMallFloors(String mallId,int currentpage, int pagesize);
	
	
	public	String updateOrInsertFloor(BdataFloorVO vo);
	
	public void updateSystemStatus(String floorId,String uId);
	
	public void sortFloor(String floorId,String type,String updateUserId);
	
	public List<CommunalFacilityType> getCommunalFacilitiesType();
	
	public List<CommunalFacilityVO> getFloorCommunalFacilitiesType(String[] id);
	
	public CommunalFacilityVO getCommunalFacilitiesById(String id);
	
	public void setCommunalFacilityStatus(String id,int status,String updateUserId);
	
	public void saveCommunalFacility(CommunalFacilityVO vo);
	
	public List<CommunalFacilityVO> getFloorCommunalFacilitiesType(Map map);
	
}
