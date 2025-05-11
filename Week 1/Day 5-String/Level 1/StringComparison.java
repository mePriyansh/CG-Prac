
import java.util.Scanner;
public class StringComparison {
    public static boolean compareUsingCharAt(String str1, String str2) {
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
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        boolean resultUsingCharAt = compareUsingCharAt(str1, str2);
        boolean resultUsingEquals = str1.equals(str2);
        System.out.println("\nComparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods returned the same result.");
        } else {
            System.out.println("Mismatch between charAt() comparison and equals() method.");
        }
        scanner.close();
    }
}

