package com.rohant.store.dao;

import com.rohant.store.dto.Store;

public interface StoreDAO {
	
	void createStore(Store store);
	
	Store readStore(int id);
	
	void updateStore(Store store);
	
	void deleteStore(int id);

}
