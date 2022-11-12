package Week3;

/**
 *A private int data field named height that defines the height of a rectangle. The default value is 1.
 * A private int data field named width that defines the width of a rectangle. The default value is 1.
 * A no-arg constructor that creates a SimpleRectangle object with default values.
 * An overloaded constructor that creates a SimpleRectangle object with the specified width and height.
 * The accessor and mutator methods for width and height.
 * A method named toString() which returns a string representation as examples shown below.
 * A method named getArea() which returns the area of a rectangle. The return type is a double.
 */

public class SimpleRectangle {
    private int height = 1;
    private int width = 1;
    public SimpleRectangle(){}
    public SimpleRectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return String.format("Rectangle, area=%.2f", getArea());
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public double getArea(){

        return (double) getHeight() * (double) getWidth();
    }

    public static void main(String[] args) {
        SimpleRectangle p = new SimpleRectangle();
        System.out.println(p);
        SimpleRectangle p2 = new SimpleRectangle(10, 5);
        System.out.println(p2);
        System.out.println(p == p2);
        System.out.println(p.equals(p2));
        System.out.println(p2.getWidth());
        System.out.println(p2.getHeight());
    }
}
