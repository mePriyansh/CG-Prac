import java.io.*;
public class UserInputToFile {
public static void main(String[] args) {
try (BufferedReader reader = new BufferedReader(new
InputStreamReader(System.in));
FileWriter writer = new
FileWriter("user_info.txt")) {
System.out.print("Enter your name: ");
String name = reader.readLine();
System.out.print("Enter your age: ");
String age = reader.readLine();
System.out.print("Enter your favorite
programming language: ");
String language = reader.readLine();
writer.write("Name: " + name + "\n");
writer.write("Age: " + age + "\n");
writer.write("Favorite Programming Language: "
4
+ language + "\n");
System.out.println("Information saved to
file.");
} catch (IOException e) {
e.printStackTrace();
}
}
}