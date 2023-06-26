package calculator.logger.impl;

import calculator.logger.Loggerable;

import java.time.LocalDateTime;

public class Logger implements Loggerable {
    public void log(String text) {
        System.err.println(LocalDateTime.now() + ": " + text);
    }
}
