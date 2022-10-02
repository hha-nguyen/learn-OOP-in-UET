package Week_9;

public class Subtraction extends BinaryExpression {
    Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Override toString method.
     * @return string.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    /**
     * Override evaluate method.
     * @return evaluated expression.
     */
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
