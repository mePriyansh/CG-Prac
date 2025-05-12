import java.util.*;
import java.io.*;
public class WordFrequencyCounter {
public static void countWordFrequency(String text) {
String[] words = text.split("\\W+");
Map<String, Integer> wordCount = new HashMap<>();
for (String word : words) {
word = word.toLowerCase();
wordCount.put(word, wordCount.getOrDefault(word, 0)
+ 1);
}
15
System.out.println(wordCount);
}
public static void main(String[] args) {
String text = "Hello world, hello Java!";
countWordFrequency(text);
}
}