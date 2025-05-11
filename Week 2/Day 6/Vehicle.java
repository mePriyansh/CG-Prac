abstract class Vehicle {
private String vehicleNumber;
private String type;
private double rentalRate;
public Vehicle(String number, String type, double rate) {
this.vehicleNumber = number;
this.type = type;
this.rentalRate = rate;
}
public abstract double calculateRentalCost(int days);
public String getVehicleNumber() { return vehicleNumber; }
public void setVehicleNumber(String number) { this.vehicleNumber =
number; }
public String getType() { return type; }
public void setType(String type) { this.type = type; }
public double getRentalRate() { return rentalRate; }
public void setRentalRate(double rentalRate) { this.rentalRate =
rentalRate; }
}
interface Insurable {
double calculateInsurance();
String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
public Car(String number, double rate) {
super(number, "Car", rate);
}
public double calculateRentalCost(int days) {
return getRentalRate() * days;
}
public double calculateInsurance() {
return 1000;
}
public String getInsuranceDetails() {
return "Car insurance: ₹1000";
}
}
class Bike extends Vehicle implements Insurable {
public Bike(String number, double rate) {
super(number, "Bike", rate);
}
public double calculateRentalCost(int days) {
return getRentalRate() * days;
}
public double calculateInsurance() {
return 300;
}
public String getInsuranceDetails() {
return "Bike insurance: ₹300";
}
}
class Truck extends Vehicle implements Insurable {
public Truck(String number, double rate) {
super(number, "Truck", rate);
}
public double calculateRentalCost(int days) {
return getRentalRate() * days * 1.2;
}
public double calculateInsurance() {
return 2000;
}
public String getInsuranceDetails() {
return "Truck insurance: ₹2000";
}
}