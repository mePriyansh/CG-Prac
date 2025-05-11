
import java.util.Scanner;
public class NumberFormatDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to convert to number: ");
        String input = scanner.next();
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }
        handleException(input);
        scanner.close();
    }
}

