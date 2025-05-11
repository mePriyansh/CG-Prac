class Patient {
static String hospitalName = "City Hospital";
static int totalPatients = 0;
final int patientID;
String name;
String ailment;
public Patient(String name, String ailment) {
this.patientID = ++totalPatients;
this.name = name;
this.ailment = ailment;
}
public static void getTotalPatients() {
System.out.println("Total Patients: " + totalPatients);
}
public void displayPatientDetails() {
if (this instanceof Patient) {
System.out.println("Hospital Name: " + hospitalName);
System.out.println("Patient ID: " + patientID);
System.out.println("Name: " + name);
System.out.println("Ailment: " + ailment);
}
}
}
public class HospitalSystem {
public static void main(String[] args) {
Patient patient1 = new Patient("Mark", "Fever");
patient1.displayPatientDetails();
Patient.getTotalPatients();
}
}