package com.example.bmsbookticket.dtos;

import com.example.bmsbookticket.models.Ticket;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BookTicketResponseDTO {
    private ResponseStatus status;
    private Ticket ticket;
	public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}
