package Week_6;

public class Square extends Rectangle {
    /**
     * Create 3-parameters constructor.
     * @param color color.
     * @param filled filled.
     * @param side side.
     */
    public Square(double side, String color, boolean filled)  {
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }

    /**
     * Create 1-parameters constructor.
     * @param side side.
     */
    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Create non parameters constructor.
     */
    public Square() {}

    /**
     * Create getter side method.
     * @return side.
     */
    public double getSide() {
        return this.length;
    }

    /**
     * Create setter side method.
     * @param side side.
     */
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }
    
    /**
     * Create setter width method.
     * @param side side.
     */
    @Override
    public void setWidth(double side) {
        this.setWidth(side);
        this.length = side;
    }

    /**
     * Create setter length method.
     * @param side side.
     */
    @Override
    public void setLength(double side) {
        this.setLength(side);
        this.width = side;
    }

    /**
     * Create method to return string to print out.
     * @return string.
     */
    @Override
    public String toString() {
        return "Square["
                + "side=" + this.getSide()
                + ",color=" + color
                + ",filled=" + filled
                + "]";
    }

    /**
     * Create main method.
     * @param args args.
     */
    public static void main(String[] args) {
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

}
