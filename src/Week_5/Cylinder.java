package src.Week_5;

public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * Create non-parameter constructor.
     */
    public Cylinder() {}

    /**
     * Create constructor with 1 parameter.
     * @param radius radius of this cylinder.
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Create constructor with 2 parameter.
     * @param radius radius of this cylinder.
     * @param height height of this cylinder.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Create constructor with 2 parameter.
     * @param radius radius of this cylinder.
     * @param height height of this cylinder.
     * @param color color of this cylinder.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * getter method.
     * @return height of circle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * setter method.
     * @param height radius of circle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * method to get volume of cylinder.
     * @return volume.
     */
    public double getVolume() {
        return 2 * height * PI * this.getRadius();
    }

    /**
     * method to get string to print.
     * @return string.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ","
                + "height=" + height + "]";
    }

    /**
     * method to get area.
     * @return area.
     */
    @Override
    public double getArea() {
        return 2 * PI * this.getRadius() * (this.getRadius() + this.getHeight());
    }

    /**
     * main method.
     * @param args arg.
     */
    public static void main(String[] args) {
        Cylinder c = new Cylinder(4, 6, "Pink");
        System.out.println(c.getVolume());
        System.out.println(c.getArea());
        System.out.println(c.toString());
    }
}

