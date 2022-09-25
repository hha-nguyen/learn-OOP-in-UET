package Week_6;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Create constructor with 2 parameters.
     * @param color color of shape.
     * @param filled filled or not.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Create constructor with no parameters.
     */
    public Shape() {}

    /**
     * Create getter color method.
     * @return color of shape.
     */
    public String getColor() {
        return color;
    }

    /**
     * Create setter color method.
     * @param color color of shape.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Create getter filled status method.
     * @return filled status of shape.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Create setter filled status for shape.
     * @param filled filled status of shape.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Create abstract method to get area of shape.
     * @return area of shape.
     */
    public abstract double getArea();

    /**
     * Create abstract method to get perimeter of shape.
     * @return perimeter of shape.
     */
    public abstract double getPerimeter();

    /**
     * Create method to return string to print out.
     * @return string.
     */
    @Override
    public String toString() {
        return "Shape["
                + "color='" + color
                + ",filled=" + filled
                + ']';
    }
}
