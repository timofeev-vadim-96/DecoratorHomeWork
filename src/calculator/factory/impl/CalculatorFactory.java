package calculator.factory.impl;

import calculator.factory.Factory;
import calculator.model.Calculable;
import calculator.model.impl.Calculator;

public class CalculatorFactory implements Factory {
    @Override
    public Calculable create() {
        return new Calculator();
    }
}
