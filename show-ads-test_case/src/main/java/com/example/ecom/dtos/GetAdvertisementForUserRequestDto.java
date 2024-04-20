package com.example.ecom.dtos;

import lombok.Data;

@Data
public class GetAdvertisementForUserRequestDto {
    public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	private int userId;
}
