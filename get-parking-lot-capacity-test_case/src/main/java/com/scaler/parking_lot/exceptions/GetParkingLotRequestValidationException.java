package com.scaler.parking_lot.exceptions;

public class GetParkingLotRequestValidationException extends Exception {
    private static final long serialVersionUID = 1L;

	public GetParkingLotRequestValidationException() {
    }

    public GetParkingLotRequestValidationException(String message) {
        super(message);
    }
}
