package com.scaler.exceptions;

public class UnAuthorizedAccess extends Exception{
    private static final long serialVersionUID = 1L;

	public UnAuthorizedAccess(String message) {
        super(message);
    }
}
