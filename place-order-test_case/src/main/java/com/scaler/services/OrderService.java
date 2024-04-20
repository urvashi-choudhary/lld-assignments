package com.scaler.services;

import java.util.Map;

import com.scaler.exceptions.InvalidMenuItem;
import com.scaler.exceptions.UserNotFoundException;
import com.scaler.models.Order;

public interface OrderService {

    public Order placeOrder(long userId, Map<Long,Integer> orderedItems) throws UserNotFoundException, InvalidMenuItem;

}
