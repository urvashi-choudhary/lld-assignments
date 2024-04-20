package com.example.generateinvoicesolution.services;

import com.example.generateinvoicesolution.exceptions.CustomerSessionNotFoundException;
import com.example.generateinvoicesolution.models.Invoice;

public interface BookingService {
    Invoice generateInvoice(long userId) throws CustomerSessionNotFoundException;
}
