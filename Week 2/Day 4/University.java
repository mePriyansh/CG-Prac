import java.util.*;
class University {
List<Department> departments = new ArrayList<>();
List<Faculty> faculties = new ArrayList<>();
void addDepartment(Department d) {
departments.add(d);
}
void addFaculty(Faculty f) {
faculties.add(f);
}
}
class Department {
String name;
Department(String name) {
this.name = name;
}
}
class Faculty {
String name;
Faculty(String name) {
this.name = name;
}
}