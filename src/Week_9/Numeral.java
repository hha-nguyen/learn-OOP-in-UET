package Week_9;

public class Numeral extends Expression {
    private double value;

    Numeral() {}

    Numeral(double value) {
        this.value = value;
    }

    /**
     * Override toString method.
     * @return string that need to print out.
     */
    @Override
    public String toString() {
        return "" + (int) value;
    }

    /**
     * Override evaluate method.
     * @return value of num.
     */
    @Override
    public double evaluate() {
        return value;
    }
}
