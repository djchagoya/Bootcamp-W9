package com.mercadolibre.linktracker.exception;

public class EmptyPasswordException extends LinkException {
    public EmptyPasswordException() {
        super();
    }

    public EmptyPasswordException(String message) {
        super(message);
    }
}
