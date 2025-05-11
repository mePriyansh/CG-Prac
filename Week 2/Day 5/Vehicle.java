class Vehicle {
int maxSpeed;
String fuelType;
Vehicle(int maxSpeed, String fuelType) {
this.maxSpeed = maxSpeed;
this.fuelType = fuelType;
}
void displayInfo() {
System.out.println("Max Speed: " + maxSpeed + " km/h");
System.out.println("Fuel Type: " + fuelType);
}
}
class Car extends Vehicle {
int seatCapacity;
Car(int maxSpeed, String fuelType, int seatCapacity) {
super(maxSpeed, fuelType);
this.seatCapacity = seatCapacity;
}
void displayInfo() {
super.displayInfo();
System.out.println("Seat Capacity: " + seatCapacity);
}
}
class Truck extends Vehicle {
double loadCapacity;
Truck(int maxSpeed, String fuelType, double loadCapacity) {
super(maxSpeed, fuelType);
this.loadCapacity = loadCapacity;
}
void displayInfo() {
super.displayInfo();
System.out.println("Load Capacity: " + loadCapacity + " tons");
}
}
class Motorcycle extends Vehicle {
boolean hasSideCar;
Motorcycle(int maxSpeed, String fuelType, boolean hasSideCar) {
super(maxSpeed, fuelType);
this.hasSideCar = hasSideCar;
}
void displayInfo() {
super.displayInfo();
System.out.println("Has Sidecar: " + (hasSideCar ? "Yes" : "No"));
}
}