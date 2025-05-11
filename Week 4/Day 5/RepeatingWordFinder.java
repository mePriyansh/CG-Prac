
import java.util.regex.*;
import java.util.*;

public class RepeatingWordFinder {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b\\s+\\1\\b", Pattern.CASE_INSENSITIVE).matcher(text);
        Set<String> found = new LinkedHashSet<>();
        while (matcher.find()) {
            found.add(matcher.group(1));
        }
        for (String word : found) {
            System.out.println(word);
        }
    }
}

