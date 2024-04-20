package com.example.ecom.dtos;

import lombok.Data;

@Data
public class UpdateInventoryRequestDto {
    public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private int productId;
    private int quantity;
}
