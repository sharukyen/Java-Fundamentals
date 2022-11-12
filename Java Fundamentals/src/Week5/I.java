package Week5;

/**
 * Write a subclass named K that extends the abstract class J and implements the interface I. Both the iMethod1() and jMethod1() method prints the method name and the value of the parameter.
 */

import Week4.*;

public interface I {
    public void iMethod1(int i);
}

abstract class J implements I {
    public abstract void jMethod1(int j);
}

class K extends J implements I {
    public void iMethod1(int i) { System.out.printf("iMethod1(),%d\n",i); }
    public  void jMethod1(int j){ System.out.printf("jMethod1(),%d\n",j); }

    public static void main(String[] args) {
        I k = new K();
        k.iMethod1(99);
        J l = (J) k;
        l.jMethod1(30);
        if (!(k instanceof I)) System.out.println("K must extend J");
        if (!(k instanceof J)) System.out.println("K must implement J");
    }
}