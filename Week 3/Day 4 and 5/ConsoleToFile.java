import java.io.*;
public class ConsoleToFile {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new
FileWriter("output.txt"));
String line;
while (!(line = br.readLine()).equals("exit")) {
bw.write(line);
bw.newLine();
}
br.close();
bw.close();
}
}