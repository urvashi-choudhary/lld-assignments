package com.scaler.parking_lot.exceptions;

public class InvalidGateException extends Exception{
    private static final long serialVersionUID = 1L;

	public InvalidGateException(String message) {
        super(message);
    }
}
