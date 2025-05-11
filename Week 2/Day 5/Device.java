class Device {
String deviceId;
String status;
Device(String deviceId, String status) {
this.deviceId = deviceId;
this.status = status;
}
void displayStatus() {
System.out.println("Device ID: " + deviceId);
System.out.println("Status: " + status);
}
}
class Thermostat extends Device {
double temperatureSetting;
Thermostat(String deviceId, String status, double temperature) {
super(deviceId, status);
this.temperatureSetting = temperature;
}
void displayStatus() {
super.displayStatus();
System.out.println("Temperature Setting: " + temperatureSetting);
}
}
