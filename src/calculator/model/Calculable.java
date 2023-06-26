package calculator.model;

public interface Calculable {
    double sum();
    double diff();
    double prod();
    double div();
    double pow();
    double sqrt();

    void setX(double a);
    void setY(double b);
    double getX();
    double getY();
}
