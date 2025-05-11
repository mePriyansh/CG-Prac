
import java.util.Scanner;
public class LowerCaseConversion {
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String lowerBuiltIn = text.toLowerCase();
        String lowerManual = convertToLower(text);
        boolean isEqual = compareStrings(lowerBuiltIn, lowerManual);
        System.out.println("Manual Lowercase: " + lowerManual);
        System.out.println("Built-in Lowercase: " + lowerBuiltIn);
        System.out.println("Are both results equal? " + isEqual);
    scanner.close();}
}

