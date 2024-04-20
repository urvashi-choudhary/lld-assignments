package com.scaler.controllers;

import com.scaler.dtos.GenerateBillRequestDto;
import com.scaler.dtos.GenerateBillResponseDto;
import com.scaler.dtos.ResponseStatus;
import com.scaler.models.Bill;
import com.scaler.services.OrderService;

public class OrderController {

	private OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	public GenerateBillResponseDto generateBill(GenerateBillRequestDto requestDto) {
		GenerateBillResponseDto responseDto = new GenerateBillResponseDto();
		try {
			Bill bill = orderService.generateBill(requestDto.getUserId());
			responseDto.setBill(bill);
			responseDto.setResponseStatus(ResponseStatus.SUCCESS);
			return responseDto;
		} catch (Exception e) {
			responseDto.setResponseStatus(ResponseStatus.FAILURE);
			return responseDto;
		}
	}

}
