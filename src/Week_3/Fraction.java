package Week_3;
import java.util.*;

public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * create getter and setter method for numerator and denominator.
     */
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * create getter and setter method for numerator and denominator.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * create constructor has 2 parameters.
     * @param numerator init numerator value
     * @param denominator init denominator value
     */

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    /**
     * create no parameter constructor.
     */

    Fraction() {
        numerator = 1;
        denominator = 1;
    }

    /**
     * Create method to find gcd of 2 number.
     * @param a number 1
     * @param b number 2
     * @return gcd of 2 numbers
     */
    int gcd(int a, int b) {
        if (b == 0) {
            if (a < 0) {
                return -a;
            } else {   // a >= 0
                return a;
            }
        }
        return gcd(b, a % b);
    }

    /**
     * Create method to reduce fraction.
     * @return fraction after reducing
     */
    Fraction reduce() {

        int gcd = 1;
int n = Math.abs(this.numerator);
int d = Math.abs(this.denominator);
if (d == 0) {
gcd = n;
} else {
for (int i = 1; i <= n && i <= d; i++) {
 if (n % i == 0 && d % i == 0) {
gcd = i;
}
}
 }
 this.numerator = n / gcd;
this.denominator = d / gcd;
 return this;
    }

    /**
     * Create method to add 2 fraction.
     * @param fraction2 fraction that need to add to
     * @return this fraction after add and reducing
     */
    Fraction add(Fraction fraction2) {
        int a = getNumerator();
        int b = getDenominator();
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();

        setNumerator(a * d + b * c);
        setDenominator(b * d);

        // Reduce new fraction and return;
        return reduce();
    }

    /**
     * Create method to subtract 2 fraction.
     * @param fraction2 fraction that need to subtract
     * @return this fraction after subtract and reducing
     */
    Fraction subtract(Fraction fraction2) {
        int a = getNumerator();
        int b = getDenominator();
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();

        setNumerator(a * d - b * c);
        setDenominator(b * d);

        // Reduce new fraction and return;
        return reduce();
    }

    /**
     * Create method to multiply 2 fraction.
     * @param fraction2 fraction that need to multiply
     * @return this fraction after multiply and reducing
     */
    Fraction multiply(Fraction fraction2) {
        int a = getNumerator();
        int b = getDenominator();
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();

        setNumerator(a * c);
        setDenominator(b * d);

        // Reduce new fraction and return;
        return reduce();
    }

    /**
     * Create method to divide 2 fraction.
     * @param fraction2 fraction that need to divide
     * @return this fraction after divide and reducing
     */
    Fraction divide(Fraction fraction2) {
        int a = getNumerator();
        int b = getDenominator();
        int c = fraction2.getNumerator();
        int d = fraction2.getDenominator();

        // If numerator of fraction 2 is 0 then return this fraction
        if (c == 0) {
            return this;
        }

        setNumerator(a * d);
        setDenominator(b * c);

        return reduce();
    }

    /**
     * Create method to check if 2 fraction is equal or not.
     * @param obj obj that need to check
     * @return result after check (true or false)
     */
    @Override
    public boolean equals(Object obj) {
        // Check if obj has type Solution or not.
        if (obj instanceof Fraction) {
            Fraction a = (Fraction) obj;
            if (this.reduce().numerator == a.reduce().numerator && this.reduce().denominator == a.reduce().denominator) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void print() {
        System.out.print(getNumerator() + "/" + getDenominator() + "\n");
    }

    public static void main(String[] args) {
        Fraction frac = new Fraction (4, 6);
        frac.reduce();
        frac.print();
        //System.out.println(frac.getNumerator() + "/" + frac.getDenominator() + "\n");
        Fraction frac1 = new Fraction (4, 7);
        frac1.subtract(new Fraction(2, 8));
        frac1.print();
        Fraction frac2 = new Fraction (1, 7);
        frac2.add(new Fraction(-4, 6));
        frac2.print();
        Fraction frac3 = new Fraction (5, 6);
        frac3.multiply(new Fraction(2, 7));
        frac3.print();
        Fraction frac4 = new Fraction (4, 7);
        frac4.divide(new Fraction(5, 10));
        frac4.print();
        Fraction frac5 = new Fraction (1, 2);
        System.out.println(frac5.equals(new Fraction(2, 4)));
    }
}
