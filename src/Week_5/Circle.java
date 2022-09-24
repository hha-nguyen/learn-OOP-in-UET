package src.Week_5;

public class Circle {
    protected static final double PI = Math.PI;
    private double radius = 1.0;
    private String color = "red";

    /**
     * Create non-parameter constructor.
     */
    public Circle() {}

    /**
     * Create constructor with 1 parameter.
     * @param radius radius of this circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Create constructor with 2 parameter.
     * @param radius radius of this circle.
     * @param color color of this circle.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * getter method.
     * @return radius of circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter method.
     * @param radius radius of circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getter method.
     * @return color of circle.
     */
    public String getColor() {
        return color;
    }

    /**
     * setter method.
     * @param color radius of circle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * method to get area of circle.
     * @return area.
     */
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    /**
     * method to get string to print.
     * @return string.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
