package com.example.generateinvoicesolution.controllers;

import com.example.generateinvoicesolution.dtos.GenerateInvoiceRequestDto;
import com.example.generateinvoicesolution.dtos.GenerateInvoiceResponseDto;
import com.example.generateinvoicesolution.dtos.ResponseStatus;
import com.example.generateinvoicesolution.models.Invoice;
import com.example.generateinvoicesolution.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public GenerateInvoiceResponseDto generateInvoice(GenerateInvoiceRequestDto requestDto) {
        GenerateInvoiceResponseDto responseDto = new GenerateInvoiceResponseDto();
        try {
            Invoice invoice = bookingService.generateInvoice(requestDto.getUserId());
            responseDto.setInvoice(invoice);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
