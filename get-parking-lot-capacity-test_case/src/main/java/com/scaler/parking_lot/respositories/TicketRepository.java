package com.scaler.parking_lot.respositories;

import java.util.Optional;

import com.scaler.parking_lot.models.Ticket;

public interface TicketRepository {
    // Do not modify the method signature, feel free to add new methods

    public Ticket save(Ticket ticket);

    public Optional<Ticket> getTicketById(long ticketId);
}
