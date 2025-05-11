public class CartItem {
private String itemName;
private double price;
private int quantity;
public CartItem(String itemName, double price, int quantity) {
this.itemName = itemName;
this.price = price;
this.quantity = quantity;
}
public void addItem(int quantity) {
this.quantity += quantity;
}
public void removeItem(int quantity) {
if (this.quantity >= quantity) {
this.quantity -= quantity;
} else {
System.out.println("Not enough quantity to remove.");
}
}
public double calculateTotalCost() {
return price * quantity;
}
public void displayCartDetails() {
System.out.println("Item Name: " + itemName);
System.out.println("Price: $" + price);
System.out.println("Quantity: " + quantity);
System.out.println("Total Cost: $" + calculateTotalCost());
}
public static void main(String[] args) {
CartItem item1 = new CartItem("Laptop", 899.99, 1);
item1.displayCartDetails();
item1.addItem(2);
item1.displayCartDetails();
item1.removeItem(1);
item1.displayCartDetails();
}
}