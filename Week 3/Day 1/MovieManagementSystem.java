class MovieNode {
String title;
String director;
int year;
double rating;
MovieNode next;
MovieNode prev;
public MovieNode(String title, String director, int year, double
rating) {
this.title = title;
this.director = director;
this.year = year;
this.rating = rating;
this.next = null;
this.prev = null;
}
}
class MovieList {
private MovieNode head;
private MovieNode tail;
public MovieList() {
head = null;
tail = null;
}
public void addAtBeginning(String title, String director, int year,
double rating) {
MovieNode newNode = new MovieNode(title, director, year, rating);
if (head == null) {
head = tail = newNode;
} else {
newNode.next = head;
head.prev = newNode;
head = newNode;
}
}
public void addAtEnd(String title, String director, int year, double
rating) {
MovieNode newNode = new MovieNode(title, director, year, rating);
if (tail == null) {
head = tail = newNode;
} else {
tail.next = newNode;
newNode.prev = tail;
tail = newNode;
}
}
public void addAtPosition(String title, String director, int year,
double rating, int position) {
if (position <= 1) {
addAtBeginning(title, director, year, rating);
return;
}
MovieNode newNode = new MovieNode(title, director, year, rating);
MovieNode current = head;
int index = 1;
while (current != null && index < position - 1) {
current = current.next;
index++;
}
if (current == null || current.next == null) {
addAtEnd(title, director, year, rating);
} else {
newNode.next = current.next;
newNode.prev = current;
current.next.prev = newNode;
current.next = newNode;
}
}
public void removeByTitle(String title) {
MovieNode current = head;
while (current != null) {
if (current.title.equalsIgnoreCase(title)) {
if (current == head) {
head = current.next;
if (head != null) head.prev = null;
} else if (current == tail) {
tail = current.prev;
if (tail != null) tail.next = null;
} else {
current.prev.next = current.next;
current.next.prev = current.prev;
}
System.out.println("Movie removed: " + title);
return;
}
current = current.next;
}
System.out.println("Movie not found: " + title);
}
public void searchByDirector(String director) {
MovieNode current = head;
boolean found = false;
while (current != null) {
if (current.director.equalsIgnoreCase(director)) {
printMovie(current);
found = true;
}
current = current.next;
}
if (!found) System.out.println("No movies found by Director: " +
director);
}
public void searchByRating(double rating) {
MovieNode current = head;
boolean found = false;
while (current != null) {
if (current.rating == rating) {
printMovie(current);
found = true;
}
current = current.next;
}
if (!found) System.out.println("No movies found with Rating: " +
rating);
}
public void displayForward() {
MovieNode current = head;
if (current == null) {
System.out.println("No movies in the list.");
return;
}
System.out.println("Movies in Forward Order:");
while (current != null) {
printMovie(current);
current = current.next;
}
}
public void displayReverse() {
MovieNode current = tail;
if (current == null) {
System.out.println("No movies in the list.");
return;
}
System.out.println("Movies in Reverse Order:");
while (current != null) {
printMovie(current);
current = current.prev;
}
}
public void updateRating(String title, double newRating) {
MovieNode current = head;
while (current != null) {
if (current.title.equalsIgnoreCase(title)) {
current.rating = newRating;
System.out.println("Updated rating for " + title + " to " +
newRating);
return;
}
current = current.next;
}
System.out.println("Movie not found: " + title);
}
private void printMovie(MovieNode movie) {
System.out.println("Title: " + movie.title + ", Director: " +
movie.director +
", Year: " + movie.year + ", Rating: " + movie.rating);
}
}
public class MovieManagementSystem {
public static void main(String[] args) {
MovieList movieList = new MovieList();
movieList.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
movieList.addAtBeginning("The Shawshank Redemption", "Frank
Darabont", 1994, 9.3);
movieList.addAtPosition("Interstellar", "Christopher Nolan", 2014,
8.6, 2);
movieList.displayForward();
System.out.println();
movieList.displayReverse();
System.out.println("\nSearch by Director:");
movieList.searchByDirector("Christopher Nolan");
System.out.println("\nSearch by Rating:");
movieList.searchByRating(9.3);
System.out.println("\nUpdating Rating:");
movieList.updateRating("Inception", 9.0);
System.out.println("\nRemoving a Movie:");
movieList.removeByTitle("Interstellar");
System.out.println("\nFinal List:");
movieList.displayForward();
}
}