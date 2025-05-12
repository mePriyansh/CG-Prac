import java.io.*;
public class FileReadWrite {
public static void main(String[] args) {
String sourceFile = "source.txt";
String destFile = "destination.txt";
try (FileInputStream fis = new
FileInputStream(sourceFile);
FileOutputStream fos = new
FileOutputStream(destFile)) {
int content;
while ((content = fis.read()) != -1) {
fos.write(content);
}
System.out.println("File copied
successfully.");
} catch (IOException e) {
System.out.println("An error occurred: " +
1
e.getMessage());
}
}
}
