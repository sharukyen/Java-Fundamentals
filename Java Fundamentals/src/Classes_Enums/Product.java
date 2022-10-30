package Classes_Enums;
import java.util.*;

/**
 *Define a class called Product that represents a product. Each Product object stores information about an ID (of type int), name, price (of type double), cost price (of type double), quantity (of type int) and the GST rate (of type double). The default GST rate is 15 and the default quantity is 0. The class must have the following functionality:
 * Create a product. The constructor should take an ID, a name, a price (GST excluded), a cost and a quantity as parameters to create a product object. For example:
 * Product p1 = new Product(1, "Coach Charlie Bucket Handbag", 621, 499, 10);
 * Create a product without the quantity. For example:
 * Product p2 =  new Product(2, "Panasonic SD-2501 BreadMaker", 288, 215);
 * Return a string representing information about the product. For example: the code: System.out.println(p1);
 * would produce the output:
 * Product[1, Coach Charlie Bucket handbag, 621.00(499.00), 10]
 * The class should also provide functionality to set the the quantity. For example: p1.setQuantity(5). The method should only modify the quantity if the value is > 0.
 * The class should also provide functionality to decrease the quantity by 1. For example: p1.reduceQuantity(5) should reduce the quantity by 5. The method should validate the quantity before adjusting the quantity. The method returns true if the quantity has been updated successfully, returns false otherwise.
 */

public class Product {
    protected int productID;
    protected String productName;
    protected double productPrice;
    protected double productCost;
    protected int productQuantity = 1;
    protected double gstRate = 15;

    public Product(int id, String name, double p, double cp, int q) {
        this.productID = id;
        this.productName = name;
        this.productPrice = p;
        this.productCost = cp;
        this.productQuantity = q;
    }
    public Product(int id, String name, double p, double cp) {this(id, name, p, cp, 0);}
    /*	public int getID() { return productID; }
        public String getName() { return productName; }
        public int getQuantity() { return productQuantity; }
        public double getPrice() { return productPrice; }
        public double getGSTRate() { return gstRate; }

        public double getGSTInclusivePrice() { return productPrice *  (100 + gstRate)/100;  }
        public double getProfit() { return productPrice - productCost; }
        public double getCost() { return productCost; }
        */
    public String toString() { return String.format("Product[%d, %s, %.2f(%.2f), %d]", productID, productName,productPrice, productCost,productQuantity  ); }
    /*	public void setPrice(double p) { if (p>0) this.productPrice = p; }
        public void setCost(double p) { if (p>0) this.productCost = p; } */
    public void setQuantity(int q) { if (q>0) this.productQuantity = q; }

    public boolean reduceQuantity(int n) {
        if (n > 0 && productQuantity >= n) {
            productQuantity -= n;
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Panasonic SD-2501 BreadMaker", 288, 215, 50);
        System.out.println(p1);
        Product p2 = new Product(2, "Dyson Cyclone V10 Animal", 1074, 999);
        System.out.println(p2);
        p2.setQuantity(-20);
        System.out.println(p2);
        p2.setQuantity(20);
        System.out.println(p2);

        Product p3 = new Product(1, "Panasonic SD-2501 BreadMaker", 288, 10);
        System.out.println(p3);
        p3.setQuantity(20);
        System.out.println(p3);
        System.out.println(p3.reduceQuantity(-10));
        System.out.println(p3);
        System.out.println(p3.reduceQuantity(100));
        System.out.println(p3);
        System.out.println(p3.reduceQuantity(5));
        System.out.println(p3);
    }
}
