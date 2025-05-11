class Student {
static String universityName = "ABC University";
static int totalStudents = 0;
final int rollNumber;
String name;
String grade;
public Student(String name, String grade) {
this.rollNumber = ++totalStudents; // Automatically assigns unique
roll numbers
this.name = name;
this.grade = grade;
}
public static void displayTotalStudents() {
System.out.println("Total Students: " + totalStudents);
}
public void displayStudentDetails() {
if (this instanceof Student) {
System.out.println("University Name: " + universityName);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Name: " + name);
System.out.println("Grade: " + grade);
}
}
}
public class UniversitySystem {
public static void main(String[] args) {
Student student1 = new Student("John", "A");
student1.displayStudentDetails();
Student.displayTotalStudents();
}
}