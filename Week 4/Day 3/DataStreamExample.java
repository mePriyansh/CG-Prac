import java.io.*;
public class DataStreamExample {
public static void main(String[] args) {
try (DataOutputStream dos = new
DataOutputStream(new FileOutputStream("student_data.dat")))
{
dos.writeInt(1); // Roll number
dos.writeUTF("John Doe");
dos.writeDouble(3.75);
System.out.println("Student data saved.");
} catch (IOException e) {
e.printStackTrace();
}
10
try (DataInputStream dis = new DataInputStream(new
FileInputStream("student_data.dat"))) {
int rollNumber = dis.readInt();
String name = dis.readUTF();
double gpa = dis.readDouble();
System.out.println("Student data retrieved:");
System.out.println("Roll Number: " +
rollNumber);
System.out.println("Name: " + name);
System.out.println("GPA: " + gpa)
} catch (IOException e) {
e.printStackTrace();
}
}
}
