package calculator.presenter;

import calculator.factory.Factory;
import calculator.logger.impl.ViewLogger;
import calculator.model.Calculable;
import calculator.model.impl.wrapper.CalculatorDecorator;

public class Presenter {
    Factory calcFactory;
    Calculable model;
    ViewLogger viewLogger;

    public Presenter(Factory factory) {
        this.calcFactory = factory;
        model = factory.create();
        viewLogger = new ViewLogger();
    }

    public double sum(double a, double b) {
        setArguments(a, b);
        return model.sum();
    }

    public double diff(double a, double b) {
        setArguments(a, b);
        return model.diff();
    }

    public double prod(double a, double b) {
        setArguments(a, b);
        return model.prod();
    }

    public double div(double a, double b) {
        setArguments(a, b);
        return model.div();
    }

    public void setArguments(double a, double b) {
        model.setX(a);
        model.setY(b);
    }

    public void getHistory() {
        if (model instanceof CalculatorDecorator) ((CalculatorDecorator) model).getHistory();
    }

    public void log(String text) {
        viewLogger.log(text);
    }

    public void getDisplayHistory() {
        viewLogger.getHistory();
    }

    public double pow(double a, double b) {
        setArguments(a, b);
        return model.pow();
    }

    public double sqrt(double a) {
        model.setX(a);
        return model.sqrt();
    }
}
