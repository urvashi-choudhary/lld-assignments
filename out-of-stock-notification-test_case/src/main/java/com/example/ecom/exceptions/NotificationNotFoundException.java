package com.example.ecom.exceptions;

public class NotificationNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

	public NotificationNotFoundException(String message) {
        super(message);
    }
}
