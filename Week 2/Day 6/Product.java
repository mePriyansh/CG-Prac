abstract class Product {
private String productId;
private String name;
private double price;
public Product(String productId, String name, double price) {
this.productId = productId;
this.name = name;
this.price = price;
}
public abstract double calculateDiscount();
public String getProductId() { return productId; }
public void setProductId(String productId) { this.productId =
productId; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public double getPrice() { return price; }
public void setPrice(double price) { this.price = price; }
}
interface Taxable {
double calculateTax();
String getTaxDetails();
}
class Electronics extends Product implements Taxable {
public Electronics(String id, String name, double price) {
super(id, name, price);
}
public double calculateDiscount() {
return getPrice() * 0.1;
}
public double calculateTax() {
return getPrice() * 0.18;
}
public String getTaxDetails() {
return "18% GST";
}
}
class Clothing extends Product implements Taxable {
public Clothing(String id, String name, double price) {
super(id, name, price);
}
public double calculateDiscount() {
return getPrice() * 0.15;
}
public double calculateTax() {
return getPrice() * 0.05;
}
public String getTaxDetails() {
return "5% GST";
}
}
class Groceries extends Product {
public Groceries(String id, String name, double price) {
super(id, name, price);
}
public double calculateDiscount() {
return getPrice() * 0.05;
}
}
