class Product {
static double discount = 10.0;
final int productID;
String productName;
double price;
int quantity;
public Product(String productName, double price, int quantity) {
this.productID = (int)(Math.random() * 1000);
this.productName = productName;
this.price = price;
this.quantity = quantity;
}
public static void updateDiscount(double newDiscount) {
discount = newDiscount;
}
public void displayProductDetails() {
if (this instanceof Product) {
System.out.println("Product Name: " + productName);
System.out.println("Product ID: " + productID);
System.out.println("Price: $" + price);
System.out.println("Quantity: " + quantity);
System.out.println("Discount: " + discount + "%");
}
}
}
public class ShoppingCartSystem {
public static void main(String[] args) {
Product product1 = new Product("Laptop", 1000.0, 2);
product1.displayProductDetails();
Product.updateDiscount(15.0);
product1.displayProductDetails();
}
}
