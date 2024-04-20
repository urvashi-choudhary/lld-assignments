package com.example.ecom.dtos;

import lombok.Data;

@Data
public class DeregisterUserForNotificationResponseDto {
    public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	private ResponseStatus responseStatus;
}
