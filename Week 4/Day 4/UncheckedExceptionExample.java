import java.util.*;
public class UncheckedExceptionExample {
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
 } catch (InputMismatchException e) {
 System.out.println("Please enter valid numbers.");
 }
 }
2
}