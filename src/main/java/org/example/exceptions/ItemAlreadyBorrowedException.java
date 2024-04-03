package org.example.exceptions;

public class ItemAlreadyBorrowedException extends RuntimeException {
    public ItemAlreadyBorrowedException(String message) {
        super(message);
    }
}
