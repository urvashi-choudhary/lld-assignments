package com.example.bookroomsolution.exceptions;

public class InvalidRoomException extends Exception {
    private static final long serialVersionUID = 1L;

	public InvalidRoomException(String message) {
        super(message);
    }
}
