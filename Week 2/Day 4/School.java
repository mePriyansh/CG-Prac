import java.util.*;
class School {
List<Student> students = new ArrayList<>();
void addStudent(Student student) {
students.add(student);
}
}
class Student {
String name;
List<Course> courses = new ArrayList<>();
Student(String name) {
this.name = name;
}
void enroll(Course c) {
courses.add(c);
c.students.add(this);
}
}
class Course {
String title;
List<Student> students = new ArrayList<>();
Course(String title) {
this.title = title;
}
}
