package com.example.bmsbookticket.dtos;

import lombok.Data;

@Data
public class LoginResponseDto {
    private boolean loggedIn;
    public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}
	private ResponseStatus responseStatus;
}
