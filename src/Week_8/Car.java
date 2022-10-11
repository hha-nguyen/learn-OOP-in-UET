package Week_8;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor.
     * @param brand brand.
     * @param model model.
     * @param registrationNumber resNum.
     * @param owner owner.
     * @param numberOfDoors num of doors.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Override getInfo method.
     * @return Info.
     */
    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: " + this.registrationNumber + "\n"
                + "\tNumber of Doors: " + numberOfDoors + "\n"
                + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }

    /**
     * Create getter method for num of doors.
     * @return num of doors.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Create setter method for num of doors.
     * @param numberOfDoors num of doors.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
