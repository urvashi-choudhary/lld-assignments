package com.example.ecom.dtos;

import lombok.Data;

@Data
public class DeleteInventoryResponseDto {
    private ResponseStatus responseStatus;

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
}
