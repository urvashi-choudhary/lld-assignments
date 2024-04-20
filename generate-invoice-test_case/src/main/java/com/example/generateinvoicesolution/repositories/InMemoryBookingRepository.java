package com.example.generateinvoicesolution.repositories;

import com.example.generateinvoicesolution.models.Booking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookingRepository implements BookingRepository {
    private Map<Long, Booking> bookingMap;
    private static long idCounter = 0;

    public InMemoryBookingRepository() {
        bookingMap = new HashMap<>();
    }

    @Override
    public Booking save(Booking booking) {
        if (booking.getId() == 0) {
            booking.setId(++idCounter);
        }
        bookingMap.put(booking.getId(), booking);
        return booking;
    }

    @Override
    public List<Booking> findBookingByCustomerSession(long customerSessionId) {
        return bookingMap.values().stream().filter(booking -> booking.getCustomerSession().getId() == customerSessionId).toList();
    }
}
