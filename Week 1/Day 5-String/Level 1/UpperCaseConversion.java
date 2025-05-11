
import java.util.Scanner;
public class UpperCaseConversion {
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
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
        String upperBuiltIn = text.toUpperCase();
        String upperManual = convertToUpper(text);
        boolean isEqual = compareStrings(upperBuiltIn, upperManual);
        System.out.println("Manual Uppercase: " + upperManual);
        System.out.println("Built-in Uppercase: " + upperBuiltIn);
        System.out.println("Are both results equal? " + isEqual);
   
        scanner.close();}
}

