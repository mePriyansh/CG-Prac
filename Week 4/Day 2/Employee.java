import java.util.*;
class Employee {
String name;
String department;
public Employee(String name, String department) {
this.name = name;
this.department = department;
}
@Override
public String toString() {
return name;
}
}
public class GroupByDepartment {
public static Map<String, List<Employee>>
groupByDepartment(List<Employee> employees) {
Map<String, List<Employee>> departmentMap = new
HashMap<>();
for (Employee employee : employees) {
departmentMap.computeIfAbsent(employee.department, k
-> new ArrayList<>()).add(employee);
}
return departmentMap;
}
public static void main(String[] args) {
19
List<Employee> employees = Arrays.asList(
new Employee("Alice", "HR"),
new Employee("Bob", "IT"),
new Employee("Carol", "HR")
);
System.out.println(groupByDepartment(employees)); //
Output: {HR=[Alice, Carol], IT=[Bob]}
}
}