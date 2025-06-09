package com.project.customException;

public class DataReadingException extends RuntimeException {
    public DataReadingException(String message) {
        super(message);
    }

    public DataReadingException(String message, Throwable cause) {
        super(message, cause);
    }
}
