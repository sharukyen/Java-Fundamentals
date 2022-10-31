package Composition_Inheritance;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static Composition_Inheritance.Shape.findLargestShape;

/**
 * Define a class named Hexagon which represents a hexagon shape. The Hexagon class contains the following:
 * A private int data field named sideLength that defines the side length of a hexagon. The default value is 1.
 * A default no-arg constructor that creates the object using default values.
 * An overloaded constructor which creates the object with the specified x, y and side.
 * A method named getOwner() which returns the owner of a vehicle. You should implement the getArea() which returns the area of a hexagon.
 * The method should return an integer. The formula is:  {3 * sqrt{3} * sideLength^2}/{2} . Round the result to the nearest integer.
 */

abstract class Shape {
    protected Point p; //top-left corner
    public Shape() {p = new Point();}
    public Shape(int x, int y) {p = new Point(x,y);}
    public int getX() { return p.x; }
    public int getY() { return p.y; }
    public void setX(int x ) { p.x = x; }
    public void setY(int y) { p.y = y; }
    public void translate(int deltax, int deltay) { p.translate(deltax, deltay); }
    public abstract int getArea();
    public static Shape findLargestShape(ArrayList<Shape> shapes) {
        int currentLargest = shapes.get(0).getArea();
        int currentIndex = 0;
        for (int i=1; i<shapes.size(); i++)
            if (shapes.get(i).getArea()> currentLargest)  {
                currentLargest = shapes.get(i).getArea();
                currentIndex = i;
            }
        return shapes.get(currentIndex);
    }
    public String toString() { return String.format("%s(%d)",getClass().getName(), getArea()); }
}
class Rectangle extends Shape {
    private int width=1, height=1;
    public Rectangle() {}
    public Rectangle(int x, int y, int w, int h) {
        super(x,y);
        width = w;
        height = h;
    }
    public int getArea() {return (width * height);}
}
class Hexagon extends Shape {
    private int sideLength = 1;
    public Hexagon() {}
    public Hexagon(int x, int y, int side) { super(x,y); sideLength=side; }
    public int getArea() {
        double area = 3 * Math.sqrt(3) * sideLength*sideLength /2;
        return (int) Math.round(area);
    }
}
class tests{
    public static void main(String[] args) {
        Shape s1 = new Hexagon(10, 10, 3);
        System.out.println(s1.getArea());
        System.out.println(s1.getX());
        System.out.println(s1.getY());
        Shape s2 = new Hexagon();
        System.out.println(s2.getArea());
        System.out.println(s2.getX());
        System.out.println(s2.getY());

        Shape sh1 = new Hexagon(10, 10, 10);
        Shape sh2 = new Hexagon(10, 10, 5);
        Shape s3 = new Rectangle(10, 20, 5, 10);
        Shape s4 = new Rectangle(10, 20, 5, 15);
        Shape s5 = new Hexagon(10, 10, 8);
        Shape[] shapeArrays = new Shape[]{sh1, sh2, s3, s4, s5};
        ArrayList<Shape> shapes = new ArrayList<Shape>(Arrays.asList( shapeArrays) );
        Shape largest = findLargestShape(shapes);
        System.out.println(largest);
    }
}
