abstract class LibraryItem {
private String itemId;
private String title;
private String author;
public LibraryItem(String id, String title, String author) {
this.itemId = id;
this.title = title;
this.author = author;
}
public abstract int getLoanDuration();
public void getItemDetails() {
System.out.println(itemId + ": " + title + " by " + author);
}
}
interface Reservable {
void reserveItem();
boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
public Book(String id, String title, String author) {
super(id, title, author);
}
public int getLoanDuration() {
return 14;
}
public void reserveItem() {}
public boolean checkAvailability() {
return true;
}
}
class Magazine extends LibraryItem implements Reservable {
public Magazine(String id, String title, String author) {
super(id, title, author);
}
public int getLoanDuration() {
return 7;
}
public void reserveItem() {}
public boolean checkAvailability() {
return true;
}
}
class DVD extends LibraryItem implements Reservable {
public DVD(String id, String title, String author) {
super(id, title, author);
}
public int getLoanDuration() {
return 3;
}
public void reserveItem() {}
public boolean checkAvailability() {
return true;
}
}