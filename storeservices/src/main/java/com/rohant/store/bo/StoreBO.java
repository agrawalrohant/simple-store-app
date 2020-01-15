package com.rohant.store.bo;

import com.rohant.store.dto.Store;

public interface StoreBO {
	
	public void create(Store store);
	
	public Store find(int id);
	
	public void update(Store store);
	
	public void delete(int id);

}
