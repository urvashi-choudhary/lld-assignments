package com.scaler.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.scaler.dtos.AddMenuItemRequestDto;
import com.scaler.dtos.AddMenuItemResponseDto;
import com.scaler.dtos.ResponseStatus;
import com.scaler.models.MenuItem;
import com.scaler.services.MenuService;

public class MenuController {
	@Autowired
	private MenuService menuService;

	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	public AddMenuItemResponseDto addMenuItem(AddMenuItemRequestDto requestDto) {
		AddMenuItemResponseDto responseDto = new AddMenuItemResponseDto();
		try {
			MenuItem menuItem = menuService.addMenuItem(requestDto.getUserId(), requestDto.getName(),
					requestDto.getPrice(), requestDto.getDietaryRequirement(), requestDto.getItemType(),
					requestDto.getDescription());
			responseDto.setMenuItem(menuItem);
			responseDto.setStatus(ResponseStatus.SUCCESS);
			return responseDto;
		} catch (Exception e) {
			responseDto.setStatus(ResponseStatus.FAILURE);
			return responseDto;
		}
	}
}
