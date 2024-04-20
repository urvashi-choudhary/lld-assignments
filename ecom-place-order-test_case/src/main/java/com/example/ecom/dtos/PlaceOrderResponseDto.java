package com.example.ecom.dtos;

import com.example.ecom.models.Order;
import lombok.Data;

@Data
public class PlaceOrderResponseDto {
    private Order order;
    public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	private ResponseStatus status;
}
