package com.scaler.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.scaler.exceptions.UnAuthorizedAccess;
import com.scaler.exceptions.UserNotFoundException;
import com.scaler.models.DietaryRequirement;
import com.scaler.models.ItemType;
import com.scaler.models.MenuItem;
import com.scaler.models.User;
import com.scaler.models.UserType;
import com.scaler.repositories.MenuRepository;
import com.scaler.repositories.UserRepository;

public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuRepository menuRepository;
	@Autowired
	private UserRepository userRepository;

	@Override
	public MenuItem addMenuItem(long userId, String name, double price, String dietaryRequirement, String itemType,
			String description) throws UserNotFoundException, UnAuthorizedAccess {
		Optional<User> userOptional = userRepository.findById(userId);
		if (userOptional.isEmpty()) {
			throw new UserNotFoundException("User not found");
		}
		User user = userOptional.get();
		if (user.getUserType() != UserType.ADMIN) {
			throw new UnAuthorizedAccess("User is not an admin");
		}
		MenuItem menuItem = new MenuItem();
		menuItem.setName(name);
		menuItem.setPrice(price);
		menuItem.setDietaryRequirement(DietaryRequirement.valueOf(dietaryRequirement));
		menuItem.setItemType(ItemType.valueOf(itemType));
		menuItem.setDescription(description);
		menuItem = menuRepository.add(menuItem);
		return menuItem;
	}

}
