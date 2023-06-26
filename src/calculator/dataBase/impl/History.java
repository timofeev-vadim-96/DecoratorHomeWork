package calculator.dataBase.impl;

import calculator.dataBase.DataBase;

import java.util.ArrayList;
import java.util.List;

public class History<T> implements DataBase<T> {
    private final List<T> logsHistory;

    public History() {
        logsHistory = new ArrayList<>();
    }

    public History<T> add(T inputArg) {
        logsHistory.add(inputArg);
        return this;
    }

    public void getHistory() {
        for (T log : logsHistory) {
            System.out.println(log);
        }
    }
}
