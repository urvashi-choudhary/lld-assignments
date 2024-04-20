package com.scaler.repositories;

import com.scaler.models.DietaryRequirement;
import com.scaler.models.MenuItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryMenuRepositoryImpl implements MenuRepository{

    private Map<Long, MenuItem> menuItems;
    private static long idCounter = 0;

    public InMemoryMenuRepositoryImpl() {
        menuItems = new HashMap<>();
    }

    @Override
    public MenuItem add(MenuItem menuItem) {
        if(menuItem.getId() == 0){
            menuItem.setId(++idCounter);
        }
        menuItems.put(menuItem.getId(), menuItem);
        return menuItem;
    }

    @Override
    public List<MenuItem> getAll() {
        return menuItems.values().stream().toList();
    }

    @Override
    public List<MenuItem> getByDietaryRequirement(DietaryRequirement dietaryRequirement) {
        return menuItems.values().stream().filter(menuItem -> menuItem.getDietaryRequirement() == dietaryRequirement).toList();
    }

    @Override
    public MenuItem save(MenuItem menuItem) {
        if(menuItem.getId() == 0){
            menuItem.setId(++idCounter);
        }
        menuItems.put(menuItem.getId(), menuItem);
        return menuItem;
    }
}
