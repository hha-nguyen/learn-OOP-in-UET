package Week_6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Week4 {
    /**
     * Create method to compare 2 ints and find max of them.
     * @param m num1
     * @param n num2
     * @return max result
     */
    public static int max2Int(int m, int n) {
        if (m > n) return m;
        return n;
    }

    /**
     * Create method to find min of array.
     * @param array array pass in.
     * @return min of array.
     */
    public static int minArray(int[] array) {
        int minOfArray = array[0];
        for (int i = 1, length = array.length; i < length; i++) {
            if (array[i] < minOfArray) minOfArray = array[i];
        }

        return minOfArray;
    }

    /**
     * Create method to round number.
     * @param value number passed in.
     * @param places place to round.
     * @return result.
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /**
     * Create method to calculate BMI.
     * @param weight weight
     * @param height height
     * @return BMI result.
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = round(weight / Math.pow(height, 2), 1);
        if (BMI < 18.5) return "Thiếu cân";
        if (BMI < 23) return "Bình thường";
        if (BMI < 25) return "Thừa cân";

        return "Béo phì";
    }
}
