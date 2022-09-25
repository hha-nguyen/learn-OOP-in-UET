package Week_7;

import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * Create non parameter method.
     */
    public Circle() {

    }

    /**
     * Create 1 parameter method.
     * @param radius radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Create 3 parameter method.
     * @param radius radius.
     * @param color color.
     * @param filled filled.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Create 4 parameter method.
     * @param center center.
     * @param radius radius.
     * @param color color.
     * @param filled filled.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /**
     * Create getter radius method.
     * @return radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Create setter radius method.
     * @param radius radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Create getter center method.
     * @return center.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Create setter center method.
     * @param center center.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Create method to get area.
     * @return area.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Create method to get perimeter.
     * @return perimeter.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Create method to compare 2 circle.
     * @param o circle.
     * @return boolean value.
     */

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0
                && Objects.equals(center, circle.center);
    }

    /**
     * Create hash code method.
     * @return object after hash.
     */
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    /**
     * Create method to return string that print out.
     * @return string.
     */

    public String toString() {
        return "Circle[center=" + center.toString() + ",radius="
                + radius + ",color=" + color
                + ",filled=" + filled + ']';
    }
}
