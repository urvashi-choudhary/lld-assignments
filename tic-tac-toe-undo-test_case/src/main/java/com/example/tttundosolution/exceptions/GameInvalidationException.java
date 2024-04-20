package com.example.tttundosolution.exceptions;

public class GameInvalidationException extends Exception {
    private static final long serialVersionUID = 1L;

	public GameInvalidationException(String message) {
        super(message);
    }
}
