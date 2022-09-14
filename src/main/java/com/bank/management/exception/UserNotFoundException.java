package com.bank.management.exception;


public class UserNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public UserNotFoundException(String msg) {
        super(msg);
    }

}
