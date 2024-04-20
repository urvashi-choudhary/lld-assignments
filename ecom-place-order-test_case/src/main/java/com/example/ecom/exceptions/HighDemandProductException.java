package com.example.ecom.exceptions;

public class HighDemandProductException extends Exception {
    private static final long serialVersionUID = 1L;

	public HighDemandProductException(String message) {
        super(message);
    }
}
