abstract class Product {
String name;
double price;
Product(String name, double price) {
this.name = name;
this.price = price;
}
abstract void displayInfo();
}
class Book extends Product {
String category;
Book(String name, double price, String category) {
super(name, price);
this.category = category;
}
6
void displayInfo() {
System.out.println("Book: " + name + ", Category: " + category + ",
Price: " + price);
}
}
class Clothing extends Product {
String size;
Clothing(String name, double price, String size) {
super(name, price);
this.size = size;
}
void displayInfo() {
System.out.println("Clothing: " + name + ", Size: " + size + ",
Price: " + price);
}
}
class Gadgets extends Product {
String model;
Gadgets(String name, double price, String model) {
super(name, price);
this.model = model;
}
void displayInfo() {
System.out.println("Gadget: " + name + ", Model: " + model + ",
Price: " + price);
}
}
class Catalog<T extends Product> {
List<T> products = new ArrayList<>();
void addProduct(T product) {
products.add(product);
}
7
void applyDiscount(T product, double percentage) {
product.price = product.price - (product.price * percentage / 100);
}
void displayProducts() {
for (T product : products) {
product.displayInfo();
}
}
}
public class Marketplace {
public static void main(String[] args) {
Catalog<Product> catalog = new Catalog<>();
catalog.addProduct(new Book("Java Programming", 50,
"Programming"));
catalog.addProduct(new Clothing("T-Shirt", 20, "M"));
catalog.addProduct(new Gadgets("Smartphone", 300, "X100"));
System.out.println("Before Discount:");
catalog.displayProducts();
catalog.applyDiscount(new Book("Java Programming", 50,
"Programming"), 10);
System.out.println("After Discount:");
catalog.displayProducts();
}
}