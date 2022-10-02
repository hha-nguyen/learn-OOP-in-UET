package Week_9;

public class Square extends Expression {
    private Expression expression;

    /**
     * Create 1-parameter constructor.
     * @param expression expression.
     */
    Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Override toString method to print out.
     * @return string.
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * Override evaluate method.
     * @return expression after evaluate.
     */
    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
