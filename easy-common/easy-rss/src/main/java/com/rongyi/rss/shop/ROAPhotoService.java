package com.rongyi.rss.shop;

import java.util.List;

public interface ROAPhotoService {
	
	public List<String> getShopPhotosByOwnerIdAndOwnerType(String ownerId,String ownerType);

	public  void delShopByType(String ownerId,String ownerType);
}
