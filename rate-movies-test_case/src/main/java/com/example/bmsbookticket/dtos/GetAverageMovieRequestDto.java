package com.example.bmsbookticket.dtos;

import lombok.Data;

@Data
public class GetAverageMovieRequestDto {
    public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	private int movieId;
}
