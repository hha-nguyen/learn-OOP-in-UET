package Week_9;

public class Division extends BinaryExpression {
    Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Override toString method.
     * @return string.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * Override evaluate method.
     * @return evaluated expression.
     */
    @Override
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }

        return left.evaluate() / right.evaluate();
    }
}
