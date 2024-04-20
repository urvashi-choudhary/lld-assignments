package com.example.bmsbookticket.dtos;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BookTicketRequestDTO {
    public List<Integer> getShowSeatIds() {
		return showSeatIds;
	}
	public void setShowSeatIds(List<Integer> showSeatIds) {
		this.showSeatIds = showSeatIds;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private List<Integer> showSeatIds;
    private int userId;
}
