import java.util.Scanner;
public class FinallyBlockExample {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 try {
 System.out.print("Enter numerator: ");
 int numerator = scanner.nextInt();
 System.out.print("Enter denominator: ");
 int denominator = scanner.nextInt();
 System.out.println("Result: " + (numerator /
denominator));
 } catch (ArithmeticException e) {
 System.out.println("Cannot divide by zero.");
 } finally {
 System.out.println("Operation completed");
 }
 }
}
