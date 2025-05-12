import java.util.Scanner;
public class NestedTryCatchExample {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int[] array = {10, 20, 30};
 System.out.print("Enter index: ");
 int index = scanner.nextInt();
 try {
 int value = array[index];
 try {
 System.out.print("Enter divisor: ");
 int divisor = scanner.nextInt();
 System.out.println("Result: " + (value / divisor));
 } catch (ArithmeticException e) {
 System.out.println("Cannot divide by zero!");
 }
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Invalid array index!");
 }
 }
}
