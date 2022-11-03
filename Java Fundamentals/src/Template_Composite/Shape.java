package Template_Composite;

import java.awt.*;
import java.util.ArrayList;

/**
 *The composite pattern describes a group of objects that are treated the same way as a single instance of the same type of object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies.
 *
 * For example: Users should be able to add one or more simple shape(s), or one or more container(s) into a list of instructions. Each container contains zero or more shape(s) (i.e. single or composite). You should do the following:
 *
 * Task 1: Implement the abstract Shape class.
 * Task 2: Implement the leaf object (i.e. Circle class) which is a single object and does not have children.
 * Task 3: Implement the composite object (i.e. Container class) which is the composite object and contains children.
 * Define an abstract class named Shape which represents a rectangular shape. The Shape class contains the following:
 *
 * A protected Rectangle data field named rect which defines a rectangle boundary of a shape.
 * A protected String data field named color which defines the colour of a shape.
 * A constructor which takes 4 integers (x, y, width and height) and a string as parameters and creates an object.
 * A method named toString() which returns a string representation of the object as in the examples below. You may find the getClass().getSimpleName() method useful.
 * An abstract method named draw(String indent) which takes an indent as a parameter and prints the shape.
 * Continuing on from the previous question, define a subclass named Circle which extends the Shape abstract class. The Circle class contains the following:
 *
 * A constructor which takes 4 integers (x, y, width and height) and a string as parameters and creates a Circle object.
 * A method named draw(String indent) which takes an indent as a parameter and prints the circle with the given indent.
 *
 * Continuing on from the previous question, define a subclass named Container which extends the Shape abstract class. TheContainer class contains the following:
 *
 * A private ArrayList<Shape> named elements which defines a list of shapes (i.e. circles or containers) in a container.
 * A constructor which takes 4 integers (x, y, width and height) and a string as parameters and creates a Container object.
 * A method named add(Shape s) which takes a shape as a parameter and adds the shape to the end of the list. Also, the method should change the color of the children to its container’s color once it is placed within a container.
 * A method named remove(Shape s) which removes the first occurrence of the specified shape from the children list. The method should change the colour of the removed shape to "black".
 * A method named draw(String indent) which takes an indent as a parameter and the shape itself and its children with the given indent. Note: all subsequent lines are indented by one single space.
 */

abstract class Shape {
    protected Rectangle rect;
    protected String color = "black";

    public Shape(int x, int y, int w, int h) {
        rect = new Rectangle(x, y, w, h);
    }

    public Shape(int x, int y, int w, int h, String c) {
        this(x, y, w, h);
        color = c;
    }

    public String toString() {
        return String.format("%s:(%d,%d),%s", getClass().getSimpleName(), rect.x, rect.y, color);
    }

    public abstract void draw(String indent);

}

class Circle extends Shape {
    public Circle(int x, int y, int w, int h, String c) {
        super(x,y,w,h,c);
    }
    @Override
    public void draw(String indent) {
        System.out.println(indent + toString());
    }
}

class Container extends Shape {
    private ArrayList<Shape> elements = new ArrayList<Shape>();
    public Container(int x, int y, int w, int h, String c) {
        super(x,y,w,h,c);
    }
    public void add(Shape s) {
        s.color = this.color; //set to the same color
        elements.add(s);
    }
    public void remove(Shape s) {
        s.color ="black";
        elements.remove(s);
    }
    @Override
    public void draw(String indent) {
        System.out.println(indent + toString());
        indent += " ";
        for(Shape s: elements){
            s.draw(indent);
        }
    }
}

class shapeTests{
    public static void main(String[] args) {
        Shape s1 = new Circle(10,20,50,50, "yellow");
        Shape s2 = new Circle(20,30,50,50, "red");
        Shape s3 = new Circle(15,25,50,50, "green");
        Shape s5 = new Circle(105,250,50,50, "green");
        s1.draw("");
        s2.draw("");
        s3.draw("");
        s5.draw("");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Shape s6 = new Circle(10,20,50,50, "yellow");
        Shape s7 = new Circle(20,30,50,50, "red");
        s6.draw("");
        s7.draw("");
        Container s4 = new Container(5,5,200,200,"gray");
        s4.add(s6);
        s4.add(s7);
        s4.draw("");
        System.out.println(s6);
        System.out.println(s7);
    }
}
