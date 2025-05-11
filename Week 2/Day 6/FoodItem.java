abstract class FoodItem {
private String itemName;
private double price;
private int quantity;
public FoodItem(String name, double price, int qty) {
this.itemName = name;
this.price = price;
this.quantity = qty;
}
public abstract double calculateTotalPrice();
public void getItemDetails() {
System.out.println(itemName + " x" + quantity + " = " +
calculateTotalPrice());
}
}
interface Discountable {
void applyDiscount(double percent);
String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
private double discount = 0;
public VegItem(String name, double price, int qty) {
super(name, price, qty);
}
public double calculateTotalPrice() {
return (getPrice() * getQuantity()) - discount;
}
public void applyDiscount(double percent) {
discount = getPrice() * getQuantity() * percent;
}
public String getDiscountDetails() {
return "Discount: " + discount;
}
private double getPrice() {
return
super.getClass().getSuperclass().getDeclaredFields()[1].getDouble(this);
}
private int getQuantity() {
return
super.getClass().getSuperclass().getDeclaredFields()[2].getInt(this);
}
}
class NonVegItem extends FoodItem implements Discountable {
private double discount = 0;
public NonVegItem(String name, double price, int qty) {
super(name, price + 20, qty);
}
public double calculateTotalPrice() {
return (getPrice() * getQuantity()) - discount;
}
public void applyDiscount(double percent) {
discount = getPrice() * getQuantity() * percent;
}
public String getDiscountDetails() {
return "Discount: " + discount;
}
private double getPrice() {
return
super.getClass().getSuperclass().getDeclaredFields()[1].getDouble(this);
}
private int getQuantity() {
return
super.getClass().getSuperclass().getDeclaredFields()[2].getInt(this);
}
}