package calculator.logger.impl;

import calculator.dataBase.DataBase;
import calculator.dataBase.impl.History;
import calculator.logger.Loggerable;

import java.time.LocalDateTime;

public class ViewLogger implements Loggerable {
    private DataBase<String> db;

    public ViewLogger() {
        this.db = new History<>();
    }

    @Override
    public void log(String text) {
        db.add(String.format("%s. Введенное значение: %s", LocalDateTime.now(), text));
    }

    public void getHistory() {
        db.getHistory();
    }
}
