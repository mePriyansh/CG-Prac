public class Employee {
private String name;
private int id;
private double salary;
public Employee(String name, int id, double salary) {
this.name = name;
this.id = id;
this.salary = salary;
}
public void displayDetails() {
System.out.println("Name: " + name);
System.out.println("ID: " + id);
System.out.println("Salary: $" + salary);
}
public static void main(String[] args) {
Employee emp1 = new Employee("John Doe", 1001, 55000.0);
emp1.displayDetails();
}
}