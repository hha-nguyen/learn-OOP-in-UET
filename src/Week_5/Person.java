package src.Week_5;

public class Person {
    private String name;
    private String address;

    /**
     * Create constructor with 2 parameters.
     * @param name name of person.
     * @param address address of person.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * getter method of name.
     * @return name of person.
     */
    public String getName() {
        return name;
    }

    /**
     * getter method of address.
     * @return address of person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter method of address.
     * @param address address of person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * create method to return string to print out.
     * @return string.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }

    /**
     * main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Person a = new Person("Ha", "Ha Noi");
        System.out.print(a.toString());
    }
}
