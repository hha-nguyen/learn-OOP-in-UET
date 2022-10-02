package Week_9;

public class ExpressionTest {
    /**
     * Main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Expression numeral1 = new Numeral(10);
        Expression numeral2 = new Numeral(-3);
        Expression numeral3 = new Numeral(4);
        Expression numeral4 = new Numeral(3);
        Expression numeral5 = new Numeral(0);

        Square squareResult = new Square(numeral1);
        Addition addResult = new Addition(squareResult, numeral2);
        Multiplication multiResult = new Multiplication(numeral3, numeral4);
        Addition addResult1 = new Addition(addResult, multiResult);
        Square result1 = new Square(addResult1);
        System.out.println(result1.evaluate());

        try {
            Division result2 = new Division(numeral1, numeral5);
            System.out.println(result2.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("An exception");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
