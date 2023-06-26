package calculator.factory.impl;

import calculator.dataBase.impl.History;
import calculator.factory.Factory;
import calculator.logger.impl.Logger;
import calculator.logger.impl.wrapper.LoggerDecorator;
import calculator.model.Calculable;
import calculator.model.impl.Calculator;
import calculator.model.impl.wrapper.CalculatorDecorator;

public class CalculatorDecoratorFactory implements Factory {
    @Override
    public Calculable create() {
        return new CalculatorDecorator(new Calculator(), new LoggerDecorator(new Logger(), new History<>()));
    }
}
