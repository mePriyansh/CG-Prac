class ItemNode {
String itemName;
String itemId;
int quantity;
double price;
ItemNode next;
public ItemNode(String itemName, String itemId, int quantity, double
price) {
this.itemName = itemName;
this.itemId = itemId;
this.quantity = quantity;
this.price = price;
this.next = null;
}
}
class Inventory {
private ItemNode head;
public void addAtBeginning(String name, String id, int quantity, double
price) {
ItemNode newNode = new ItemNode(name, id, quantity, price);
newNode.next = head;
head = newNode;
}
public void addAtEnd(String name, String id, int quantity, double
price) {
ItemNode newNode = new ItemNode(name, id, quantity, price);
if (head == null) {
head = newNode;
return;
}
ItemNode current = head;
while (current.next != null) {
current = current.next;
}
current.next = newNode;
}
public void addAtPosition(String name, String id, int quantity, double
price, int position) {
if (position <= 1 || head == null) {
addAtBeginning(name, id, quantity, price);
return;
}
ItemNode newNode = new ItemNode(name, id, quantity, price);
ItemNode current = head;
int index = 1;
while (current.next != null && index < position - 1) {
current = current.next;
index++;
}
newNode.next = current.next;
current.next = newNode;
}
public void removeById(String id) {
if (head == null) return;
if (head.itemId.equals(id)) {
head = head.next;
return;
}
ItemNode current = head;
while (current.next != null && !current.next.itemId.equals(id)) {
current = current.next;
}
if (current.next != null) {
current.next = current.next.next;
}
}
public void updateQuantity(String id, int newQuantity) {
ItemNode current = head;
while (current != null) {
if (current.itemId.equals(id)) {
current.quantity = newQuantity;
return;
}
current = current.next;
}
}
public void searchById(String id) {
ItemNode current = head;
while (current != null) {
if (current.itemId.equals(id)) {
printItem(current);
return;
}
current = current.next;
}
System.out.println("Item not found with ID: " + id);
}
public void searchByName(String name) {
ItemNode current = head;
boolean found = false;
while (current != null) {
if (current.itemName.equalsIgnoreCase(name)) {
printItem(current);
found = true;
}
current = current.next;
}
if (!found) {
System.out.println("Item not found with Name: " + name);
}
}
public void displayInventory() {
ItemNode current = head;
if (current == null) {
System.out.println("Inventory is empty.");
return;
}
while (current != null) {
printItem(current);
current = current.next;
}
}
public void totalInventoryValue() {
double total = 0;
ItemNode current = head;
while (current != null) {
total += current.quantity * current.price;
current = current.next;
}
System.out.println("Total Inventory Value: $" + total);
}
public void sortInventory(String key, boolean ascending) {
head = mergeSort(head, key, ascending);
}
private ItemNode mergeSort(ItemNode node, String key, boolean
ascending) {
if (node == null || node.next == null) return node;
ItemNode middle = getMiddle(node);
ItemNode nextOfMiddle = middle.next;
middle.next = null;
ItemNode left = mergeSort(node, key, ascending);
ItemNode right = mergeSort(nextOfMiddle, key, ascending);
return sortedMerge(left, right, key, ascending);
}
private ItemNode sortedMerge(ItemNode a, ItemNode b, String key,
boolean ascending) {
if (a == null) return b;
if (b == null) return a;
boolean condition;
if (key.equals("name")) {
condition = ascending ?
a.itemName.compareToIgnoreCase(b.itemName) <= 0 :
a.itemName.compareToIgnoreCase(b.itemName) > 0;
} else {
condition = ascending ? a.price <= b.price : a.price > b.price;
}
if (condition) {
a.next = sortedMerge(a.next, b, key, ascending);
return a;
} else {
b.next = sortedMerge(a, b.next, key, ascending);
return b;
}
}
private ItemNode getMiddle(ItemNode node) {
if (node == null) return node;
ItemNode slow = node, fast = node.next;
while (fast != null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;
}
return slow;
}
private void printItem(ItemNode item) {
System.out.println("Name: " + item.itemName + ", ID: " +
item.itemId + ", Qty: " + item.quantity + ", Price: $" + item.price);
}
}
public class InventorySystem {
public static void main(String[] args) {
Inventory inv = new Inventory();
inv.addAtEnd("Laptop", "IT001", 10, 850.00);
inv.addAtBeginning("Mouse", "IT002", 50, 20.00);
inv.addAtPosition("Monitor", "IT003", 15, 150.00, 2);
inv.addAtEnd("Keyboard", "IT004", 30, 45.00);
System.out.println("Inventory:");
inv.displayInventory();
System.out.println("\nTotal Value:");
inv.totalInventoryValue();
System.out.println("\nSearch by ID (IT003):");
inv.searchById("IT003");
System.out.println("\nSearch by Name (Keyboard):");
inv.searchByName("Keyboard");
System.out.println("\nUpdate Quantity (IT002 to 60):");
inv.updateQuantity("IT002", 60);
inv.displayInventory();
System.out.println("\nRemove Item (IT001):");
inv.removeById("IT001");
inv.displayInventory();
System.out.println("\nSort by Name Ascending:");
inv.sortInventory("name", true);
inv.displayInventory();
System.out.println("\nSort by Price Descending:");
inv.sortInventory("price", false);
inv.displayInventory();
}
}