class Vehicle {
static double registrationFee = 100.0;
final String registrationNumber;
String ownerName;
String vehicleType;
public Vehicle(String ownerName, String vehicleType, String
registrationNumber) {
this.ownerName = ownerName;
this.vehicleType = vehicleType;
this.registrationNumber = registrationNumber;
}
public static void updateRegistrationFee(double newFee) {
registrationFee = newFee;
}
public void displayVehicleDetails() {
if (this instanceof Vehicle) {
System.out.println("Vehicle Type: " + vehicleType);
System.out.println("Owner Name: " + ownerName);
System.out.println("Registration Number: " +
registrationNumber);
System.out.println("Registration Fee: $" + registrationFee);
}
}
}
public class VehicleRegistrationSystem {
public static void main(String[] args) {
Vehicle vehicle1 = new Vehicle("Jane Doe", "Sedan", "XYZ123");
vehicle1.displayVehicleDetails();
Vehicle.updateRegistrationFee(120.0);
vehicle1.displayVehicleDetails();
}
}