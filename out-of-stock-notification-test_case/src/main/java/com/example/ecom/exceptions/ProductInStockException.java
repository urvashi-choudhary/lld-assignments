package com.example.ecom.exceptions;

public class ProductInStockException extends Exception {
    private static final long serialVersionUID = 1L;

	public ProductInStockException(String message) {
        super(message);
    }
}
