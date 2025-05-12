abstract class JobRole {
String roleName;
JobRole(String roleName) {
this.roleName = roleName;
}
abstract void displayRole();
}
class SoftwareEngineer extends JobRole {
SoftwareEngineer() {
super("Software Engineer");
}
void displayRole() {
System.out.println("Job Role: " + roleName);
}
}
class DataScientist extends JobRole {
DataScientist() {
super("Data Scientist");
}
void displayRole() {
System.out.println("Job Role: " + roleName);
}
}
class ProductManager extends JobRole {
ProductManager() {
super("Product Manager");
}
void displayRole() {
System.out.println("Job Role: " + roleName);
}
}
class Resume<T extends JobRole> {
13
T jobRole;
Resume(T jobRole) {
this.jobRole = jobRole;
}
void displayResume() {
jobRole.displayRole();
}
}
public class ResumeScreening {
public static void main(String[] args) {
Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new
SoftwareEngineer());
Resume<DataScientist> dataScientistResume = new Resume<>(new
DataScientist());
Resume<ProductManager> productManagerResume = new Resume<>(new
ProductManager());
softwareEngineerResume.displayResume();
dataScientistResume.displayResume();
productManagerResume.displayResume();
}
}