package com.example.ecom.dtos;

import com.example.ecom.models.Order;
import lombok.Data;

@Data
public class CancelOrderResponseDto {
    public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	private ResponseStatus status;
    private Order order;
}
