package com.project.customException;

public class InvalidDataFormatException extends DataReadingException {

    public InvalidDataFormatException(String source, String reason) {
        super(String.format("Invalid data format in '%s': %s", source, reason));
    }

    public InvalidDataFormatException(String source, String reason, Throwable cause) {
        super(String.format("Invalid data format in '%s': %s", source, reason), cause);
    }
}
