import java.io.*;
public class ReadFile {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new
FileReader("example.txt"));
String line;
while ((line = br.readLine()) != null) {
System.out.println(line);
}
br.close();
}
}
