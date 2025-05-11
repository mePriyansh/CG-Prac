abstract class VehicleRide {
private String vehicleId;
private String driverName;
private double ratePerKm;
public VehicleRide(String id, String name, double rate) {
this.vehicleId = id;
this.driverName = name;
this.ratePerKm = rate;
}
public abstract double calculateFare(double distance);
public void getVehicleDetails() {
System.out.println(vehicleId + " driven by " + driverName);
}
}
interface GPS {
String getCurrentLocation();
void updateLocation(String location);
}
class CarRide extends VehicleRide implements GPS {
public CarRide(String id, String name, double rate) {
super(id, name, rate);
}
public double calculateFare(double distance) {
return distance * 10;
}
public String getCurrentLocation() {
return "Location";
}
public void updateLocation(String location) {}
}
class BikeRide extends VehicleRide implements GPS {
public BikeRide(String id, String name, double rate) {
super(id, name, rate);
}
public double calculateFare(double distance) {
return distance * 5;
}
public String getCurrentLocation() {
return "Location";
}
public void updateLocation(String location) {}
}
class AutoRide extends VehicleRide implements GPS {
public AutoRide(String id, String name, double rate) {
super(id, name, rate);
}
public double calculateFare(double distance) {
return distance * 7;
}
public String getCurrentLocation() {
return "Location";
}
public void updateLocation(String location) {}
}