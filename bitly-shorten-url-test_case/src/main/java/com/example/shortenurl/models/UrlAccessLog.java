package com.example.shortenurl.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "url_access_logs")
public class UrlAccessLog extends BaseModel{
    @ManyToOne
    private ShortenedUrl shortenedUrl;
    private long accessedAt;
	public ShortenedUrl getShortenedUrl() {
		return shortenedUrl;
	}
	public void setShortenedUrl(ShortenedUrl shortenedUrl) {
		this.shortenedUrl = shortenedUrl;
	}
	public long getAccessedAt() {
		return accessedAt;
	}
	public void setAccessedAt(long accessedAt) {
		this.accessedAt = accessedAt;
	}
}
