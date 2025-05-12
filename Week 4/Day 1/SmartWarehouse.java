abstract class WarehouseItem {
String name;
WarehouseItem(String name) {
this.name = name;
}
abstract void displayInfo();
}
class Electronics extends WarehouseItem {
Electronics(String name) {
super(name);
}
void displayInfo() {
System.out.println("Electronics Item: " + name);
}
}
class Groceries extends WarehouseItem {
Groceries(String name) {
super(name);
4
}
void displayInfo() {
System.out.println("Grocery Item: " + name);
}
}
class Furniture extends WarehouseItem {
Furniture(String name) {
super(name);
}
void displayInfo() {
System.out.println("Furniture Item: " + name);
}
}
class Storage<T extends WarehouseItem> {
private List<T> items = new ArrayList<>();
void addItem(T item) {
items.add(item);
}
void displayItems() {
for (T item : items) {
item.displayInfo();
}
}
}
public class SmartWarehouse {
public static void main(String[] args) {
Storage<WarehouseItem> storage = new Storage<>();
storage.addItem(new Electronics("Laptop"));
storage.addItem(new Groceries("Apple"));
storage.addItem(new Furniture("Chair"));
storage.displayItems();
}
