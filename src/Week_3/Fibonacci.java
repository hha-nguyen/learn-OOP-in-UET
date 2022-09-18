package src.Week_3;

import java.util.*;

public class Fibonacci {
    public static long maxValue = Long.MAX_VALUE;
    private static long[] fibonacciArray = new long[101];
    private static boolean check = false;

    /**
     * Create fibonacci array.
     */
    public static void setFibonacciArray() {
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < 101; i++) {
            if (fibonacciArray[i - 1] + fibonacciArray[i - 2] > maxValue) {
                fibonacciArray[i] = maxValue;
            } else {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }
        }
    }

    /**
     * Create fibonacci method to find fibonacci number.
     * @param n index of fibonacci number
     * @return fibonacci number
     */
    public static long fibonacci(long n) {
        if (!check) {
            setFibonacciArray();
            check = true;
        }
        if (n < 0) {
            return (long) -1;
        }
        if (fibonacciArray[(int) n] >= 0) {
            return fibonacciArray[(int) n];
        } else {
            return maxValue;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonacci(n) + " ");
    }
}
