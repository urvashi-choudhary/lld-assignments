package com.example.ecom.dtos;

import com.example.ecom.models.Inventory;
import lombok.Data;

@Data
public class UpdateInventoryResponseDto {
    public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	private Inventory inventory;
    private ResponseStatus responseStatus;
}
