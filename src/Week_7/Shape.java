package Week_7;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Create non parameter constructor.
     */
    public Shape() {
    }

    /**
     * Create 2-parameter constructor.
     * @param color color.
     * @param filled  filled status.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Create getter color method.
     * @return color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Create setter color method.
     * @param color color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Create getter filled status method.
     * @return filled status.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Create setter filled status method.
     * @param filled filled status.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Create abstract method to get area.
     * @return area.
     */
    public abstract double getArea();

    /**
     * Create abstract method to get perimeter.
     * @return area.
     */
    public abstract double getPerimeter();

    /**
     * Create method to return string to print out.
     * @return string.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
