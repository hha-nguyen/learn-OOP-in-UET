package Week_7;

public class Square extends Rectangle {
    /**
     * Create non parameter method.
     */
    public Square() {

    }

    /**
     * Create 1 parameter method.
     * @param side side.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Create 3-parameter method.
     * @param side side.
     * @param color color.
     * @param filled filled status.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Create 4-parameter method.
     * @param topLeft top left.
     * @param side side.
     * @param color color.
     * @param filled filled status.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Create getter side method.
     * @return side.
     */
    public double getSide() {
        return getLength();
    }

    /**
     * Create setter side method.
     * @param side side.
     */
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    /**
     * Create setter width method.
     * @param side side.
     */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Create setter length method.
     * @param side length.
     */
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * Create method to return string to print out.
     * @return string.
     */

    public String toString() {
        return "Square[topLeft=" + topLeft.toString() + ",side="
                + width + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * Create method to compare 2 square.
     * @param o rectangle.
     * @return boolean value.
     */
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
