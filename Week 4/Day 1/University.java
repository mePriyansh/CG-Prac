abstract class CourseType {
String courseName;
CourseType(String courseName) {
this.courseName = courseName;
}
abstract void displayCourseInfo();
}
class ExamCourse extends CourseType {
ExamCourse(String courseName) {
super(courseName);
}
void displayCourseInfo() {
System.out.println("Exam-Based Course: " + courseName);
}
}
class AssignmentCourse extends CourseType {
AssignmentCourse(String courseName) {
super(courseName);
}
void displayCourseInfo() {
System.out.println("Assignment-Based Course: " + courseName);
}
}
class ResearchCourse extends CourseType {
ResearchCourse(String courseName) {
9
super(courseName);
}
void displayCourseInfo() {
System.out.println("Research-Based Course: " + courseName);
}
}
class UniversityCourse<T extends CourseType> {
private List<T> courses = new ArrayList<>();
void addCourse(T course) {
courses.add(course);
}
void displayCourses() {
for (T course : courses) {
course.displayCourseInfo();
}
}
}
public class University {
public static void main(String[] args) {
UniversityCourse<CourseType> courseCatalog = new
UniversityCourse<>();
courseCatalog.addCourse(new ExamCourse("Mathematics 101"));
courseCatalog.addCourse(new AssignmentCourse("History 101"));
courseCatalog.addCourse(new ResearchCourse("Physics 101"));
courseCatalog.displayCourses();
}
}