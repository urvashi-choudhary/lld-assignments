package com.example.generateinvoicesolution.dtos;

import com.example.generateinvoicesolution.models.Invoice;

public class GenerateInvoiceResponseDto {
    private ResponseStatus responseStatus;
    private Invoice invoice;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
