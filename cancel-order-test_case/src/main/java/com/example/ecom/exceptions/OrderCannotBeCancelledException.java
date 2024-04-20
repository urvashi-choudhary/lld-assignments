package com.example.ecom.exceptions;

public class OrderCannotBeCancelledException extends Exception {
    private static final long serialVersionUID = 1L;

	public OrderCannotBeCancelledException(String message) {
        super(message);
    }
}
