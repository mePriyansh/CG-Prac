abstract class Patient {
private String patientId;
private String name;
private int age;
public Patient(String id, String name, int age) {
this.patientId = id;
this.name = name;
this.age = age;
}
public abstract double calculateBill();
public void getPatientDetails() {
System.out.println(patientId + ": " + name + ", Age: " + age);
}
}
interface MedicalRecord {
void addRecord(String record);
String viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
public InPatient(String id, String name, int age) {
super(id, name, age);
}
public double calculateBill() {
return 5000;
}
public void addRecord(String record) {}
public String viewRecords() {
return "Records";
}
}
class OutPatient extends Patient implements MedicalRecord {
public OutPatient(String id, String name, int age) {
super(id, name, age);
}
public double calculateBill() {
return 1000;
}
public void addRecord(String record) {}
public String viewRecords() {
return "Records";
}
}