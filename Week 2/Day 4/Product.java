import java.util.*;
class Product {
String name;
Product(String name) {
this.name = name;
}
}
class Order {
List<Product> products = new ArrayList<>();
void addProduct(Product p) {
products.add(p);
}
}
class Customer {
String name;
Customer(String name) {
this.name = name;
}
Order placeOrder() {
return new Order();
}
}