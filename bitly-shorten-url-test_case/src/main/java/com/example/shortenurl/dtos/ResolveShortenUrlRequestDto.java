package com.example.shortenurl.dtos;

import lombok.Data;

@Data
public class ResolveShortenUrlRequestDto {
    private String shortenUrl;

	public String getShortenUrl() {
		return shortenUrl;
	}

	public void setShortenUrl(String shortenUrl) {
		this.shortenUrl = shortenUrl;
	}
}
