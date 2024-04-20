package com.example.bmsbookticket.dtos;

import lombok.Data;

@Data
public class RateMovieRequestDto {
    public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	private int userId;
    private int movieId;
    private int rating;
}
