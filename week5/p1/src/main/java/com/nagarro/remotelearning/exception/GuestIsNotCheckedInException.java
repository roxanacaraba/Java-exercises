package main.java.com.nagarro.remotelearning.exception;

public class GuestIsNotCheckedInException extends RuntimeException {
    public GuestIsNotCheckedInException(String message) {
        super(message);
    }
}
