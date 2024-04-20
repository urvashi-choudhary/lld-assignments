package com.example.ecom.exceptions;

public class OrderDoesNotBelongToUserException extends Exception {
    private static final long serialVersionUID = 1L;

	public OrderDoesNotBelongToUserException(String message) {
        super(message);
    }
}
