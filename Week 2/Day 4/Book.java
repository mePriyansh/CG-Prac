import java.util.*;
class Book {
String title;
String author;
Book(String title, String author) {
this.title = title;
this.author = author;
}
}
class Library {
List<Book> books = new ArrayList<>();
void addBook(Book book) {
books.add(book);
}
}
