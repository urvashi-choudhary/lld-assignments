package com.example.tttwinnercheckersolution.exceptions;

public class InvalidMoveException extends Exception {
    private static final long serialVersionUID = 1L;

	public InvalidMoveException(String message) {
        super(message);
    }
}
