import java.io.*;
import java.util.ArrayList;
import java.util.List;
5
class Employee implements Serializable {
int id;
String name;
String department;
double salary;
public Employee(int id, String name, String department,
double salary) {
this.id = id;
this.name = name;
this.department = department;
this.salary = salary;
}
@Override
public String toString() {
return "Employee{id=" + id + ", name='" + name +
"', department='" + department + "', salary=" + salary +
"}";
}
}
public class EmployeeSerialization {
public static void main(String[] args) {
List<Employee> employees = new ArrayList<>();
employees.add(new Employee(1, "John Doe",
"Engineering", 50000));
employees.add(new Employee(2, "Jane Smith",
"Marketing", 45000));
try (ObjectOutputStream out = new
ObjectOutputStream(new FileOutputStream("employees.ser")))
{
out.writeObject(employees);
System.out.println("Employees saved.");
} catch (IOException e) {
6
e.printStackTrace();
}
try (ObjectInputStream in = new
ObjectInputStream(new FileInputStream("employees.ser"))) {
List<Employee> deserializedEmployees =
(List<Employee>) in.readObject();
System.out.println("Employees retrieved:");
deserializedEmployees.forEach(System.out::println);
} catch (IOException | ClassNotFoundException e) {
e.printStackTrace();
}
}
}
