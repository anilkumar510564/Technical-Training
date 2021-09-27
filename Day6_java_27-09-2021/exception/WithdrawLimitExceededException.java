package com.torryharris.exception;

public class WithdrawLimitExceededException extends Exception {
    public WithdrawLimitExceededException(String message) {
        super(message);
    }
}
