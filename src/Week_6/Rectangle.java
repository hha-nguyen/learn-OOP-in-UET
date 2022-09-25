package Week_6;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Create 4-parameter constructor.
     * @param color color.
     * @param filled filled.
     * @param width width.
     * @param length length.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
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
     * Create non parameter constructor.
     */
    public Rectangle() {}

    /**
     * Create getter width method.
     * @return width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Create setter width method.
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
     * Create get area method.
     * @return area.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Create get perimeter method.
     * @return perimeter.
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Create method to return string to print out.
     * @return string.
     */
    @Override
    public String toString() {
        return "Rectangle["
                + "width=" + width
                + ",length=" + length
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled()
                + ']';
    }

    /**
     * Create main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
    }
}
