package Calculatrice;

public class Multiplication implements Operation {
    @Override
    public double apply(double a, double b) {
        return a * b;
    }

    @Override
    public String symbol() {
        return "*";
    }
}

