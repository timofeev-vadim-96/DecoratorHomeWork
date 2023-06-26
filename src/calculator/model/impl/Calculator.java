package calculator.model.impl;

import calculator.model.Calculable;

public class Calculator implements Calculable {
    private double x;
    private double y;

    public double sum() {
        return x + y;
    }
    public double diff() {return x - y;}
    public double prod() {
        return x * y;
    }
    public double div() {
        return x / y;
    }

    @Override
    public double pow() {
        return 0;
    }

    @Override
    public double sqrt() {
        return 0;
    }

    public void setX(double value) {
        this.x = value;
    }

    public void setY(double value) {
        this.y = value;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
