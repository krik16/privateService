package com.rongyi.rss.bdata;

import com.rongyi.easy.bdata.entity.CommunalFacilityType;
import com.rongyi.easy.bdata.entity.Floor;
import com.rongyi.easy.bdata.vo.BdataFloorVO;
import com.rongyi.easy.bdata.vo.CommunalFacilityVO;

import java.util.List;
import java.util.Map;

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

	public List<BdataFloor> getMallFloorsDefault(String mallId);

	
	public List<BdataFloorVO> getMallFloors(String mallId,int currentpage, int pagesize,String status);
	
	
	public	String updateOrInsertFloor(BdataFloorVO vo);
	
	public void updateSystemStatus(String floorId,String uId,String reason,int source);
	
	public void sortFloor(String floorId,String type,String updateUserId,int source);
	
	public List<CommunalFacilityType> getCommunalFacilitiesType();
	
	public List<CommunalFacilityVO> getFloorCommunalFacilitiesType(String[] id);
	
	public CommunalFacilityVO getCommunalFacilitiesById(String id);
	
	public void setCommunalFacilityStatus(String id,int status,String updateUserId,int source);
	
	public void saveCommunalFacility(CommunalFacilityVO vo);
	
	public List<CommunalFacilityVO> getFloorCommunalFacilitiesType(Map map);
	
	public void delFloorAndShop(List<BdataFloor> floors);
	
}
