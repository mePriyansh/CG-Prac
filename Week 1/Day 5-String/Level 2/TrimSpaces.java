
import java.util.Scanner;
public class TrimSpaces {
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();
        int[] indices = trimSpaces(input);
        int start = indices[0];
        int end = indices[1];
        String trimmedText = createSubstring(input, start, end);
        String builtInTrimmed = input.trim();
        boolean isEqual = compareStrings(trimmedText, builtInTrimmed);
        System.out.println("Trimmed text (using charAt()): \"" + trimmedText + "\"");
        System.out.println("Trimmed text (using built-in trim()): \"" + builtInTrimmed + "\"");
        System.out.println("Are the trimmed strings equal? " + isEqual);
    scanner.close();
    }
}

