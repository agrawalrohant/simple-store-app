package com.rohant.store.bo;


import java.util.List;

import com.rohant.store.dao.StoreDAO;
import com.rohant.store.dto.Store;

public class StoreBOImpl implements StoreBO {

	StoreDAO storeDAO ;
	
	@Override
	public void create(Store store) {
		storeDAO.createStore(store);

	}

	@Override
	public Store find(int id) {
		return storeDAO.readStore(id);

	}

	@Override
	public void update(Store store) {
		storeDAO.updateStore(store);

	}

	@Override
	public void delete(int id) {
		storeDAO.deleteStore(id);

	}

	public StoreDAO getStoreDAO() {
		return storeDAO;
	}

	public void setStoreDAO(StoreDAO storeDAO) {
		this.storeDAO = storeDAO;
	}

	@Override
	public List<Store> getAllStores() {
		return storeDAO.getAllStores();
	}

}
