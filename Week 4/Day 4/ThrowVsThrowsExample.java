public class ThrowVsThrowsExample {
 public static void calculateInterest(double amount, double rate,
int years) throws IllegalArgumentException {
 if (amount < 0 || rate < 0) {
 throw new IllegalArgumentException("Invalid input: Amount
and rate must be positive");
 }
 double interest = amount * rate * years / 100;
 System.out.println("Calculated interest: " + interest);
 }
 public static void main(String[] args) {
 try {
 calculateInterest(1000, -5, 2);
 } catch (IllegalArgumentException e) {
 System.out.println(e.getMessage());
 }
 }
}

