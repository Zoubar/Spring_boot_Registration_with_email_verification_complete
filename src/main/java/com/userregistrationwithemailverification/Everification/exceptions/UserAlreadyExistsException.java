package com.userregistrationwithemailverification.Everification.exceptions;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {

                super(message);
    }
}
