class Ticket {
String ticketId;
String customerName;
String movieName;
String seatNumber;
String bookingTime;
Ticket next;
public Ticket(String ticketId, String customerName, String movieName,
String seatNumber, String bookingTime) {
this.ticketId = ticketId;
this.customerName = customerName;
this.movieName = movieName;
this.seatNumber = seatNumber;
this.bookingTime = bookingTime;
}
}
class TicketReservationSystem {
private Ticket head = null;
private Ticket tail = null;
public void addTicket(String ticketId, String customerName, String
movieName, String seatNumber, String bookingTime) {
Ticket newTicket = new Ticket(ticketId, customerName, movieName,
seatNumber, bookingTime);
if (head == null) {
head = newTicket;
tail = newTicket;
newTicket.next = head;
} else {
tail.next = newTicket;
tail = newTicket;
tail.next = head;
}
}
public void removeTicket(String ticketId) {
if (head == null) return;
Ticket current = head;
Ticket prev = tail;
do {
if (current.ticketId.equals(ticketId)) {
if (current == head && current == tail) {
head = null;
tail = null;
} else {
prev.next = current.next;
if (current == head) head = head.next;
if (current == tail) tail = prev;
}
return;
}
prev = current;
current = current.next;
} while (current != head);
}
public void displayTickets() {
if (head == null) {
System.out.println("No tickets booked.");
return;
}
Ticket current = head;
do {
System.out.println("Ticket ID: " + current.ticketId + ",
Customer: " + current.customerName +
", Movie: " + current.movieName + ", Seat: " +
current.seatNumber + ", Time: " + current.bookingTime);
current = current.next;
} while (current != head);
}
public void searchTicket(String keyword) {
if (head == null) {
System.out.println("No tickets booked.");
return;
}
Ticket current = head;
boolean found = false;
do {
if (current.customerName.equalsIgnoreCase(keyword) ||
current.movieName.equalsIgnoreCase(keyword)) {
System.out.println("Found Ticket -> ID: " +
current.ticketId + ", Customer: " + current.customerName +
", Movie: " + current.movieName + ", Seat: " +
current.seatNumber + ", Time: " + current.bookingTime);
found = true;
}
current = current.next;
} while (current != head);
if (!found) System.out.println("No ticket found for: " + keyword);
}
public void countTickets() {
if (head == null) {
System.out.println("Total tickets: 0");
return;
}
int count = 0;
Ticket current = head;
do {
count++;
current = current.next;
} while (current != head);
System.out.println("Total tickets: " + count);
}
}
public class TicketBookingDemo {
public static void main(String[] args) {
TicketReservationSystem system = new TicketReservationSystem();
system.addTicket("T001", "Alice", "Interstellar", "A1", "10:00
AM");
system.addTicket("T002", "Bob", "Inception", "B2", "11:00 AM");
system.addTicket("T003", "Charlie", "Interstellar", "C3", "12:00
PM");
system.displayTickets();
system.searchTicket("Interstellar");
system.searchTicket("Diana");
system.countTickets();
system.removeTicket("T002");
system.displayTickets();
system.countTickets();
}
}