package com.example.shortenurl.dtos;

import lombok.Data;

@Data
public class ResolveShortenUrlResponseDto {
    public String getOriginalUrl() {
		return originalUrl;
	}
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	private String originalUrl;
    private ResponseStatus status;
}
