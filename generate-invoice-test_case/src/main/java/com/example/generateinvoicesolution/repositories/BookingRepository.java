package com.example.generateinvoicesolution.repositories;

import com.example.generateinvoicesolution.models.Booking;

import java.util.List;

public interface BookingRepository {
    Booking save(Booking booking);

    List<Booking> findBookingByCustomerSession(long customerSessionId);
}
