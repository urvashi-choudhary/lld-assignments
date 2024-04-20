package com.example.ecom.exceptions;

public class GiftCardExpiredException extends Exception{
    private static final long serialVersionUID = 1L;

	public GiftCardExpiredException(String message) {
        super(message);
    }
}
