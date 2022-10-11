package Week_8;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor.
     * @param brand brand.
     * @param model model.
     * @param registrationNumber resNum.
     * @param owner owner.
     * @param hasSidecar hasSideCar status.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Override getInfo method.
     * @return Info.
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: " + this.registrationNumber + "\n"
                + "\tHas Side Car: " + hasSidecar
                + "\n" + "\tBelongs to " + owner.getName()
                + " - " + owner.getAddress();
    }

    /**
     * Create getter method for hasSidecar status.
     * @return hasSidecar status.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Create setter method for hasSidecar status.
     * @param hasSidecar hasSidecar status.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
