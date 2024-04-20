package com.example.ecom.dtos;

import lombok.Data;

@Data
public class CancelOrderRequestDto {
    public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private int orderId;
    private int userId;
}
