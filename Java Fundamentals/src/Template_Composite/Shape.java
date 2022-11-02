package Template_Composite;

import java.awt.*;
import java.util.ArrayList;

/**
 *
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
