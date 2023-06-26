package calculator.model.impl.wrapper;

import calculator.logger.Loggerable;
import calculator.logger.impl.wrapper.LoggerDecorator;
import calculator.model.Calculable;

public class CalculatorDecorator implements Calculable {
    private Calculable calc;
    private Loggerable logger;

    public CalculatorDecorator(Calculable calc, Loggerable logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public double sum() {
        logger.log("Суммирую " + getX() + " " + getY());
        logger.log("Результат: " + calc.sum());
        return calc.sum();
    }

    @Override
    public double diff() {
        logger.log("Вычитаю " + getX() + " " + getY());
        logger.log("Результат: " + calc.diff());
        return calc.diff();
    }

    @Override
    public double prod() {
        logger.log("Умножаю " + getX() + " " + getY());
        logger.log("Результат: " + calc.prod());
        return calc.prod();
    }

    @Override
    public double div() {
        logger.log("Произвожу деление " + getX() + " " + getY());
        logger.log("Результат: " + calc.div());
        return calc.div();
    }

    public double pow() {
        double a = getX();
        double b = getY();
        logger.log(String.format("Возвожу %s в степень %s", getX(), getY()));
        logger.log("Результат: " + Math.pow(a, b));
        return Math.pow(a, b);
    }

    public double sqrt() {
        double a = getX();
        logger.log("Вывожу квадратный корень числа " + a);
        logger.log("Результат: " + Math.sqrt(a));
        return Math.sqrt(a);
    }

    public double getX() {
        return calc.getX();
    }

    public double getY() {
        return calc.getY();
    }

    public void setX(double a){
        calc.setX(a);
    }

    public void setY(double b){
        calc.setY(b);
    }

    public void getHistory() {
        if (logger instanceof LoggerDecorator) ((LoggerDecorator) logger).getHistory();
    }
}
