
import java.util.Scanner;
public class CharArrayComparison {
    public static char[] getCharsManually(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        char[] manualChars = getCharsManually(input);
        char[] builtInChars = input.toCharArray();
        boolean areEqual = compareCharArrays(manualChars, builtInChars);
        System.out.print("Manual Char Array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }
        System.out.print("\nBuilt-in Char Array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println("\nAre both char arrays equal: " + areEqual);
        scanner.close();
    }
}

