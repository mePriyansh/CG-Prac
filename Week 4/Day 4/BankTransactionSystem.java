class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
 super(message);
 }
}
public class BankTransactionSystem {
 private double balance = 1000;
 public void withdraw(double amount) throws
InsufficientBalanceException {
 if (amount < 0) {
 throw new IllegalArgumentException("Invalid amount!");
 }
 if (amount > balance) {
 throw new InsufficientBalanceException("Insufficient
balance!");
 }
 balance -= amount;
 System.out.println("Withdrawal successful, new balance: " +
balance);
11
 }
 public static void main(String[] args) {
 BankTransactionSystem bank = new BankTransactionSystem();
 try {
 bank.withdraw(1500);
 } catch (InsufficientBalanceException e) {
 System.out.println(e.getMessage());
 } catch (IllegalArgumentException e) {
 System.out.println(e.getMessage());
 }
 }
}