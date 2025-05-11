class Book {
static String libraryName = "City Library";
final String isbn;
String title;
String author;
public Book(String title, String author, String isbn) {
this.title = title;
this.author = author;
this.isbn = isbn;
}
public static void displayLibraryName() {
System.out.println("Library Name: " + libraryName);
}
public void displayBookDetails() {
if (this instanceof Book) {
System.out.println("Book Title: " + title);
System.out.println("Author: " + author);
System.out.println("ISBN: " + isbn);
}
}
}
public class LibrarySystem {
public static void main(String[] args) {
Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald",
"9780743273565");
book1.displayBookDetails();
Book.displayLibraryName();
}
}
