public class Employee {
public String employeeID;
protected String department;
private double salary;
public Employee(String employeeID, String department, double salary) {
this.employeeID = employeeID;
this.department = department;
this.salary = salary;
}
public double getSalary() {
return salary;
}
public void modifySalary(double newSalary) {
if (newSalary > 0) {
salary = newSalary;
}
}
}
class Manager extends Employee {
private String team;
public Manager(String employeeID, String department, double salary,
String team) {
super(employeeID, department, salary);
this.team = team;
}
public void displayManagerDetails() {
System.out.println("Employee ID: " + employeeID);
System.out.println("Department: " + department);
System.out.println("Salary: " + getSalary());
System.out.println("Team: " + team);
}
}