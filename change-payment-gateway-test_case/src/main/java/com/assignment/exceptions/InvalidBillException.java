package com.assignment.exceptions;

public class InvalidBillException extends Exception {
    private static final long serialVersionUID = 1L;

	public InvalidBillException(String message) {
        super(message);
    }
}