import java.io.*;
public class ByteToChar {
public static void main(String[] args) throws IOException {
InputStreamReader isr = new InputStreamReader(new
FileInputStream("example.txt"), "UTF-8");
BufferedReader br = new BufferedReader(isr);
String line;
while ((line = br.readLine()) != null) {
System.out.println(line);
}
br.close();
}
}