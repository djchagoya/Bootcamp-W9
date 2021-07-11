package com.mercadolibre.linktracker.exception;

import com.mercadolibre.linktracker.exception.LinkException;

public class PasswordException extends LinkException {
    public PasswordException() {
        super();
    }

    public PasswordException(String message) {
        super(message);
    }
}
