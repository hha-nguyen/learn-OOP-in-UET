package Week_9;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Create 2-parameter constructor.
     * @param left left.
     * @param right right.
     */
    BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
