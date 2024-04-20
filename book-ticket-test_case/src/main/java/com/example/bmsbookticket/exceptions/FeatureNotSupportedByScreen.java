package com.example.bmsbookticket.exceptions;

public class FeatureNotSupportedByScreen extends Exception{
    private static final long serialVersionUID = 1L;

	public FeatureNotSupportedByScreen(String message) {
        super(message);
    }
}
