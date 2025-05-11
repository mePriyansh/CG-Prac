class Book {
String title;
String author;
String genre;
String bookId;
boolean isAvailable;
Book next, prev;
public Book(String title, String author, String genre, String bookId,
boolean isAvailable) {
this.title = title;
this.author = author;
this.genre = genre;
this.bookId = bookId;
this.isAvailable = isAvailable;
this.next = this.prev = null;
}
}
class Library {
private Book head, tail;
private int count = 0;
public void addAtBeginning(String title, String author, String genre,
String id, boolean status) {
Book newBook = new Book(title, author, genre, id, status);
if (head == null) {
head = tail = newBook;
} else {
newBook.next = head;
head.prev = newBook;
head = newBook;
}
count++;
}
public void addAtEnd(String title, String author, String genre, String
id, boolean status) {
Book newBook = new Book(title, author, genre, id, status);
if (tail == null) {
head = tail = newBook;
} else {
tail.next = newBook;
newBook.prev = tail;
tail = newBook;
}
count++;
}
public void addAtPosition(String title, String author, String genre,
String id, boolean status, int pos) {
if (pos <= 1 || head == null) {
addAtBeginning(title, author, genre, id, status);
return;
}
if (pos > count) {
addAtEnd(title, author, genre, id, status);
return;
}
Book newBook = new Book(title, author, genre, id, status);
Book current = head;
for (int i = 1; i < pos - 1 && current != null; i++) {
current = current.next;
}
newBook.next = current.next;
newBook.prev = current;
if (current.next != null) {
current.next.prev = newBook;
}
current.next = newBook;
count++;
}
public void removeById(String id) {
Book current = head;
while (current != null) {
if (current.bookId.equals(id)) {
if (current == head) {
head = head.next;
if (head != null) head.prev = null;
} else if (current == tail) {
tail = tail.prev;
if (tail != null) tail.next = null;
} else {
current.prev.next = current.next;
current.next.prev = current.prev;
}
count--;
return;
}
current = current.next;
}
}
public void searchByTitle(String title) {
Book current = head;
boolean found = false;
while (current != null) {
if (current.title.equalsIgnoreCase(title)) {
printBook(current);
found = true;
}
current = current.next;
}
if (!found) System.out.println("No book found with title: " +
title);
}
public void searchByAuthor(String author) {
Book current = head;
boolean found = false;
while (current != null) {
if (current.author.equalsIgnoreCase(author)) {
printBook(current);
found = true;
}
current = current.next;
}
if (!found) System.out.println("No book found by author: " +
author);
}
public void updateAvailability(String id, boolean newStatus) {
Book current = head;
while (current != null) {
if (current.bookId.equals(id)) {
current.isAvailable = newStatus;
return;
}
current = current.next;
}
}
public void displayForward() {
Book current = head;
if (current == null) {
System.out.println("Library is empty.");
return;
}
while (current != null) {
printBook(current);
current = current.next;
}
}
public void displayReverse() {
Book current = tail;
if (current == null) {
System.out.println("Library is empty.");
return;
}
while (current != null) {
printBook(current);
current = current.prev;
}
}
public int countBooks() {
return count;
}
private void printBook(Book book) {
System.out.println("Title: " + book.title +
", Author: " + book.author +
", Genre: " + book.genre +
", ID: " + book.bookId +
", Available: " + (book.isAvailable ? "Yes" : "No"));
}
}
public class LibrarySystem {
public static void main(String[] args) {
Library lib = new Library();
lib.addAtEnd("The Alchemist", "Paulo Coelho", "Fiction", "B101",
true);
lib.addAtBeginning("Atomic Habits", "James Clear", "Self-help",
"B102", true);
lib.addAtPosition("1984", "George Orwell", "Dystopian", "B103",
false, 2);
lib.addAtEnd("To Kill a Mockingbird", "Harper Lee", "Classic",
"B104", true);
System.out.println("Books in Library (Forward):");
lib.displayForward();
System.out.println("\nBooks in Library (Reverse):");
lib.displayReverse();
System.out.println("\nTotal Books: " + lib.countBooks());
System.out.println("\nSearch by Title:");
lib.searchByTitle("1984");
System.out.println("\nSearch by Author:");
lib.searchByAuthor("James Clear");
System.out.println("\nUpdating Availability of B103 to Available");
lib.updateAvailability("B103", true);
lib.searchByTitle("1984");
System.out.println("\nRemoving Book with ID B102");
lib.removeById("B102");
lib.displayForward();
System.out.println("\nTotal Books: " + lib.countBooks());
}
}
