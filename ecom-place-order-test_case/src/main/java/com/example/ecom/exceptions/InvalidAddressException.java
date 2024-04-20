package com.example.ecom.exceptions;

public class InvalidAddressException extends Exception {
    private static final long serialVersionUID = 1L;

	public InvalidAddressException(String message) {
        super(message);
    }
}
