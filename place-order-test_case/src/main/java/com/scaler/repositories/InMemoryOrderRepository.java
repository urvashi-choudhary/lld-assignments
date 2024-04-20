package com.scaler.repositories;

import java.util.HashMap;
import java.util.Map;

import com.scaler.models.Order;

public class InMemoryOrderRepository implements OrderRepository{

    private Map<Long, Order> ordersMap;
    private static long idCounter = 0;

    public InMemoryOrderRepository() {
        ordersMap = new HashMap<>();
    }

    @Override
    public Order save(Order order) {
        if(order.getId() == 0){
            order.setId(++idCounter);
        }
        ordersMap.put(order.getId(), order);
        return order;
    }

}
