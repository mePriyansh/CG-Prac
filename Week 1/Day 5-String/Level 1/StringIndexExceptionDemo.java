
import java.util.Scanner;
public class StringIndexExceptionDemo {
    public static void generateException(String input) {
        char ch = input.charAt(input.length());
    }
    public static void handleException(String input) {
        try {
            char ch = input.charAt(input.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }
        handleException(input);
        scanner.close();
    }
}

