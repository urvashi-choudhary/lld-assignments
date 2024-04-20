package com.example.ecom.dtos;

import com.example.ecom.models.Product;
import lombok.Data;

import java.util.List;

@Data
public class GenerateRecommendationsResponseDto {

    private List<Product> recommendations;
    public List<Product> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Product> recommendations) {
		this.recommendations = recommendations;
	}
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	private ResponseStatus responseStatus;
}
