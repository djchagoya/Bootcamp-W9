package com.mercadolibre.linktracker.controller;

import com.mercadolibre.linktracker.exception.EmptyPasswordException;
import com.mercadolibre.linktracker.exception.IdException;
import com.mercadolibre.linktracker.exception.PasswordException;
import com.mercadolibre.linktracker.exception.UrlException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UrlException.class)
    public ResponseEntity handleInvalidUrlException(HttpServletRequest request, Exception ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Collections.singletonMap("Message", "Invalid url Jack"));
    }

    @ExceptionHandler(PasswordException.class)
    public ResponseEntity handleInvalidPasswordException(HttpServletRequest request, Exception ex) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(Collections.singletonMap("Message", "Invalid Password Jack"));
    }

    @ExceptionHandler(IdException.class)
    public ResponseEntity handleInvalidIdException(HttpServletRequest request, Exception ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonMap("Message", "Invalid Id Jack"));
    }

    @ExceptionHandler(EmptyPasswordException.class)
    public ResponseEntity handleEmptyPasswordException(HttpServletRequest request, Exception ex) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(Collections.singletonMap("Message", "Password can´t be empty"));
    }
}
