public class CarRental {
private String customerName;
private String carModel;
private int rentalDays;
private double dailyRate;
public CarRental() {
this("Unknown", "Standard", 1, 50.0);
}
public CarRental(String customerName, String carModel, int rentalDays,
double dailyRate) {
this.customerName = customerName;
this.carModel = carModel;
this.rentalDays = rentalDays;
this.dailyRate = dailyRate;
}
public double calculateTotalCost() {
return rentalDays * dailyRate;
}
}
