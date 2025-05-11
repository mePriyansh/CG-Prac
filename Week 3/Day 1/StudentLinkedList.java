class StudentNode {
int rollNumber;
String name;
int age;
String grade;
StudentNode next;
public StudentNode(int rollNumber, String name, int age, String grade)
{
this.rollNumber = rollNumber;
this.name = name;
this.age = age;
this.grade = grade;
this.next = null;
}
}
class StudentRecordList {
private StudentNode head;
public void displayRecords() {
if (head == null) {
System.out.println("Student records list is empty.");
return;
}
StudentNode current = head;
while (current != null) {
System.out.println("Roll Number: " + current.rollNumber + ",
Name: " + current.name + ", Age: " + current.age + ", Grade: " +
current.grade);
current = current.next;
}
}
public void addAtBeginning(int rollNumber, String name, int age, String
grade) {
StudentNode newNode = new StudentNode(rollNumber, name, age,
grade);
newNode.next = head;
head = newNode;
}
public void addAtEnd(int rollNumber, String name, int age, String
grade) {
StudentNode newNode = new StudentNode(rollNumber, name, age,
grade);
if (head == null) {
head = newNode;
return;
}
StudentNode current = head;
while (current.next != null) {
current = current.next;
}
current.next = newNode;
}
public void addAtPosition(int rollNumber, String name, int age, String
grade, int position) {
if (position == 1) {
addAtBeginning(rollNumber, name, age, grade);
return;
}
StudentNode newNode = new StudentNode(rollNumber, name, age,
grade);
StudentNode current = head;
StudentNode prev = null;
int count = 1;
while (current != null && count < position) {
prev = current;
current = current.next;
count++;
}
if (count == position) {
prev.next = newNode;
newNode.next = current;
} else {
System.out.println("Position " + position + " out of range.");
}
}
public void deleteByRollNumber(int rollNumber) {
StudentNode current = head;
StudentNode prev = null;
boolean found = false;
while (current != null) {
if (current.rollNumber == rollNumber) {
found = true;
if (prev != null) {
prev.next = current.next;
} else {
head = current.next;
}
break;
}
prev = current;
current = current.next;
}
if (!found) {
System.out.println("Student with Roll Number " + rollNumber + "
not found.");
}
}
public void searchByRollNumber(int rollNumber) {
StudentNode current = head;
while (current != null) {
if (current.rollNumber == rollNumber) {
System.out.println("Student found - Roll Number: " +
current.rollNumber + ", Name: " + current.name + ", Age: " + current.age +
", Grade: " + current.grade);
return;
}
current = current.next;
}
System.out.println("Student with Roll Number " + rollNumber + " not
found.");
}
public void updateGrade(int rollNumber, String newGrade) {
StudentNode current = head;
boolean found = false;
while (current != null) {
if (current.rollNumber == rollNumber) {
current.grade = newGrade;
System.out.println("Grade updated successfully for Roll
Number " + rollNumber + ".");
found = true;
break;
}
current = current.next;
}
if (!found) {
System.out.println("Student with Roll Number " + rollNumber + "
not found.");
}
}
}
public class StudentLinkedList {
public static void main(String[] args) {
StudentRecordList list = new StudentRecordList();
list.addAtEnd(1, "Alice", 20, "A");
list.addAtEnd(2, "Bob", 21, "B");
list.addAtEnd(3, "Charlie", 22, "C");
System.out.println("Displaying all student records:");
list.displayRecords();
list.searchByRollNumber(2);
list.updateGrade(2, "B+");
System.out.println("Displaying all student records after update:");
list.displayRecords();
list.deleteByRollNumber(1);
System.out.println("Displaying all student records after
deletion:");
list.displayRecords();
}
}
