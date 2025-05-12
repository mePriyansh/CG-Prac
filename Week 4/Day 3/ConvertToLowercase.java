import java.io.*;
public class ConvertToLowercase {
public static void main(String[] args) {
try (BufferedReader reader = new BufferedReader(new
FileReader("input.txt"));
BufferedWriter writer = new BufferedWriter(new
FileWriter("output.txt"))) {
String line;
while ((line = reader.readLine()) != null) {
writer.write(line.toLowerCase());
writer.newLine();
}
System.out.println("Content converted to
lowercase and saved.");
} catch (IOException e) {
e.printStackTrace();
}
}
}
