import java.util.*;
class Company {
List<Department> departments = new ArrayList<>();
void addDepartment(Department d) {
departments.add(d);
}
}
class Department {
List<Employee> employees = new ArrayList<>();
void addEmployee(Employee e) {
employees.add(e);
}
}
class Employee {
String name;
Employee(String name) {
this.name = name;
}
}