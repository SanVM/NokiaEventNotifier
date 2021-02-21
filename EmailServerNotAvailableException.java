package com.nokia.eventManager;

public class EmailServerNotAvailableException extends Exception {

    public EmailServerNotAvailableException() {
        super();
    }

    public EmailServerNotAvailableException(String message) {
        super(message);
    }

    public EmailServerNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }
}
