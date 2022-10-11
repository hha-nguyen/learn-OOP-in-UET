package Week_8;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Create 4-parameter constructor.
     * @param brand brand.
     * @param model model.
     * @param registrationNumber resNum.
     * @param owner owner.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Create abstract method to get info.
     * @return info.
     */
    public abstract String getInfo();

    /**
     * Create transferOwnership method.
     * @param newOwner new owner.
     */
    public void transferOwnership(Person newOwner) {
        newOwner.addVehicle(this);

        //Change owner.
        this.owner = newOwner;
        this.owner.removeVehicle(this.registrationNumber);
    }

    /**
     * Create getter method to get brand.
     * @return brand name.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Create setter method to set brand.
     * @param brand brand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Create getter method to get model.
     * @return model name.
     */
    public String getModel() {
        return model;
    }

    /**
     * Create setter method to set model.
     * @param model model.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Create getter method to get Registration Number.
     * @return registration Number.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Create setter method to set resNum.
     * @param registrationNumber resNum.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Create getter method to get owner name.
     * @return owner name.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Create setter method to set owner name.
     * @param owner owner name.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
