package Week_7;

import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Create 2-parameter constructor.
     * @param pointX point in x-asis.
     * @param pointY point in y-asis.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Create getter point x method.
     * @return point x.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * Create setter point x method.
     * @param pointX point x.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Create getter point Y method.
     * @return point y.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * Create setter point Y method.
     * @param pointY point Y.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Create method to calculate distance between 2 point.
     * @param z point.
     * @return distance.
     */
    public double distance(Point z) {
        return Math.sqrt((pointX - z.pointX) * (pointX - z.pointX)
                + (pointY - z.pointY) * (pointY - z.pointY));
    }

    /**
     * Create method to compare 2 point.
     * @param object point.
     * @return boolean value.
     */
    public boolean equals(Object object) {
        if (object instanceof Point) {
            Point p = (Point) object;
            //return pointX == p.pointX && pointY == p.pointY;
            return Double.compare(p.pointX, pointX) == 0
                    && Double.compare(p.pointY, pointY) == 0;
        }
        return false;
    }

    /**
     * Create hash code method.
     * @return point.
     */
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * Create method to return string that print out.
     * @return string.
     */

    public String toString() {
        return "(" + Math.ceil(pointX * 10.0) / 10.0 + ","
                + Math.ceil(pointY * 10.0) / 10.0 + ")";
    }
}
