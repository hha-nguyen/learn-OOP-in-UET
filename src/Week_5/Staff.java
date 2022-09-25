package Week_5;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Create constructor method.
     * @param name name of staff.
     * @param address address of staff.
     * @param school school of staff.
     * @param pay fee that staff must be paid.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    /**
     * getter school method.
     * @return school.
     */
    public String getSchool() {
        return school;
    }

    /**
     * setter school method.
     * @param school school.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * getter pay method.
     * @return pay.
     */
    public double getPay() {
        return pay;
    }

    /**
     * setter pay method.
     * @param pay pay.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Create method to return string that print out.
     * @return string.
     */
    public String toString() {
        return "Staff[Person[name=" + getName()
                + ",address=" + getAddress()
                + "],school=" + school
                + ",pay=" + pay + "]";
    }

    /**
     * main method.
     * @param args arg.
     */
    public static void main(String[] args) {
        Staff a = new Staff("Ha", "Ha Noi", "UET", 12);
        System.out.print(a.toString());
    }
}
