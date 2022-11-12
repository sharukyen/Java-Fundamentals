package Week3;

/**
 *A private int data field named x that defines the x-coordinate of a point. The default value is 0.
 * A private int data field named y that defines the y-coordinate of a point. The default value is 0.
 * A no-arg constructor that creates a MyPoint at (0, 0).
 * An overloaded constructor that creates a MyPoint object with the specified x-coordinate and y-coordinate.
 * A method named toString() which returns a string representation as examples shown below.
 *
 * A method named getX() which returns the x coordinate of a point.
 * A method named getY() which returns the y coordinate of a point.
 * A method named add(MyPoint other) which returns a new MyPoint object that contains the sum of the x coordinates and the sum of the y coordinates.
 * A method named multiply(MyPoint other) which returns the dot product of the two points, defined according to the rules of linear algebra. The formula is x * other.x + y * other.y
 * A method named scalar_multiply(int value) which returns a new MyPoint whose coordinates are a multiple of the original coordinates.
 */

public class MyPoint {
    private int x=0;
    private int y=0;
    public MyPoint() {}
    public MyPoint(int x, int y) {
        this.x = x; this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public MyPoint add(MyPoint other) { return new MyPoint(x+other.x, y+other.y); }
    public int multiply(MyPoint other) { return x*other.x + y*other.y; }
    public MyPoint scalar_multiply(int value) { return new MyPoint(x*value, y*value); }
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(5, 7);
        MyPoint p3 = p1.add(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
