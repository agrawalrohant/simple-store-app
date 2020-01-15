package com.rohant.store.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rohant.store.dto.Store;

public class StoreDAOImpl implements StoreDAO {
	
	Map<Integer, Store> storeMap = new HashMap<>();

	@Override
	public void createStore(Store store) {
		storeMap.put(store.getId(), store);
	}

	@Override
	public Store readStore(int id) {
		return storeMap.get(id);
	}

	@Override
	public void updateStore(Store store) {
		storeMap.put(store.getId(), store);
	}

	@Override
	public void deleteStore(int id) {
		storeMap.remove(id);
	}

	@Override
	public List<Store> getAllStores() {
		return new ArrayList<>(storeMap.values());
	}

}
