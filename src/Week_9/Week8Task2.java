//package Week_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Week8Task2 {
    /**
     * Create nullPointerEx method.
     * @return null pointer.
     * @throws NullPointerException ex.
     */
    public int nullPointerEx() throws NullPointerException {
        Week8Task2 nullVar = null;

        return nullVar.arrayIndexOutOfBoundsEx();
    }

    /**
     * Create method to test if pointer is null or not.
     * @return result.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Create arrayIndexOutOfBoundsEx method.
     * @return element of testing array.
     * @throws ArrayIndexOutOfBoundsException ex.
     */
    public int arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] testingArray = new int[5];
        return testingArray[6];
    }

    /**
     * Create testing method for arrayIndexOutOfBoundsEx.
     * @return result.
     */

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Create arithmeticEx method.
     */

    public void arithmeticEx() {
        int testingNumber = 1;
        System.out.print(testingNumber / 0);
    }

    /**
     * Create testing method for arithmeticEx.
     * @return result.
     */

    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * Create fileNotFoundEx method.
     * @throws FileNotFoundException ex.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader testingFile = new FileReader("testFile.txt");
        testingFile.toString();
    }

    /**
     * Create test method for fileNotFoundEx.
     * @return result.
     */

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * Create ioEx method.
     * @throws IOException ex.
     */
    public void ioEx() throws IOException {
        InputStream inputStream = null;
        inputStream = new FileInputStream("testFile.txt");
        inputStream.toString();
    }

    /**
     * Create testing method for ioEx.
     * @return testing result.
     */

    public String ioExTest() {
        try {
            ioEx();
        } catch (Exception e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

    /**
     * Create main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Week8Task2 week8Task2Test = new Week8Task2();
        System.out.println(week8Task2Test.nullPointerExTest());
        System.out.println(week8Task2Test.ioExTest());
        System.out.println(week8Task2Test.arithmeticExTest());
        System.out.println(week8Task2Test.arrayIndexOutOfBoundsExTest());
        System.out.println(week8Task2Test.fileNotFoundExTest());
    }
}
