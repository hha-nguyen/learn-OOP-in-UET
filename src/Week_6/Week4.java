package src.Week_6;

public class Week4 {
    public static int max2Int(int m, int n) {
        if (m > n) return m;
        return n;
    }

    public static int minArray(int[] array) {
        int minOfArray = array[0];
        for (int i = 1, length = array.length; i < length; i++) {
            if (array[i] < minOfArray) minOfArray = array[i];
        }

        return minOfArray;
    }

    public static String calculateBMI(double weight, double height) {
        double BMI = weight / Math.pow(height, 2);

        if (BMI < 18.5) return "Thiếu cân";
        if (BMI < 23) return "Bình thường";
        if (BMI < 25) return "Thừa cân";

        return "Béo phì";
    }
}
