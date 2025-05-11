public class SearchWordInSentences {
public static String findSentenceContainingWord(String[] sentences,
String word) {
for (String sentence : sentences) {
if (sentence.contains(word)) {
return sentence;
}
}
return "Not Found"; // No sentence contains the word
}
}