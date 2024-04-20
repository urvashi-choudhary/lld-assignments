package com.scaler.services;

import com.scaler.models.*;
import com.scaler.repositories.MenuRepository;

import java.util.List;

public class MenuServiceImpl implements MenuService{

    private MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<MenuItem> getMenuItems(String itemType) {
        if(itemType == null){
            return menuRepository.getAll();
        } else{
            return menuRepository.getByDietaryRequirement(DietaryRequirement.valueOf(itemType));
        }
    }
}
