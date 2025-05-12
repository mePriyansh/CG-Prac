import java.io.*;
import java.util.*;
public class WordCountInFile {
public static void main(String[] args) {
String fileName = "textfile.txt";
Map<String, Integer> wordCount = new HashMap<>();
try (BufferedReader reader = new BufferedReader(new
FileReader(fileName))) {
String line;
while ((line = reader.readLine()) != null) {
String[] words = line.split("\\s+");
for (String word : words) {
word =
word.toLowerCase().replaceAll("[^a-zA-Z]", "");
wordCount.put(word,
wordCount.getOrDefault(word, 0) + 1);
}
15
}
wordCount.entrySet()
.stream()
.sorted((entry1, entry2) ->
entry2.getValue() - entry1.getValue())
.limit(5)
.forEach(entry ->
System.out.println(entry.getKey() + ": " +
entry.getValue()));
} catch (IOException e) {
e.printStackTrace();
}
}
}
