public class Book {
private String title;
private String author;
private double price;
private boolean isAvailable;
public Book(String title, String author, double price, boolean
isAvailable) {
this.title = title;
this.author = author;
this.price = price;
this.isAvailable = isAvailable;
}
public boolean borrowBook() {
if (isAvailable) {
isAvailable = false;
return true;
}
return false;
}
}