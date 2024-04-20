package com.example.ecom.dtos;

import lombok.Data;

@Data
public class GenerateRecommendationsRequestDto {

    public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	private int productId;
}
