package com.scaler.parking_lot.respositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.scaler.parking_lot.models.Ticket;

public class InMemoryTicketRepositoryImpl implements TicketRepository{
    private Map<Long, Ticket> ticketMap;
    private static int id = 0;

    public InMemoryTicketRepositoryImpl() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket save(Ticket ticket) {
        if(ticket.getId() == 0){
            ticket.setId(id++);
        }
        this.ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }

    @Override
    public Optional<Ticket> getTicketById(long ticketId) {
        return Optional.ofNullable(this.ticketMap.get(ticketId));
    }

}
