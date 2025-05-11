public class MovieTicket {
private String movieName;
private String seatNumber;
private double price;
public MovieTicket(String movieName) {
this.movieName = movieName;
this.seatNumber = "Not Booked";
this.price = 0.0;
}
public void bookTicket(String seatNumber, double price) {
this.seatNumber = seatNumber;
this.price = price;
}
public void displayTicketDetails() {
System.out.println("Movie Name: " + movieName);
System.out.println("Seat Number: " + seatNumber);
System.out.println("Price: $" + price);
}
public static void main(String[] args) {
MovieTicket ticket1 = new MovieTicket("Inception");
ticket1.bookTicket("A12", 15.50);
ticket1.displayTicketDetails();
}
}