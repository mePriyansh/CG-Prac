abstract class Employee {
private String employeeId;
private String name;
private double baseSalary;
public Employee(String employeeId, String name, double baseSalary) {
this.employeeId = employeeId;
this.name = name;
this.baseSalary = baseSalary;
}
public abstract double calculateSalary();
public void displayDetails() {
System.out.println("ID: " + employeeId + ", Name: " + name + ",
Salary: " + calculateSalary());
}
public String getEmployeeId() { return employeeId; }
public void setEmployeeId(String employeeId) { this.employeeId =
employeeId; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public double getBaseSalary() { return baseSalary; }
public void setBaseSalary(double baseSalary) { this.baseSalary =
baseSalary; }
}
interface Department {
void assignDepartment(String dept);
String getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department {
private String department;
public FullTimeEmployee(String id, String name, double salary) {
super(id, name, salary);
}
public double calculateSalary() {
return getBaseSalary();
}
public void assignDepartment(String dept) {
this.department = dept;
}
public String getDepartmentDetails() {
return department;
}
}
class PartTimeEmployee extends Employee implements Department {
private int hoursWorked;
private double hourlyRate;
private String department;
public PartTimeEmployee(String id, String name, int hours, double rate)
{
super(id, name, 0);
this.hoursWorked = hours;
this.hourlyRate = rate;
}
public double calculateSalary() {
return hoursWorked * hourlyRate;
}
public void assignDepartment(String dept) {
this.department = dept;
}
public String getDepartmentDetails() {
return department;
}
}
