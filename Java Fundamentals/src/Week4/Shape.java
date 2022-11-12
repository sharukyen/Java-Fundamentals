package Week4;

import java.awt.*;

/**
 *
 */

public abstract class Shape {
    protected Point p; //top-left corner
    public Shape() { p = new Point();}
    public Shape(int x, int y) { p = new Point(x,y);}
    public int getX() { return p.x; }
    public int getY() { return p.y; }
    public void setX(int x ) { p.x = x; }
    public void setY(int y) { p.y = y; }
    public void translate(int deltax, int deltay) { p.translate(deltax, deltay);}
    public abstract double getPerimeter();


}

class Circle extends Shape {
    private int radius;
    public Circle() {}
    public Circle(int x, int y, int r) {
        super(x,y);
        radius = r;
    }
    public int getRadius(){ return radius; }
    public void setRadius(int r){ radius = r; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
}
class Rectangle extends Shape {
    private int width, height;
    public Rectangle() {}
    public Rectangle(int x, int y, int w, int h) {
        super(x,y);
        width = w;
        height = h;
    }
    public int getWidth(){ return width; }
    public int getHeight(){ return height; }
    public void setWidth(int w){ width = w; }
    public void setHeight(int h){ height = h; }
    public double getPerimeter() { return 2 * (width + height); }

    public static void main(String[] args) {
        Rectangle r  = new Rectangle (20, 30, 40, 50);
        System.out.printf("%.2f%n", r.getPerimeter());
    }
}

