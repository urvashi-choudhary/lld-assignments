package com.example.bmsbookticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.bmsbookticket.dtos.GetAverageMovieRequestDto;
import com.example.bmsbookticket.dtos.GetAverageMovieResponseDto;
import com.example.bmsbookticket.dtos.RateMovieRequestDto;
import com.example.bmsbookticket.dtos.RateMovieResponseDto;
import com.example.bmsbookticket.dtos.ResponseStatus;
import com.example.bmsbookticket.models.Rating;
import com.example.bmsbookticket.services.RatingsService;

@Controller
public class RatingsController {
	@Autowired
	private RatingsService ratingsService;

	public RateMovieResponseDto rateMovie(RateMovieRequestDto requestDto) {
		RateMovieResponseDto responseDto = new RateMovieResponseDto();
		try {
			Rating rating = ratingsService.rateMovie(requestDto.getUserId(), requestDto.getMovieId(),
					requestDto.getRating());
			responseDto.setRating(rating);
			responseDto.setResponseStatus(ResponseStatus.SUCCESS);
			return responseDto;
		} catch (Exception e) {
			responseDto.setResponseStatus(ResponseStatus.FAILURE);
			return responseDto;
		}
	}

	public GetAverageMovieResponseDto getAverageMovieRating(GetAverageMovieRequestDto requestDto) {
		GetAverageMovieResponseDto responseDto = new GetAverageMovieResponseDto();
		try {
			double averageRating = ratingsService.getAverageRating(requestDto.getMovieId());
			responseDto.setAverageRating(averageRating);
			responseDto.setResponseStatus(ResponseStatus.SUCCESS);
			return responseDto;
		} catch (Exception e) {
			responseDto.setResponseStatus(ResponseStatus.FAILURE);
			return responseDto;
		}
	}
}
