
import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names, int index) {
        String name = names[index];
    }
    public static void handleException(String[] names, int index) {
        try {
            String name = names[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in generateException: " + e.getMessage());
        }
        handleException(names, index);
        scanner.close();
    }
}

