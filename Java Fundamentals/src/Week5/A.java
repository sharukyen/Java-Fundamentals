package Week5;

/**
 * Define a subclass named MyClass which implements the A interface and B interface. The MyClass implements the following methods:
 *
 * method1() which prints "implement method1";
 * method2() which prints "implement method2";
 * method3() which prints "implement method3";
 */

public interface A {
    void method1();
    void method2();
}

interface B extends A {
    void method3();
}

class MyClass implements B {
    public void method1() {
        System.out.println("implement method1");
    }
    public void method2() {
        System.out.println("implement method2");
    }
    public void method3() {
        System.out.println("implement method3");
    }

    public static void main(String[] args) {
        MyClass c = new MyClass();
        c.method1();
        c.method2();
        c.method3();
    }
}
