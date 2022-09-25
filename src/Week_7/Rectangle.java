package Week_7;

import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Create non parameter constructor.
     */
    public Rectangle() {
    }

    /**
     * Create 2-parameter constructor.
     * @param width width.
     * @param length length.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Create 4-parameter constructor.
     * @param width width.
     * @param length length.
     * @param color color.
     * @param filled filled.
     */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Create 5-parameter constructor.
     * @param topLeft top left.
     * @param width width.
     * @param length length.
     * @param color color.
     * @param filled filled.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * Create getter width method.
     * @return width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Create set width method.
     * @param width width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Create getter length method.
     * @return length.
     */
    public double getLength() {
        return length;
    }

    /**
     * Create setter length method.
     * @param length length.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Create getter top left method.
     * @return top left.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * Create setter top left method.
     * @param topLeft top left.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Create method to get area.
     * @return area.
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Create method to get perimeter.
     * @return perimeter.
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Create method to compare 2 rectangle.
     * @param o rectangle.
     * @return boolean result.
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0
                && Double.compare(rectangle.length, length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    /**
     * Create hash code method.
     * @return object after hash.
     */
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    /**
     * Create method to return string that print out.
     * @return string.
     */

    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString()
                + ",width=" + width + ",length="
                + length + ",color=" + color
                + ",filled=" + filled + "]";
    }
}
