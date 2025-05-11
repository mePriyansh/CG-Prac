import java.io.*;
public class WordCount {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new
FileReader("example.txt"));
String word = "target";
int count = 0;
String line;
while ((line = br.readLine()) != null) {
String[] words = line.split("\\s+");
for (String w : words) {
if (w.equals(word)) count++;
}
}
br.close();
System.out.println("Occurrences: " + count);
}
}