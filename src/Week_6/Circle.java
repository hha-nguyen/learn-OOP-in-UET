package Week_6;

import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected static final double PI = Math.PI;

    /**
     * Create 3-parameters constructor method.
     * @param color color of circle.
     * @param filled filled status of circle.
     * @param radius radius of circle.
     */
    public Circle(double radius, String color, boolean filled)  {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Create 1-parameter constructor method.
     * @param radius radius of circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Create non constructor method.
     */
    public Circle() {}

    /**
     * Create getter radius method.
     * @return radius of circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Create setter radius method.
     * @param radius radius of circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Create method to get area of circle.
     * @return area of circle.
     */
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * Create method to get perimeter of circle.
     * @return perimeter of circle.
     */
    public double getPerimeter() {
        return radius * 2 * PI;
    }

    /**
     * Create method to return string to print out.
     * @return string.
     */
    @Override
    public String toString() {
        return "Circle["
                + "radius=" + radius
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled()
                + ']';
    }

    /**
     * Create main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

    }
}

