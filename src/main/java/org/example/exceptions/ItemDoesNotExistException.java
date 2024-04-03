package org.example.exceptions;

public class ItemDoesNotExistException extends RuntimeException {
    public ItemDoesNotExistException(String message) {
        super(message);
    }
}
