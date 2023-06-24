package main.java.com.nagarro.remotelearning;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now) + " LOG: " +  message);
    }
}
