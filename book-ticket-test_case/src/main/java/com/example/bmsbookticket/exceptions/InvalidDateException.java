package com.example.bmsbookticket.exceptions;

public class InvalidDateException extends Exception{
    private static final long serialVersionUID = 1L;

	public InvalidDateException(String message) {
        super(message);
    }
}
