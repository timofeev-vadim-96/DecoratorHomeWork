package calculator.logger.impl.wrapper;

import calculator.dataBase.DataBase;
import calculator.logger.Loggerable;

import java.time.LocalDateTime;

public class LoggerDecorator implements Loggerable {
    private Loggerable logger;
    private DataBase<String> logsHistory;

    public LoggerDecorator(Loggerable logger, DataBase<String> logsHistory) {
        this.logger = logger;
        this.logsHistory = logsHistory;
    }

    @Override
    public void log(String text) {
        logger.log(text);
        logsHistory.add(String.format("%s: %s", LocalDateTime.now(), text));
    }

    public void getHistory() {
        logsHistory.getHistory();
    }
}
