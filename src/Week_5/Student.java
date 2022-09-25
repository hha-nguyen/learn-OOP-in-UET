package Week_5;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    private String name;

    /**
     * Create constructor.
     * @param name name of student.
     * @param address address of student.
     * @param program program of student.
     * @param year year of student.
     * @param fee fee that student need to pay.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * getter program method.
     * @return program.
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * setter program method.
     * @param program program.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * getter year method.
     * @return year.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * setter year method.
     * @param year year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * getter fee method.
     * @return fee.
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * setter fee method.
     * @param fee fee.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Create method to return string to print out.
     * @return string.
     */
    public String toString() {
        return "Student[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],program=" + program
                + ",year=" + year
                + ",fee=" + fee + "]";
    }

    /**
     * main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Student a = new Student("Ha", "Ha Noi", "Normal", 2022, 12);
        System.out.print(a.toString());
    }
}