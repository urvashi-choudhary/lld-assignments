package com.example.ecom.exceptions;

public class GiftCardDoesntExistException extends Exception{
    private static final long serialVersionUID = 1L;

	public GiftCardDoesntExistException(String message) {
        super(message);
    }
}
