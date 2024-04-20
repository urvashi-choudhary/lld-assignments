package com.scaler.repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.scaler.models.MenuItem;

public class InMemoryMenuItemRepositoryImpl implements MenuItemRepository {

	private Map<Long, MenuItem> menuItems;
	private static long idCounter = 0;

	public InMemoryMenuItemRepositoryImpl() {
		menuItems = new HashMap<>();
	}

	@Override
	public MenuItem add(MenuItem menuItem) {
		if (menuItem.getId() == 0) {
			menuItem.setId(++idCounter);
		}
		menuItems.put(menuItem.getId(), menuItem);
		return menuItem;
	}

	@Override
	public Optional<MenuItem> findById(long id) {
		return menuItems.values().stream().filter(menuItem -> menuItem.getId() == id).findFirst();
	}
}
