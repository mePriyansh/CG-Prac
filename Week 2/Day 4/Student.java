import java.util.*;
class Student {
String name;
List<Course> courses = new ArrayList<>();
Student(String name) {
this.name = name;
}
void enrollCourse(Course c) {
courses.add(c);
c.students.add(this);
}
}
class Professor {
String name;
Professor(String name) {
this.name = name;
}
void assignCourse(Course c) {
c.professor = this;
}
}
class Course {
String title;
Professor professor;
List<Student> students = new ArrayList<>();
Course(String title) {
this.title = title;
}
}