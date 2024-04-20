package com.scaler.exceptions;

public class InvalidMenuItem extends Exception{

    private static final long serialVersionUID = 1L;

	public InvalidMenuItem(String message) {
        super(message);
    }
}
