package calculator;

import calculator.factory.impl.CalculatorDecoratorFactory;
import calculator.presenter.Presenter;
import calculator.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View(new Presenter(new CalculatorDecoratorFactory()));
        view.run();
        view.getHistory();
        view.getDisplayHistory();
    }
}