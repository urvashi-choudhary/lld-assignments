package com.scaler.parking_lot.exceptions;

public class InvalidParkingLotException extends Exception{
    private static final long serialVersionUID = 1L;

	public InvalidParkingLotException(String message) {
        super(message);
    }
}
