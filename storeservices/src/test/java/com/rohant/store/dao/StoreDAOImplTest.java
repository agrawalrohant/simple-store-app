package com.rohant.store.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rohant.store.dto.Store;

public class StoreDAOImplTest {

	@Test
	public void createShouldCreateAStore() {
		StoreDAO storeDAO = new StoreDAOImpl();
		Store store = new Store();
		store.setId(1);
		store.setName("My First Store");
		store.setDescription("Please be aware this is my first store");
		storeDAO.createStore(store);
		
		Store result = storeDAO.readStore(1);
		
		assertNotNull(result);
		assertEquals("My First Store", result.getName());
	}

}
